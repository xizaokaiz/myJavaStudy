package g_IO.�ֽ���;

/*
����һ��ͼƬ��
˼·��
1.���ֽڶ�ȡ�������ͼƬ������
2.���ֽ�д�������󴴽�һ��ͼƬ�ļ������ڴ洢��ȡ����ͼƬ���ݡ�
3.ͨ��ѭ����д��������ݵĴ洢��
4.�ر���Դ��
 */
import java.io.*;
public class CopyPic 
{

	public static void main(String[] args) 
	{
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try
		{	//��������
			fis = new FileInputStream("D:\\5.png");
			fos = new FileOutputStream("D:\\6.png");
			//���建����
			byte[] buf = new byte[1024];
			int len = 0;
			//����������
			while((len=fis.read(buf))!=-1)
			{
				//д��
				fos.write(buf,0,len);
			}
			
		}
		catch(IOException e)
		{
			throw new RuntimeException("�����ļ�ʧ��");
		}
		finally
		{
			try
			{
				if(fis!=null)
					fis.close();
			}
			catch(IOException e)
			{
				throw new RuntimeException("��ȡ�ļ�ʧ��");
			}
			try
			{
				if(fos!=null)
					fos.close();
			}
			catch(IOException e)
			{
				throw new RuntimeException("д���ļ�ʧ��");
			}
			
		}
		

	}

}
