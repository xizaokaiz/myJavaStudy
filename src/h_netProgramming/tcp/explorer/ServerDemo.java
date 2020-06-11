package h_netProgramming.tcp.explorer;

/*
浏览器客户端-自定义服务端

演示：客户端和服务端
1，
客户端：浏览器
服务端：自定义。

2,
客户端：浏览器
服务端：Tomcat服务器

3，
客户端：自定义
服务端：Tomcat服务器
 */
/*
GET / HTTP/1.1
Accept: text/html, application/xhtml+xml, image/jxr, 
Referer: https://www.baidu.com/s?wd=192.168.137.1%3A10009&tn=62095104_12_dg
Accept-Language: zh-Hans-CN,zh-Hans;q=0.5
User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko
Accept-Encoding: gzip, deflate
Host: 192.168.137.1:10009
Connection: Keep-Alive
 */
import java.io.*;
import java.net.*;
public class ServerDemo 
{

	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(10009);
		
		Socket s = ss.accept();
		System.out.println(s.getInetAddress().getHostAddress());
		
		//读取流
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		
		PrintWriter out = new PrintWriter(s.getOutputStream());	
		
		out.println("<font color='red' size='7'>客户端你好</font>");
		
		s.close();
		ss.close();
	}

}


