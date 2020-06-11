package h_netProgramming.tcp;
import java.io.*;
import java.net.*;
/*
tcp练习
需求：建立一个文本转换服务器。
客户端给服务端发送文本，服务端会将文本转成大写在返回给客户端。
而且客户端可以不断的进行文本转换。当客户端输入over时，转换就结束。

分析：
	客户端：
	既然是操作设备上的数据，那么久可以使用io技术，并按照io的操作规律来思考。
	源：键盘录入。
	目的：网络设备，网络输出流。
	而且操作的是文本数据。可以选择字符流。
	
步骤：
1，建立服务。
2，获取键盘录入。
3，将数据发给服务端。
4，获取服务端返回的大写数据。
5，结束，关资源。

都是文本数据可以使用字符流进行操作，同时提高效率，加入缓冲。
 */

/*
该例子出现的问题：
现象：客户端和服务端都在莫明的等待，这是为什么呢？
因为客户端和服务端都有阻塞式方法，这些方法没有读到结束标记，就会一直等，而导致两端都在等待。
 */
class TransClient
{

	public static void main(String[] args) throws Exception
	{
		//建立客户端
		Socket s = new Socket("192.168.137.1",10005);
		
		//源,定义读取键盘数据的流对象
		BufferedReader bufr = 
				new BufferedReader(new InputStreamReader(System.in));
		
		//定义目的，将数据写入到socket输出流，发给服务端
//		BufferedWriter bufOut = 
//				new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//替代上面这个
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//定义一个socket读取流，读取服务器返回的大写信息。
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			
//			//发送
//			bufOut.write(line);
//			//一行结束标记
//			bufOut.newLine();
//			bufOut.flush();
			
			//自动刷新
			out.println(line);
			
			//打印
			String str = bufIn.readLine();
			System.out.println("server:"+str);
		}
		
		bufr.close();
		s.close();
		
	}

}

/*
服务端：
源：socket读取流
目的：socket输出流
都是文本，装饰。
 */
class TransServer
{

	public static void main(String[] args) throws Exception
	{
		//建立服务端
		ServerSocket ss = new ServerSocket(10005);
		
		//获取客户端对象
		Socket s = ss.accept();
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		
		//读取socket读取流中的数据。
		BufferedReader bufIn = 
				new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		//目的,socket输出流。将大写数据写入到socket输出流，并发送给客户端。
//		BufferedWriter bufOut = 
//				new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		//替代上面这个
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		String line = null;
		while((line=bufIn.readLine())!=null)
		{
			System.out.println(line);
			
			//转为大写并发送
//			bufOut.write(line.toUpperCase());
			//一行结束标记
//			bufOut.newLine();
//			bufOut.flush();
			
			//自动刷新
			out.println(line.toUpperCase());
		}
		
		s.close();
		ss.close();
	}

}











