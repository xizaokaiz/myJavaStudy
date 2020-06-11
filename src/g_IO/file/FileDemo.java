package g_IO.file;
import java.io.*;
/*
File类的常见方法：
1.创建
	boolean createNewFile();在指定位置创建文件，如果该文件已经存在，则不会再创建并返回false；
							这与输出流不一样，输出流对象一建立就会创建文件，如果文件已经存在则被覆盖。
	createTempFile();创建临时文件。
	boolean mkdir();创建文件夹。
	boolean mkidrs();创建多级文件夹。
2.删除
	boolean delete();删除失败返回false。
	void deleteOnExit();在程序退出时删除指定文件。
3.判断
	boolean exists();文件是否存在。
	isFile();是否是文件。
	isDirectory();是否是目录。
	isHidden();是否是隐藏文件。
	isAbsolute();是否是绝对路径。

4.获取信息
	getName();获取名称。
	getPath();获取路径。
	getParent();获取父目录。
	
	getAbsoluteFile();获取绝对路径。
	long lastModified();获取文件最后一次被修改的时间。
	long length();获取文件的字节数。
 */
public class FileDemo 
{
	public static void main(String[] args)throws IOException
	{
		method_6();
	}
	
	//创建File对象
	public static void comsMethod()
	{
		//将a.txt封装成file对象，可以将已有的和未出现的文件或者文件夹封装成对象
		File f1 = new File("E:\\Test\\IO\\in.txt");
		//亦可(父目录，子文件[也可变量])
		File f2 = new File("E:\\Test\\IO","in.txt");
		//亦可创建对象保存父目录
		File d = new File("E:\\Test\\IO");
		File f3 = new File(d,"in.txt");
		
		System.out.println("f1:"+f1);
		System.out.println("f2:"+f2);
		System.out.println("f3:"+f3);
		//跨平台可识别的分隔符：File.separator
		File f4 = new File("E:"+File.separator+"Test"+File.separator+"IO"+File.separator+"in.txt");
		
	}
	
	//创建文件
	public static void method_1()throws IOException
	{
		File f = new File("E:\\Test\\IO\\file.txt");
//		System.out.println("create:"+f.createNewFile());
		//创建文件夹
		File dir = new File("E:\\Test\\IO\\Mkdir");
		System.out.println("mkdir:"+dir.mkdir());
	}
	
	//删除文件
	public static void method_2()throws IOException
	{
		File f = new File("E:\\Test\\IO\\file.txt");
		System.out.println("detele:"+f.delete());
	}
	
	//判断文件
	public static void method_3()throws IOException
	{
		File f = new File("E:\\Test\\IO\\file.txt");
//		System.out.println("execute:"+f.canExecute());
		System.out.println("exist:"+f.exists());
	}
	
	//判断文件
	public static void method_4()throws IOException
	{
		File f = new File("file.txt");
		//记住在判断文件对象是否是文件或者目录时，必须要先判断该文件对象封装的内容是否存在，
		//通过exists判断。
		System.out.println("dir:"+f.isDirectory());
		System.out.println("file:"+f.isFile());
		System.out.println("absolute:"+f.isAbsolute());
		
	}
	
	//获取信息
	public static void method_5()
	{
		File f = new File("E:\\Test\\IO\\file.txt");
		System.out.println("path:"+f.getPath());
		System.out.println("abspath:"+f.getAbsolutePath());
		System.out.println("parent:"+f.getParent());//该方法返回的是绝对路径中的父目录。如果获取的是相对路径，返回null。
													//如果相对路径中有上一层目录那么该目录就是返回结果。
		System.out.println("length:"+f.length());
	}
	
	//修改文件名/移动文件名
	public static void method_6()
	{
		File f1 = new File("E:\\Test\\IO\\in.txt");
		File f2 = new File("E:\\Test\\IO\\iin.txt");
		
		System.out.println("rename:"+f1.renameTo(f2));
		
	}
	
	
	
	

}
