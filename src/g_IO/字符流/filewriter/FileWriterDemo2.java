package g_IO.�ַ���.filewriter;

/*
IO�쳣�Ĵ���ʽ��
 */
import java.io.*;

public class FileWriterDemo2 
{

	public static void main(String[] args) 
	{
		FileWriter fw = null;
		try
		{
			fw = new FileWriter("k:\\demo.txt");
			fw.write("abc");
		}
		catch(IOException e)
		{
			System.out.println("catch:"+e.toString());
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







