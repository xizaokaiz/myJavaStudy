package g_IO.�ַ���.buffered;

import java.io.*;

/*
LineNumberReader:���кŵ�װ���ࡣ

��ϰ��ģ��һ�����кŵĻ���������
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
