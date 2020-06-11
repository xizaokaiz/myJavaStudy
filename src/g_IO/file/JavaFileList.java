package g_IO.file;
/*
��ϰ
��һ��ָ��Ŀ¼�µ�java�ļ��ľ���·�����洢��һ���ı��ļ��С�
����һ��java�ļ��б��ļ���

˼·��
1.��ָ����Ŀ¼���еݹ顣
2.��ȡ�ݹ���������е�java�ļ���·����
3.����Щ·���洢�������С�
4.�������е�����д�뵽һ���ļ��С�
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
				//�жϺ�׺���Ƿ�Ϊ.java
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
			
			//��������
			for(File f:list)
			{
				//��ȡ����·��
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




