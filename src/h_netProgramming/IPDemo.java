package h_netProgramming;

import java.net.*;

/*
��ȡ������ַ
 */
public class IPDemo 
{

	public static void main(String[] args) throws Exception
	{
		//��������
		InetAddress i = InetAddress.getLocalHost();
		System.out.println(i.toString());
		
		//��ȡ������ַ
		System.out.println("address:"+i.getHostAddress());
		//��ȡ��������
		System.out.println("hostname:"+i.getHostName());
		
		//��ȡ����������ַ
		InetAddress ia = InetAddress.getByName("www.baidu.com");
		System.out.println("address:"+ia.getHostAddress());
		System.out.println("hostname:"+ia.getHostName());
	}

}
