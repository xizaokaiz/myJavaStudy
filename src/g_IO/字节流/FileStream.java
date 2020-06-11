package g_IO.字节流;

/*
字符流：
FileReader
FIleWriter

BufferedReader
BufferedWriter

字节流：
InputStream OutputStream

需求：想要操作图片数据，这时就要用到字节流。
 */

import java.io.*;

public class FileStream 
{

	public static void main(String[] args) throws IOException
	{
		readFile_3();

	}
	
	//缓冲区读出
	public static void readFile_3()throws IOException
	{
		FileInputStream fis = new FileInputStream("D:\\demo.txt");
		
//		int num = fis.available();
//		System.out.println("num="+num);		
		byte[] buf = new byte[fis.available()];//定义一个一个刚刚好的缓冲区，不用在循环了。
		
		fis.read(buf);
		
		System.out.println(new String(buf));
		
		fis.close();
	}
	
	//装进数组里一次性读出
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
	
	
	//一个一个读
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
