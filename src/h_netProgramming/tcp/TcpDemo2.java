package h_netProgramming.tcp;
import java.io.*;
import java.net.*;
/*
演示tcp的传输的客户端和服务端的互访。

需求：客户端给服务端发送数据，服务端收到后，给客户端反馈信息。
 */

/*
客户端：
1，建立Socket服务，指定要连接的主机和端口。
2，获取socket流中的输出流。将数据写到该流中，通过网络发送给服务端。
3，获取socket流中的输入流，将服务端反馈的数据获取到，并打印。
4，关闭客户端资源。
 */
class TcpClient2
{

	public static void main(String[] args) throws Exception
	{
		//建立Socket服务
		Socket s = new Socket("192.168.137.1",10004);
		
		//获取输出流
		OutputStream out = s.getOutputStream();
		
		//写入
		out.write("服务端，你好".getBytes());
		
		//获取输入流
		InputStream in = s.getInputStream();
		
		//缓冲区
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		//打印
		System.out.println(new String(buf,0,len));
		
		s.close();
	}

}

class TcpServer2 
{

	public static void main(String[] args) throws Exception
	{
		//建立服务端
		ServerSocket ss = new ServerSocket(10004);
		
		//获取客户端对象
		Socket s = ss.accept();
		
		//获取ip
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		InputStream in = s.getInputStream();
		
		//缓冲区
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		
		//等待10秒
		Thread.sleep(10000);
		
		//获取输出流
		OutputStream out = s.getOutputStream();
		out.write("哥们收到，你也好".getBytes());
		
		ss.close();
		
		s.close();//关闭客户端
	}

}










