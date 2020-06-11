package g_IO;
import java.io.*;
import java.util.*;
import java.text.*;
/*
专业日志文件：log4j
 */
public class ExceptionInfo {

	public static void main(String[] args) 
	{
		try
		{
			int[] arr = new int[2];
			System.out.println(arr[3]);
		}
		catch(Exception e)
		{
			try
			{
				//创建日期对象
				Date d = new Date();
				//格式化日期
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String s = sdf.format(d);
				PrintStream ps = new PrintStream("E:\\Test\\IO\\Exception.log");
				ps.println(s);
				System.setOut(ps);
			}
			catch(IOException ex)
			{
				throw new RuntimeException("日志文件创建失败");
			}
			e.printStackTrace(System.out);
		}

	}

}
