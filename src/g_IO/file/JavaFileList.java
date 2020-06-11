package g_IO.file;
/*
练习
将一个指定目录下的java文件的绝对路径，存储到一个文本文件中。
建立一个java文件列表文件。

思路：
1.对指定的目录进行递归。
2.获取递归过程中所有的java文件的路径。
3.将这些路径存储到集合中。
4.将集合中的数据写入到一个文件中。
 */
import java.io.*;
import java.util.*;
public class JavaFileList 
{

	public static void main(String[] args)throws IOException
	{
		File dir = new File("E:\\demo_student_work\\src\\a_object");
		
		List<File> list = new ArrayList<File>();
		
		fileToList(dir,list);
		
		//System.out.println(list.size());
		
		File f = new File(dir,"javalist.txt");
		writeToFile(list,f.toString());

	}
	
	
	public static void fileToList(File dir,List<File> list)
	{
		File[] files = dir.listFiles();
		
		for(File file:files)
		{
			if(file.isDirectory())
				fileToList(file,list);
			else
			{
				//判断后缀名是否为.java
				if(file.getName().endsWith(".java"))
					list.add(file);
			}
		}
	}
	
	public static void writeToFile(List<File> list,String javaListFile)throws IOException
	{
		BufferedWriter bufw = null;
		try
		{
			bufw = new BufferedWriter(new FileWriter(javaListFile));
			
			//遍历集合
			for(File f:list)
			{
				//获取绝对路径
				String path = f.getAbsolutePath();
				
				bufw.write(path);
				bufw.newLine();
				bufw.flush();
			}
		}
		catch(IOException e)
		{
			throw e;
		}
		finally
		{
			try
			{
				if(bufw!=null)
					bufw.close();
			}
			catch(IOException e)
			{
				throw e;
			}
		}
	}

}




