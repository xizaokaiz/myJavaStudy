package g_IO.�ַ���.buffered;

/*
ͨ����������ֵһ��.java�ļ���

readLine������ԭ��
�����Ƕ�һ�У���ȡ��ȡ����ַ�����ʵ���ն�����Ӳ����һ��һ����ȡ��
��������ʹ�õĻ���read����һ�ζ�һ����
���������ַ������ڻ������У�������"\r"ʱ���Ͳ�������ˣ�������"\n"ʱ�����ػ�������ȫ���ַ���
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
