package g_IO.字符流.buffered;

/*
通过缓冲区赋值一个.java文件。

readLine方法的原理：
无论是读一行，获取读取多个字符，其实最终都是在硬盘上一个一个读取。
所以最终使用的还是read方法一次读一个。
将读到的字符保存在缓冲区中，当读到"\r"时，就不往里存了，当读到"\n"时，返回缓冲区的全部字符。
 */
import java.io.*;
public class CopyTextByBuf 
{

	public static void main(String[] args) 
	{
		BufferedReader bufr = null;
		BufferedWriter bufw = null;
		
		try 
		{
			bufr = new BufferedReader(new FileReader("D:\\demo.txt"));
			bufw = new BufferedWriter(new FileWriter("D:\\demo_copy.txt"));
			
			String line = null;
			while((line=bufr.readLine())!=null)
			{
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
			}
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if(bufr!=null)
					bufr.close();
			} catch (Exception e2) 
			{
				e2.printStackTrace();
			}
			try 
			{
				if(bufw!=null)
					bufw.close();
			} catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}

	}

}
