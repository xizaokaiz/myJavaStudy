package h_netProgramming.udp;

import java.io.*;
import java.net.*;

/*
键盘输入聊天
 */
class UdpSend2
{

	public static void main(String[] args) throws Exception
	{
		//创建udp服务
		DatagramSocket ds = new DatagramSocket();
		
		//键盘录入 
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("886".equals(line))
				break;
			
			//数据转为字节数组
			byte[] buf = line.getBytes();
			
			//数据包
			DatagramPacket dp = 
					new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.137.1"),10001);
			
			//发送
			ds.send(dp);
		}
		ds.close();
	}

}

class UdpRece2 
{

	public static void main(String[] args) throws Exception
	{
		//创建udp socket，建立端点
		DatagramSocket ds = new DatagramSocket(10001);
		
		while(true)
		{
			//数据包(缓冲区)
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf,buf.length);
			
			//接收
			ds.receive(dp);
			
			//获取IP
			String ip = dp.getAddress().getHostAddress();
			//获取数据
			String data = new String(dp.getData(),0,dp.getLength());
			
			System.out.println(ip+"::"+data);
		}
	}

}
















