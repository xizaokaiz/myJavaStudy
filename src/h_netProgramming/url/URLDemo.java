package h_netProgramming.url;
import java.net.*;
public class URLDemo 
{

	public static void main(String[] args) throws Exception
	{
		URL url = new URL("http://192.168.137.1/Test/net/TCP/user.txt?name=haha&age=30");
		
		System.out.println("getProtocol() :"+url.getProtocol());
		System.out.println("String getHost() :"+url.getHost());
		System.out.println("String getPath()  :"+url.getPath());
		System.out.println("int getPort()  :"+url.getPort());
		System.out.println("String getFile() :"+url.getFile());
		System.out.println("String getQuery() :"+url.getQuery());
		
		
	}

}

/*
String getHost() 
          返回此 URI 的主机组成部分。 
 String getPath() 
          返回此 URI 的已解码的路径组成部分。 
 int getPort() 
          返回此 URI 的端口号。 
 String getQuery() 
          返回此 URI 的已解码的查询组成部分。 

 */