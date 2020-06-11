package g_IO.字节流;

import java.io.*;

/*
Test：将一个文本数据打印在控制台上，要按照以上格式自己完成三个明确

源：文件 
是否是读文本：是 Reader
设备：硬盘，一个文件。使用FileReader

是否需要提高效率：是：BufferedReader

目的：控制台


 */
public class 练习 
{

	public static void main(String[] args) throws Exception
	{
		FileReader fr = new FileReader("E:\\in.txt");
		BufferedReader bufr = new BufferedReader(fr);
		
		String line = null;
		
		while((line=bufr.readLine())!=null)
		{
			System.out.println(line);
		}
		bufr.close();
	}

}




