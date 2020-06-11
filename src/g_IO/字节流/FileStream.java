package g_IO.�ֽ���;

/*
�ַ�����
FileReader
FIleWriter

BufferedReader
BufferedWriter

�ֽ�����
InputStream OutputStream

������Ҫ����ͼƬ���ݣ���ʱ��Ҫ�õ��ֽ�����
 */

import java.io.*;

public class FileStream 
{

	public static void main(String[] args) throws IOException
	{
		readFile_3();

	}
	
	//����������
	public static void readFile_3()throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\demo.txt");
		
//		int num = fis.available();
//		System.out.println("num="+num);		
		byte[] buf = new byte[fis.available()];//����һ��һ���ոպõĻ�������������ѭ���ˡ�
		
		fis.read(buf);
		
		System.out.println(new String(buf));
		
		fis.close();
	}
	
	//װ��������һ���Զ���
	public static void readFile_2()throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\demo.txt");
		
		byte[] buf = new byte[1024];
		int len=0;
		while((len=fis.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,len));
		}
		fis.close();
	}
	
	
	//һ��һ����
	public static void readFile_1()throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\demo.txt");
		
		int ch = 0;
		
		while((ch=fis.read())!=-1)
		{
			System.out.println((char)ch);
		}
		fis.close();
	}
	
	public static void writeFile()throws IOException
	{
		FileOutputStream fos = new FileOutputStream("D:\\demo.txt");
		
		fos.write("abcde".getBytes());
		
		fos.close();
	}
}
