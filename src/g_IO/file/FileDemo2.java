package g_IO.file;

import java.io.*;
/*
list();返回目录中的所有的文件
listRoots();返回根目录

练习：
使用listFiles()方法只获取.txt文件。
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
	
	//练习:使用listFiles()方法只获取.txt文件。
	public static void listDemo_2()
	{
		File dir = new File("E:\\Test\\IO\\");
		//用匿名对象重写方法。
		String[] arr = dir.list(new FilenameFilter()
		{
			public boolean accept(File dir,String name)
			{
				//endsWith() 方法用于测试字符串是否以指定的后缀结束。
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
		
		String[] names = f.list();//调用list方法的file对象必须是封装了一个目录。该目录还必须存在。
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

//创建过滤器（比较器）
class MyFileter implements FileFilter
{
	public boolean accept(File pathname)
	{
		return pathname.getName().toLowerCase().endsWith(".txt");
	}
}
