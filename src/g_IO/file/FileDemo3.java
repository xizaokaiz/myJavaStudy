package g_IO.file;
/*
列出指定目录下文件或者文件夹，包含子目录中的内容，也就是列出指定目录下所有内容。

因为目录中还有目录，只要使用同一个列出目录功能的函数完成即可，
在列出过程中出现的还是目录的话，可以再次调用本功能，也就是函数自身调用自身。
这种表现形式或者编程手法，称为递归。

递归注意：
1.限定条件
2.要注意递归的次数，尽量避免内存溢出。

 */
import java.io.*;
public class FileDemo3 
{

	public static void main(String[] args) 
	{
		File dir = new File("E:\\Test");
		showDir(dir,0);
		//showDir(dir);
		//toBin(4);
		
	}
	
	//按目录等级遍历目录
	public static String getLevel(int level)
	{
		StringBuilder sb = new StringBuilder();
		for(int x=0;x<level;x++)
		{
			sb.append("|--");
		}
		return sb.toString();
	}
	
	//递归十进制转二进制
	public static void toBin(int num)
	{
		if(num>0)
		{
			toBin(num/2);
			System.out.println(num%2);
		}
	}
	
	public static void showDir(File dir,int level)
	{
		System.out.println(getLevel(level)+level);
		level++;
		//显示文件夹
		System.out.println(dir);
		File[] files = dir.listFiles();
		//遍历目录
		for(int x=0; x<files.length; x++)
		{
			//判断是否为文件夹
			if(files[x].isDirectory())
				//若为真，则遍历此文件夹
				showDir(files[x],level);
			else
				System.out.println(getLevel(level)+files[x]);
			
		}
				
	}

}
