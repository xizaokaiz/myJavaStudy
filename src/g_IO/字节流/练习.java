package g_IO.�ֽ���;

import java.io.*;

/*
Test����һ���ı����ݴ�ӡ�ڿ���̨�ϣ�Ҫ�������ϸ�ʽ�Լ����������ȷ

Դ���ļ� 
�Ƿ��Ƕ��ı����� Reader
�豸��Ӳ�̣�һ���ļ���ʹ��FileReader

�Ƿ���Ҫ���Ч�ʣ��ǣ�BufferedReader

Ŀ�ģ�����̨


 */
public class ��ϰ 
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




