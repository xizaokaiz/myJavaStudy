package g_IO.字符流.filewriter;

/*
对已有文件的数据续写。
 */

import java.io.*;

public class FileWriterDemo3 
{

	public static void main(String[] args) 
	{
		//传递一个true参数，代表不覆盖已有的文件，并在已有文件的末尾处进行数据续写。
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("D:\\demo.txt",true);
			fw.write("\r\n再见");
		}
		catch(IOException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			try
			{
				if(fw!=null)
					fw.close();
			}
			catch(IOException e)
			{
				System.out.println(e.toString());
			}
		}
		
	}

}











