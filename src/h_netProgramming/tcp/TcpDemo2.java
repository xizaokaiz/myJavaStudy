package h_netProgramming.tcp;
import java.io.*;
import java.net.*;
/*
��ʾtcp�Ĵ���Ŀͻ��˺ͷ���˵Ļ��á�

���󣺿ͻ��˸�����˷������ݣ�������յ��󣬸��ͻ��˷�����Ϣ��
 */

/*
�ͻ��ˣ�
1������Socket����ָ��Ҫ���ӵ������Ͷ˿ڡ�
2����ȡsocket���е��������������д�������У�ͨ�����緢�͸�����ˡ�
3����ȡsocket���е���������������˷��������ݻ�ȡ��������ӡ��
4���رտͻ�����Դ��
 */
class TcpClient2
{

	public static void main(String[] args) throws Exception
	{
		//����Socket����
		Socket s = new Socket("192.168.137.1",10004);
		
		//��ȡ�����
		OutputStream out = s.getOutputStream();
		
		//д��
		out.write("����ˣ����".getBytes());
		
		//��ȡ������
		InputStream in = s.getInputStream();
		
		//������
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		//��ӡ
		System.out.println(new String(buf,0,len));
		
		s.close();
	}

}

class TcpServer2 
{

	public static void main(String[] args) throws Exception
	{
		//���������
		ServerSocket ss = new ServerSocket(10004);
		
		//��ȡ�ͻ��˶���
		Socket s = ss.accept();
		
		//��ȡip
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+"...connected");
		InputStream in = s.getInputStream();
		
		//������
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		System.out.println(new String(buf,0,len));
		
		//�ȴ�10��
		Thread.sleep(10000);
		
		//��ȡ�����
		OutputStream out = s.getOutputStream();
		out.write("�����յ�����Ҳ��".getBytes());
		
		ss.close();
		
		s.close();//�رտͻ���
	}

}










