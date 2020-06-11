package h_netProgramming.tcp;
/*
��ʾtcp����

1��tcp�ֿͻ��˺ͷ����
2���ͻ��˶�Ӧ�Ķ�����Socket
	����˶�Ӧ�Ķ�����ServerSocket
 */

/*
�ͻ��ˣ�
ͨ������socket���󣬷����ڸö�����ʱ���Ϳ���ȥ����ָ��������
��Ϊtcp���������ӵģ������ڽ���socket����ʱ��
��Ҫ�з���˴��ڣ������ӳɹ����γ�ͨ·���ڸ�ͨ���������ݵĴ��䡣

���󣺸�����˷���һ���ı����ݡ�

���裺
1������Socket���񣬲�ָ��Ҫ���ӵ������Ͷ˿ڡ�

 */
import java.io.*;
import java.net.*;
class TcpClient
{

	public static void main(String[] args) throws Exception
	{
		//�����ͻ��˵�socket����ָ��Ŀ�������Ͷ˿�
		Socket s = new Socket("192.168.137.1",10003);
		
		//Ϊ�˷������ݣ�Ӧ�û�ȡSocket���е��������
		OutputStream out = s.getOutputStream();
		
		out.write("tpc ge men lai le".getBytes());
		
		s.close();
		
	}

}

/*
���󣺶���˵�������ݲ���ӡ�ڿ���̨�ϡ�

����ˣ�
1����������˵�socket����ServerSocket();
	������һ���˿ڡ�
2����ȡ���ӹ����Ŀͻ��˶���
	ͨ��ServerSokcet��accept������û�����Ӿͻ�ȣ������������������ʽ�ġ�
3���ͻ���������������ݣ���ô�����Ҫʹ�ö�Ӧ�Ŀͻ��˶���
	����ȡ���Ŀͻ��˶���Ķ�ȡ������ȡ�����������ݣ�����ӡ�ڿ���̨��
4���رշ���ˣ���ѡ��������
 */
class TcpServer
{

	public static void main(String[] args) throws Exception
	{
		//��������˵�socket���񣬲�����һ���˿ڡ�
		ServerSocket ss = new ServerSocket(10003);
		
		//ͨ��accpet������ȡ���ӹ����Ŀͻ��˶���
		Socket s = ss.accept();
		
		String ip = s.getInetAddress().getHostAddress();
		System.out.println(ip+".......connected");
		
		//��ȡ�ͻ��˷��͹��������ݣ���ôҪʹ�ÿͻ��˶���Ķ�ȡ����������ȡ����
		InputStream in = s.getInputStream();
		
		//������
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		
		System.out.println(new String(buf,0,len));
		
		s.close();//�رտͻ���
		
		
	}

}










