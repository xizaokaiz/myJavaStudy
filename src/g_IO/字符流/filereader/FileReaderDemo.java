package g_IO.�ַ���.filereader;

import java.io.*;

public class FileReaderDemo 
{

	public static void main(String[] args) throws IOException
	{
		//����һ���ļ���ȡ�����󣬺�ָ�����Ƶ��ļ��������
		//Ҫ��֤���ļ�ʱ�Ѿ����ڵģ���������ڣ��ᷢ���쳣FileNotFoundException��
		FileReader fr = new FileReader("D:\\demo.txt");
		
		
		//���ö�ȡ�������read������
		//read():һ�ζ�һ���ַ������һ��Զ����¶���
		
		int ch = 0;
		while((ch=fr.read())!=-1)
		{
			System.out.println((char)ch);
		}
		
		/*
		while(true)
		{
			int ch = fr.read();
			if(ch==-1)
				break;
			System.out.println("ch="+(char)ch);	
		}
		*/
		
		fr.close();
		

	}

}
