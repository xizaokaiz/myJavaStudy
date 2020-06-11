package g_IO.�ַ���.buffered;

import java.io.*;

//�̳��Ż�����
class MyLineNumberReader extends MyBufferedReader
{
	private int lineNumber;
	MyLineNumberReader(FileReader r)
	{
		super(r);
	}
	public String myReadLine()throws IOException
	{
		lineNumber++;
		
		return super.myReadLine();
	}
	public void setLineNumber(int lineNumber)
	{
		this.lineNumber = lineNumber;
	}
	public int getLineNumber()
	{
		return lineNumber;
	}
	
}


/*
class MyLineNumberReader
{
	private Reader r;
	private int lineNumber;
	MyLineNumberReader(Reader r)
	{
		this.r = r;
	}
	
	public String myReadLine()throws IOException
	{
		lineNumber++;
		
		StringBuilder sb = new StringBuilder();
		
		int ch = 0;
		while((ch=r.read())!=-1)
		{
			if(ch=='\r')
				continue;
			if(ch=='\n')
				return sb.toString();
			else
				sb.append((char)ch);
		}
		if(sb.length()!=0)
			return sb.toString();
		return null;
	}
	public void setLineNumber(int lineNumber)
	{
		this.lineNumber = lineNumber;
	}
	public int getLineNumber()
	{
		return lineNumber;
	}
	public void myClose()throws IOException
	{
		r.close();
	}
}
*/

public class MyLineNumberReaderDemo 
{

	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("D:\\demo.txt");
		
		MyLineNumberReader mlnb = new MyLineNumberReader(fr);
		
		String line = null;
		while((line=mlnb.myReadLine())!=null)
		{
			System.out.println(mlnb.getLineNumber()+"::"+line);
			
		}
		mlnb.MyClose();
	}

}
