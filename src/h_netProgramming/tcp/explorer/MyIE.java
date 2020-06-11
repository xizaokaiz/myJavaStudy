package h_netProgramming.tcp.explorer;

/*
自定义浏览器-Tomcat服务端

 */
import java.io.*;
import java.net.*;
public class MyIE 
{

	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("192.168.137.1",8080);
		
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		out.println("GET / HTTP/1.1");
		out.println("Accept: */*");
		out.println("Accept-Language: zh-Hans-CN,zh-Hans;q=0.5");
		out.println("Host: 192.168.137.1:10009");
		out.println("Connection: Keep-Alive");
		
		out.println();
		out.println();
		
		BufferedReader bufr = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			System.out.println(line);
		}
		
		s.close();
	}

}
