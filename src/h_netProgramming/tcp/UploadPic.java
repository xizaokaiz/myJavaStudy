package h_netProgramming.tcp;
/*
�ϴ�ͼƬ

�ͻ���
1������˵�
2����ȡ�ͻ������е�ͼƬ����
3��ͨ��scoket����������ݷ��������
4����ȡ����˷�����Ϣ
5���ر�
 */
import java.io.*;
import java.net.*;
class PicClient
{

	public static void main(String[] args) throws Exception
	{
		Socket s = new Socket("192.168.137.1",10008);
		
		//������
		FileInputStream fis = new FileInputStream("E:\\Test\\net\\TCP\\1.bmp");
		
		//��ȡ�����
		OutputStream out = s.getOutputStream();
		
		//������
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=fis.read(buf))!=-1)
		{
			//д
			out.write(buf,0,len);
		}
		
		//���߷����������д��
		s.shutdownOutput();
		
		//��ȡ������
		InputStream in = s.getInputStream();
		
		byte[] bufIn = new byte[1024];
		int num = in.read(bufIn);
		System.out.println(new String(bufIn,0,num));
		
		fis.close();
		s.close();
		

	}

}

/*
�����
 */
class PicServer
{

	public static void main(String[] args) throws Exception
	{
		//����
		ServerSocket ss = new ServerSocket(10008);
		
		//��ȡ�ͻ��˶���
		Socket s = ss.accept();
		
		//��ȡ������
		InputStream in = s.getInputStream();
		
		FileOutputStream fos = new FileOutputStream("E:\\Test\\net\\TCP\\server.bmp");
		
		//������
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=in.read())!=-1)
		{
			//д
			fos.write(buf,0,len);
		}
		
		OutputStream out = s.getOutputStream();
		
		out.write("�ϴ��ɹ�".getBytes());
		
		fos.close();
		s.close();
		ss.close();

	}

}

