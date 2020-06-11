package g_IO.字符流.filereader;

/*
读取一个.java文件，并打印在控制台上。
 */

import java.io.*;

public class FileReaderTest 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("D:\\1710587212奚诏楷.java");
		
		char[] buf = new char[1024];
		
		int num = 0;
		while((num=fr.read(buf))!=-1)
		{
			System.out.print(new String(buf,0,num));
		}
		
		fr.close();

	}

}
