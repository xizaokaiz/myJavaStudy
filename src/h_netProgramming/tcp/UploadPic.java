package h_netProgramming.tcp;
/*
上传图片

客户端
1，服务端点
2，读取客户端已有的图片数据
3，通过scoket输出流将数据发给服务端
4，读取服务端反馈信息
5，关闭
 */
import java.io.*;
import java.net.*;
class PicClient
{

	public static void main(String[] args) throws Exception
	{
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
 */
class PicServer
{

	public static void main(String[] args) throws Exception
	{
		//服务单
		ServerSocket ss = new ServerSocket(10008);
		
		//获取客户端对象
		Socket s = ss.accept();
		
		//获取输入流
		InputStream in = s.getInputStream();
		
		FileOutputStream fos = new FileOutputStream("E:\\Test\\net\\TCP\\server.bmp");
		
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
		ss.close();

	}

}

