package h_netProgramming.url;

import java.io.*;
import java.net.*;
public class URLLConnectionDemo 
{

	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://192.168.137.1:8080/Test/net/TCP/user.html");
		
		URLConnection conn = url.openConnection();
		System.out.println(conn);
		
		InputStream in = conn.getInputStream();
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));

	}

}
