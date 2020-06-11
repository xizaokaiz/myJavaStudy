package g_IO.file;

import java.io.*;
/*
list();����Ŀ¼�е����е��ļ�
listRoots();���ظ�Ŀ¼

��ϰ��
ʹ��listFiles()����ֻ��ȡ.txt�ļ���
 */
public class FileDemo2 
{
	public static void main(String [] args)
	{
		File dir = new File("E:\\Test\\IO");
		File[] files = dir.listFiles();	
		for(File f: files)
		{
			System.out.println(f.getName()+"--"+f.length());
		}
	}
	
	//��ϰ:ʹ��listFiles()����ֻ��ȡ.txt�ļ���
	public static void listDemo_2()
	{
		File dir = new File("E:\\Test\\IO\\");
		//������������д������
		String[] arr = dir.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)
			{
				//endsWith() �������ڲ����ַ����Ƿ���ָ���ĺ�׺������
				return name.endsWith(".txt");
			}
		});
		System.out.println("len:"+arr.length);
		for(String name:arr)
		{
			System.out.println(name);
		}
		
	}
	
	public static void listDemo()
	{
		File f = new File("e:\\");
		
		String[] names = f.list();//����list������file��������Ƿ�װ��һ��Ŀ¼����Ŀ¼��������ڡ�
		for(String name : names)
		{
			System.out.println(name);
		}
	}
	
	public static void listRootsDemo()
	{
		File[] files = File.listRoots();
		for(File f:files)
		{
			System.out.println(f);
		}
	}

}

//�������������Ƚ�����
class MyFileter implements FileFilter
{
	public boolean accept(File pathname)
	{
		return pathname.getName().toLowerCase().endsWith(".txt");
	}
}
