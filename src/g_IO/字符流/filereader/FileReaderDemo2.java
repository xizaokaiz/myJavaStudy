package g_IO.字符流.filereader;

/*
第二种方式：通过字符数组进行读取。
 */

import java.io.*;

public class FileReaderDemo2 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("D:\\demo.txt");
		
		//定义一个字符数组，用于存储读到的字符。
		//该read(char[])返回的是读到的字符个数。
		char[] buf = new char[1024];
		
		int num = 0;
		while((num=fr.read(buf))!=-1)
		{
			System.out.println(new String(buf,0,num));
		}
		
		
		fr.close();

	}

}
