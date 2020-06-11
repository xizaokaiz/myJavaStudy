package h_netProgramming.udp;

import java.io.*;
import java.net.*;

/*
������������
 */
class UdpSend2
{

	public static void main(String[] args) throws Exception
	{
		//����udp����
		DatagramSocket ds = new DatagramSocket();
		
		//����¼�� 
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("886".equals(line))
				break;
			
			//����תΪ�ֽ�����
			byte[] buf = line.getBytes();
			
			//���ݰ�
			DatagramPacket dp = 
					new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.137.1"),10001);
			
			//����
			ds.send(dp);
		}
		ds.close();
	}

}

class UdpRece2 
{

	public static void main(String[] args) throws Exception
	{
		//����udp socket�������˵�
		DatagramSocket ds = new DatagramSocket(10001);
		
		while(true)
		{
			//���ݰ�(������)
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf,buf.length);
			
			//����
			ds.receive(dp);
			
			//��ȡIP
			String ip = dp.getAddress().getHostAddress();
			//��ȡ����
			String data = new String(dp.getData(),0,dp.getLength());
			
			System.out.println(ip+"::"+data);
		}
	}

}
















