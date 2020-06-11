package h_netProgramming.udp;
import java.io.*;
import java.net.*;
/*
编写一个聊天程序。
有收数据的部分，和发数据的部分，
这两部分需要同时执行，
那就需要用到多线程技术。
一个线程控制收，一个线程控制发。

因为收和发动作是不一致的，所以要定义两个run方法。
而且这两个方法要封装到不同的类中。
 */

//发送线程
class Send implements Runnable
{
	//udp服务
	private DatagramSocket ds;
	public Send(DatagramSocket ds)
	{
		this.ds = ds;
	}
	
	@Override
	public void run()
	{
		try
		{
			//键盘录入
			BufferedReader bufr = 
					new BufferedReader(new InputStreamReader(System.in));
			
			String line = null;
			while((line=bufr.readLine())!=null)
			{
				if("886".equals(line))
					break;
				
				//数据包
				byte[] buf = line.getBytes();
				DatagramPacket dp = 
						new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.137.1"),10002);
				
				//发送
				ds.send(dp);
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException("发送端失败");
		}
	}
	
}

//接收线程
class Rece implements Runnable
{
	//upd服务
	private DatagramSocket ds;
	public Rece(DatagramSocket ds)
	{
		this.ds = ds;
	}
	
	@Override
	public void run()
	{
		try
		{
			while(true)
			{
				//数据包(缓冲区)
				byte[] buf = new byte[1024];
				DatagramPacket dp = 
						new DatagramPacket(buf,buf.length);
				
				ds.receive(dp);
				
				//获取发送端IP
				String ip = dp.getAddress().getHostAddress();
				//数据转为字符串
				String data = new String(dp.getData(),0,dp.getLength());
				
				System.out.println(ip+"::"+data);
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException("接收端失败");
		}
	}
}

public class ChatDemo
{

	public static void main(String[] args)throws Exception
	{
		//发送端
		DatagramSocket SendSocket = new DatagramSocket();
		//接收端
		DatagramSocket receSocket = new DatagramSocket(10002);
		
		new Thread(new Send(SendSocket)).start();
		new Thread(new Rece(receSocket)).start();
	}

}










