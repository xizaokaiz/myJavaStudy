package h_netProgramming.tcp;
/*
客户端并发登陆
客户端对这个用户名进行效验。

如果该用户存在，在服务端显示xxx，已登录。
并在客户端显示xxx，欢迎光临。

如果该用户存在，在服务端显示xxx，尝试登陆。
并在客户端显示xxx，该用户不存在。

最多登陆三次。
 */
import java.io.*;
import java.net.*;
class LoginClient 
{

	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("192.168.137.1",10008);
		
		//读取键盘录入
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		
		//目的
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//读取流
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		for(int x=0;x<3;x++)
		{
			//读取一行
			String line = bufr.readLine();
			//当读取到空
			if(line==null)
				break;
			//客户端打印
			out.print(line);
			
			//读取服务端返回信息
			String info = bufIn.readLine();
			System.out.println("info:"+info);
			//当读取到已登录信息
			if(info.contains("欢迎"))
				break;
		}
		
		bufr.close();
		s.close();
		

	}

}

class UserThread implements Runnable
{
	private Socket s;
	UserThread(Socket s)
	{
		this.s = s;
	}
	public void run()
	{
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"....connected");
		try
		{
			//三次效验
			for(int x=0;x<3;x++)
			{
				//读取流
				BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
				//读取用户名
				String name = bufIn.readLine();
				if(name==null)
					break;
				
				PrintWriter out = new PrintWriter(s.getOutputStream(),true);
				
				//读取用户名单
				BufferedReader bufr = new BufferedReader(new FileReader("E:\\demo_student_work\\src\\h_netProgramming\\user.txt"));
				String line = null;
				//标记
				boolean flag = false;
				while((line=bufr.readLine())!=null)
				{
					if(line.equals(name))
					{
						flag = true;
						break;
					}
				}
				if(flag)
				{
					System.out.println(name+",已登录");
					out.println(name+"欢迎光临");
					break;
				}
				else
				{
					System.out.println(name+"尝试登陆");
					out.println(name+"，用户名不存在");
				}
			}
			s.close();
			
		}
		catch(Exception e)
		{
			throw new RuntimeException(ip+"效验失败");		
		}
	}
}

class LoginServer
{

	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(10008);
		
		while(true)
		{
			Socket s = ss.accept();
			//启动线程
			new Thread(new UserThread(s)).start();
		}

	}

}






