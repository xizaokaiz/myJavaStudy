package h_netProgramming;

import java.net.*;

/*
获取主机地址
 */
public class IPDemo 
{

	public static void main(String[] args) throws Exception
	{
		//建立对象
		InetAddress i = InetAddress.getLocalHost();
		System.out.println(i.toString());
		
		//获取主机地址
		System.out.println("address:"+i.getHostAddress());
		//获取主机名称
		System.out.println("hostname:"+i.getHostName());
		
		//获取其他主机地址
		InetAddress ia = InetAddress.getByName("www.baidu.com");
		System.out.println("address:"+ia.getHostAddress());
		System.out.println("hostname:"+ia.getHostName());
	}

}
