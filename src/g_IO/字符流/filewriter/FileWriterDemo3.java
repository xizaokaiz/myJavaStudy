package g_IO.�ַ���.filewriter;

/*
�������ļ���������д��
 */

import java.io.*;

public class FileWriterDemo3 
{

	public static void main(String[] args) 
	{
		//����һ��true�����������������е��ļ������������ļ���ĩβ������������д��
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("D:\\demo.txt",true);
			fw.write("\r\n�ټ�");
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











