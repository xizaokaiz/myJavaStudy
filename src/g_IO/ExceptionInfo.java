package g_IO;
import java.io.*;
import java.util.*;
import java.text.*;
/*
רҵ��־�ļ���log4j
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
				//�������ڶ���
				Date d = new Date();
				//��ʽ������
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String s = sdf.format(d);
				PrintStream ps = new PrintStream("E:\\Test\\IO\\Exception.log");
				ps.println(s);
				System.setOut(ps);
			}
			catch(IOException ex)
			{
				throw new RuntimeException("��־�ļ�����ʧ��");
			}
			e.printStackTrace(System.out);
		}

	}

}
