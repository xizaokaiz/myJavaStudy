package g_IO.sequenceInputStream;
/*
�ļ����зֺͺϲ�
 */
import java.io.*;
import java.util.*;
public class SplitFile {

	public static void main(String[] args)throws IOException {
		//splitFile();
		merge();

	}
	//�ļ��ϲ�
	public static void merge()throws IOException
	{
		//��Դ��Ƭ���뼯��
		ArrayList<FileInputStream> arr = new ArrayList<FileInputStream>();
		
		for(int x=1;x<=9;x++)
		{
			arr.add(new FileInputStream("E:\\Test\\IO\\splitfile\\"+(x++)+".part"));
		}
		//��Ϊ�������ڲ��࣬������final����(�����ܱ���д)
		final Iterator<FileInputStream> it = arr.iterator();
		//��д����,��ȡԴ
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>()
		{
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
			public FileInputStream nextElement()
			{
				return it.next();
			}
		};
		//�ϲ���Ƭ
		SequenceInputStream sis = new SequenceInputStream(en);
		//Ŀ��
		FileOutputStream fos = new FileOutputStream("E:\\Test\\IO\\splitfile\\0.MP3");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		while((len=sis.read(buf))!=-1)
		{
			//��0���ֽڿ�ʼ��lenд�뵽buf������fos��
			fos.write(buf,0,len);
		}
		
		fos.close();
		sis.close();
		
	}
	
	//�ļ��з�-->�ֽ���
	public static void splitFile()throws IOException
	{
		//Դ
		FileInputStream fis = new FileInputStream("E:\\Test\\IO\\splitfile\\1.MP3");
		
		FileOutputStream fos = null;
		//��1MB���з�
		byte[] buf = new byte[1024*1024];
		
		int len = 0;
		int count = 1;
		while((len=fis.read(buf))!=-1)
		{
			//Ŀ��
			fos = new FileOutputStream("E:\\Test\\IO\\splitfile\\"+(count++)+".part");
			fos.write(buf,0,len);
			fos.close();
		}
		
		fis.close();
	}
	

}
