package g_IO.�ֽ���;

/*
��ʾmp3�ĸ��ƣ�ͨ����������
BufferedInputStream 
BufferedOutputStream 
 */
import java.io.*;
public class CopyMp3 {

	public static void main(String[] args) throws IOException
	{
		long start = System.currentTimeMillis();
		copy_2();
		long end = System.currentTimeMillis();
		System.out.println((end-start)+"����");
	}
	//�Զ��建������ȡ����
	public static void copy_2()throws IOException
	{
		MyBufferedInputStream bufis = new MyBufferedInputStream(new FileInputStream("D:\\1.mp3"));
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("D:\\2.mp3"));
		int by = 0;
		while((by=bufis.myRead())!=-1)
		{
			
			bufos.write(by);
		}
		bufos.close();
		bufis.myClose();
	}
	//ͨ���ֽ����Ļ�������ɸ��ơ�
	public static void copy_1()throws IOException
	{
		BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("D:\\1.mp3"));
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("D:\\2.mp3"));
		int by = 0;
		while((by=bufis.read())!=-1)
		{
			bufos.write(by);
		}
		bufos.close();
		bufis.close();
	}
	
	
}
