package g_IO.字符流.buffered;

import java.io.*;

/*
LineNumberReader:带行号的装饰类。

练习：模拟一个带行号的缓冲区对象。
 */


public class LineNumberReaderDemo 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("D:\\demo.txt");
		
		LineNumberReader lnr = new LineNumberReader(fr);
		
		lnr.setLineNumber(100);
		
		String line = null;
		while((line=lnr.readLine())!=null)
		{
			System.out.println(lnr.getLineNumber()+":"+line);
		}
		lnr.close();

	}

}
