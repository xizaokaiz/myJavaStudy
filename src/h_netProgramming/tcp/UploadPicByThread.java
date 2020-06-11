package h_netProgramming.tcp;
/*
�ͻ��˲����ϴ�ͼƬ

�ͻ���
1������˵�
2����ȡ�ͻ������е�ͼƬ����
3��ͨ��scoket����������ݷ��������
4����ȡ����˷�����Ϣ
5���ر�
 */
import java.io.*;
import java.net.*;
class PicClient_2
{

	public static void main(String[] args) throws Exception
	{
		
		//���ϴ����ļ������ж�
		if(args.length!=1)
		{
			System.out.println("��ѡ��һ��jpg��ʽ��ͼƬ");
			return ;
		}
		
		File file = new File(args[0]);
		if(!(file.exists()) && file.isFile())
		{
			System.out.println("���ļ������⣬Ҫô�����ڣ�Ҫô�����ļ�");
			return ;
		}
		
		if(!file.getName().endsWith(".jpg"))
		{
			System.out.println("ͼƬ��ʽ����������ѡ��");
			return ;
		}
		
		if(file.length()>1024*1024*5)
		{
			System.out.println("�ļ�����û������");
			return ;
		}
		
		
		
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

���������и������ԡ���A�ͻ����������Ժ󣬱�����˻�ȡ���������ִ�о������̡�
��ʱB�ͻ������ӣ�ֻ�еȴ���
��Ϊ����˻�û�д�����A�ͻ��˵����󣬻�û��ѭ������ִ����һ��accept������
������ʱ��ȡ����B�ͻ��˶���

��ôΪ�˿����ö���ͻ���ͬʱ�������ʷ���ˣ�
�������þ��ǽ�ÿ���ͻ��˷�װ��һ���������߳��У������Ϳ���ͬʱ�������ͻ�������

��ζ����߳��أ�
ֻҪ��ȷ��ÿһ���ͻ���Ҫ�ڷ����ִ�еĴ��뼴�ɣ����ô������run�����С�
 */

class PicThread implements Runnable
{
	private Socket s;
	PicThread(Socket s)
	{
		this.s = s;
	}
	public void run()
	{
		//������
		int count = 1;
		//��ȡIP��ַ
		String ip = s.getInetAddress().getHostAddress();
		try
		{
			
			System.out.println(ip+"....connected");
			//��ȡ������
			InputStream in = s.getInputStream();
			
			//·��
			File file = new File("E:\\Test\\net\\TCP\\server.bmp"+ip+"("+(count)+")"+".jpg");
			//�ظ��ļ������ļ���
			while(file.exists())
				file = new File("E:\\Test\\net\\TCP\\server.bmp"+ip+"("+(count++)+")"+".jpg");
			
			
			//Ŀ��
			FileOutputStream fos = new FileOutputStream(file);
			
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
		}
		catch(Exception e)
		{
			throw new RuntimeException(ip+"�ϴ�ʧ��");
		}
	}
}

class PicServer_2
{

	public static void main(String[] args) throws Exception
	{
		//�����
		ServerSocket ss = new ServerSocket(10008);
		
		while(true)
		{
			//��ȡ�ͻ��˶���
			Socket s = ss.accept();
			
			//�¿ͻ����߳�
			new Thread(new PicThread(s)).start();
		}
		
		
		
//		ss.close();

	}

}

