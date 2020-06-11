package g_IO.file;
/*
删除一个带内容的目录。
删除原理：
在windows中，删除目录从里面往外面删除的，
既然是从里往外删除，就需要用到递归。
 */
import java.io.*;
public class RemoveDir 
{

	public static void main(String[] args) 
	{
		File dir = new File("E:\\Test\\IO\\新建文件夹");
		removeDir(dir);

	}
	
	//删除目录
	public static void removeDir(File dir)
	{
		File[] files = dir.listFiles();
		//遍历目录
		for(int x=0;x<files.length;x++)
		{
			//判断是否为目录
			if(files[x].isDirectory())
				//若是，则继续判定直到不为目录
				removeDir(files[x]);
				//打印删除的文件名称，删除文件
				System.out.println(files[x].toString()+":-file-:"+files[x].delete());
		}
		//打印删除的目录名称，删除目录
		System.out.println(dir+"::dir::"+dir.delete());
	}

}
