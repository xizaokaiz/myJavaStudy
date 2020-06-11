package h_netProgramming.tcp;
/*
客户端并发上传图片

客户端
1，服务端点
2，读取客户端已有的图片数据
3，通过scoket输出流将数据发给服务端
4，读取服务端反馈信息
5，关闭
 */
import java.io.*;
import java.net.*;
class PicClient_2
{

	public static void main(String[] args) throws Exception
	{
		
		//对上传的文件进行判断
		if(args.length!=1)
		{
			System.out.println("请选择一个jpg格式的图片");
			return ;
		}
		
		File file = new File(args[0]);
		if(!(file.exists()) && file.isFile())
		{
			System.out.println("该文件有问题，要么不存在，要么不是文件");
			return ;
		}
		
		if(!file.getName().endsWith(".jpg"))
		{
			System.out.println("图片格式错误，请重新选择");
			return ;
		}
		
		if(file.length()>1024*1024*5)
		{
			System.out.println("文件过大，没安好心");
			return ;
		}
		
		
		
		Socket s = new Socket("192.168.137.1",10008);
		
		//输入流
		FileInputStream fis = new FileInputStream("E:\\Test\\net\\TCP\\1.bmp");
		
		//获取输出流
		OutputStream out = s.getOutputStream();
		
		//缓冲区
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fis.read(buf))!=-1)
		{
			//写
			out.write(buf,0,len);
		}
		
		//告诉服务端数据已写完
		s.shutdownOutput();
		
		//获取输入流
		InputStream in = s.getInputStream();
		
		byte[] bufIn = new byte[1024];
		int num = in.read(bufIn);
		System.out.println(new String(bufIn,0,num));
		
		fis.close();
		s.close();
		

	}

}

/*
服务端

这个服务端有个局限性。当A客户端连接上以后，被服务端获取到，服务端执行具体流程。
这时B客户端连接，只有等待。
因为服务端还没有处理完A客户端的请求，还没有循环回来执行下一次accept方法。
所以暂时获取不到B客户端对象。

那么为了可以让多个客户端同时并发访问服务端，
服务端最好就是将每个客户端封装到一个单独的线程中，这样就可以同时处理多个客户端请求。

如何定义线程呢？
只要明确了每一个客户端要在服务端执行的代码即可，将该代码存入run方法中。
 */

class PicThread implements Runnable
{
	private Socket s;
	PicThread(Socket s)
	{
		this.s = s;
	}
	public void run()
	{
		//计数器
		int count = 1;
		//获取IP地址
		String ip = s.getInetAddress().getHostAddress();
		try
		{
			
			System.out.println(ip+"....connected");
			//获取输入流
			InputStream in = s.getInputStream();
			
			//路径
			File file = new File("E:\\Test\\net\\TCP\\server.bmp"+ip+"("+(count)+")"+".jpg");
			//重复文件自增文件名
			while(file.exists())
				file = new File("E:\\Test\\net\\TCP\\server.bmp"+ip+"("+(count++)+")"+".jpg");
			
			
			//目的
			FileOutputStream fos = new FileOutputStream(file);
			
			//缓冲区
			byte[] buf = new byte[1024];
			int len = 0;
			while((len=in.read())!=-1)
			{
				//写
				fos.write(buf,0,len);
			}
			
			OutputStream out = s.getOutputStream();
			
			out.write("上传成功".getBytes());
			
			fos.close();
			s.close();
		}
		catch(Exception e)
		{
			throw new RuntimeException(ip+"上传失败");
		}
	}
}

class PicServer_2
{

	public static void main(String[] args) throws Exception
	{
		//服务端
		ServerSocket ss = new ServerSocket(10008);
		
		while(true)
		{
			//获取客户端对象
			Socket s = ss.accept();
			
			//新客户端线程
			new Thread(new PicThread(s)).start();
		}
		
		
		
//		ss.close();

	}

}

