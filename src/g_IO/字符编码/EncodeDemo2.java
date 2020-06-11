package g_IO.字符编码;
/*
联通问题
 */
import java.io.*;
public class EncodeDemo2 
{

	public static void main(String[] args) throws Exception
	{
		String s = "联通";
		
		byte[] by = s.getBytes("gbk");
		
		for(byte b:by)
		{
			//转二进制取最后八位
			System.out.println(Integer.toBinaryString(b&255));
		}
		
	}

}
