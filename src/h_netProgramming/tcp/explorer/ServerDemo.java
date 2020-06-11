package h_netProgramming.tcp.explorer;

/*
������ͻ���-�Զ�������

��ʾ���ͻ��˺ͷ����
1��
�ͻ��ˣ������
����ˣ��Զ��塣

2,
�ͻ��ˣ������
����ˣ�Tomcat������

3��
�ͻ��ˣ��Զ���
����ˣ�Tomcat������
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
		
		//��ȡ��
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		
		PrintWriter out = new PrintWriter(s.getOutputStream());	
		
		out.println("<font color='red' size='7'>�ͻ������</font>");
		
		s.close();
		ss.close();
	}

}


