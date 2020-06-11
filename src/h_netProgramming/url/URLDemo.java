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
          ���ش� URI ��������ɲ��֡� 
 String getPath() 
          ���ش� URI ���ѽ����·����ɲ��֡� 
 int getPort() 
          ���ش� URI �Ķ˿ںš� 
 String getQuery() 
          ���ش� URI ���ѽ���Ĳ�ѯ��ɲ��֡� 

 */