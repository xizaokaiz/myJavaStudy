package h_netProgramming.udp;
import java.io.*;
import java.net.*;
/*
��дһ���������
�������ݵĲ��֣��ͷ����ݵĲ��֣�
����������Ҫͬʱִ�У�
�Ǿ���Ҫ�õ����̼߳�����
һ���߳̿����գ�һ���߳̿��Ʒ���

��Ϊ�պͷ������ǲ�һ�µģ�����Ҫ��������run������
��������������Ҫ��װ����ͬ�����С�
 */

//�����߳�
class Send implements Runnable
{
	//udp����
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
			//����¼��
			BufferedReader bufr = 
					new BufferedReader(new InputStreamReader(System.in));
			
			String line = null;
			while((line=bufr.readLine())!=null)
			{
				if("886".equals(line))
					break;
				
				//���ݰ�
				byte[] buf = line.getBytes();
				DatagramPacket dp = 
						new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.137.1"),10002);
				
				//����
				ds.send(dp);
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException("���Ͷ�ʧ��");
		}
	}
	
}

//�����߳�
class Rece implements Runnable
{
	//upd����
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
				//���ݰ�(������)
				byte[] buf = new byte[1024];
				DatagramPacket dp = 
						new DatagramPacket(buf,buf.length);
				
				ds.receive(dp);
				
				//��ȡ���Ͷ�IP
				String ip = dp.getAddress().getHostAddress();
				//����תΪ�ַ���
				String data = new String(dp.getData(),0,dp.getLength());
				
				System.out.println(ip+"::"+data);
			}
		}
		catch(Exception e)
		{
			throw new RuntimeException("���ն�ʧ��");
		}
	}
}

public class ChatDemo
{

	public static void main(String[] args)throws Exception
	{
		//���Ͷ�
		DatagramSocket SendSocket = new DatagramSocket();
		//���ն�
		DatagramSocket receSocket = new DatagramSocket(10002);
		
		new Thread(new Send(SendSocket)).start();
		new Thread(new Rece(receSocket)).start();
	}

}










