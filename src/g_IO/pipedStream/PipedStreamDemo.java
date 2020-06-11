package g_IO.pipedStream;
/*
�ܵ���
 */
import java.io.*;

//������ȡ�߳�
class Read implements Runnable
{
	//��ȡ�ܵ���
	private PipedInputStream in;
	Read(PipedInputStream in)
	{
		this.in = in;
	}
	//��дrun����
	public void run()
	{
		try
		{
			//����һ���ֽ����������
			byte[] buf = new byte[1024];
			
			System.out.println("��ȡǰ��û�����ݾ�����");
			
			//���ݶ���
			int len = in.read(buf);
			
			System.out.println("�������ݣ���������");
			
			//���ֽ�����ת���ַ�����
			String s = new String(buf,0,len);
			
			System.out.println(s);
			
			in.close();
		}
		catch(IOException e)
		{
			throw new RuntimeException("�ܵ���ȡ��ʧ��");
		}
	}
}

//��������߳�
class Write implements Runnable
{
	//����ܵ���
	private PipedOutputStream out;
	Write(PipedOutputStream out)
	{
		this.out = out;
	}
	public void run()
	{
		try
		{
			//�߳�ֹͣ6���д��
			System.out.println("��ʼд�����ݣ��ȴ�6���");
			Thread.sleep(6000);
			//��Ҫ���������ת���ֽڲ�д��ܵ�
			out.write("peped is coming".getBytes());
			out.close();
		}
		catch(Exception e)
		{
			throw new RuntimeException("�ܵ������ʧ��");
		}
	}
}
public class PipedStreamDemo
{

	public static void main(String[] args) throws IOException
	{
		PipedInputStream in = new PipedInputStream();
		PipedOutputStream out = new PipedOutputStream();
		//���ܵ����������������������
		in.connect(out);
		
		//�����ܵ�
		Read r = new Read(in);
		Write w = new Write(out);
		//�����߳�
		new Thread(r).start();
		new Thread(w).start();
		
	}

}




