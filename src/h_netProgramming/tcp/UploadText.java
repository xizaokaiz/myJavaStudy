package h_netProgramming.tcp;

import java.io.*;
import java.net.*;

class TextClient 
{

	public static void main(String[] args) throws IOException
	{
		//建立socket服务
		Socket s = new Socket("192.168.137.1",10006);
		
		//源
		BufferedReader bufr = 
				new BufferedReader(new FileReader("E:\\Test\\net\\TCP\\IPDemo.java"));
		
		//目的,打印
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//时间戳
//		long time = System.currentTimeMillis();
//		out.println(time);
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			out.println(line);
		}
		
		//关闭客户端的输出流，相当于给流加入一个结束标记
		s.shutdownOutput();
		
		//定义结束标记
//		out.println("over");
		
		//输入流
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//读取一行
		String str = bufIn.readLine();
		System.out.println(str);
		
		bufr.close();
		
		s.close();

	}

}

class TextServer 
{

	public static void main(String[] args) throws Exception
	{
		//服务端
		ServerSocket ss = new ServerSocket(10006);
		
		//获取客户端对象
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		
		//输入流
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//目的
		PrintWriter out = new PrintWriter(new FileWriter("E:\\Test\\net\\TCP\\server.txt"),true);
		
		String line = null;
		
		while((line=bufIn.readLine())!=null)
		{
			//判断结束标记
//			if("over".equals(line))
//				break;

			out.print(line);
		}
		
		//打印提示
		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("上传成功");
		
		out.close();
		s.close();
		ss.close();

	}

}









