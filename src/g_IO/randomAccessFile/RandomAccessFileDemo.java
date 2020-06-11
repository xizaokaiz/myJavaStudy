package g_IO.randomAccessFile;
/*
RandomAccessFile

该类不算是IO体系中的子类，而是直接继承自Object。

但是它是IO包中的成员，因为它具备读和写的功能，
内部封装了一个数组，而且通过指针对数组的元素进行操作，
可以通过getFilePointer获取指针位置，同时可以通过seek改变指针位置。

其实完成读写的原理就是内部封装了字节输入流和输出流。
而通过构造函数可以看出，该类只能操作文件，
而且操作文件还有模式：只读 r ,读写 rw

如果模式为只读r，不会创建文件，会去读取一个已存在的文件，如果该文件不存在，则会出现异常。
如果模式为rw，而且该对象的构造函数要操作的文件不存在，会自动创建；如果存在则不会覆盖。
  

 */
import java.io.*;
public class RandomAccessFileDemo 
{

	public static void main(String[] args) throws IOException
	{
		wrtieFile_2();

	}
	
	//读
	public static void readFile()throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("E:\\Test\\IO\\ran.txt","r");
		
		//调整对象中的指针,从第8个字节开始读取
		//raf.seek(8*1);
		
		//跳过指定的字节数，只能往后跳
		raf.skipBytes(8);
		
		byte[] buf = new byte[4];
		//将数据装入四字节的字节数组
		raf.read(buf);
		//转为字符串
		String name = new String(buf);
		//从此文件读取一个有符号的 32 位整数。
		int age = raf.readInt();
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		
		raf.close();
	}
	
	//写
	public static void writeFile()throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("E:\\Test\\IO\\ran.txt","rw");
		
		raf.write("李四".getBytes());
		//按四个字节将 int 写入该文件，先写高字节。
		raf.writeInt(97);
		raf.write("王五".getBytes());
		raf.writeInt(99);
		
		raf.close();
	}
	public static void wrtieFile_2()throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("E:\\Test\\IO\\ran.txt","rw");
		//从第8个字节开始写入
		raf.seek(8*1);
		raf.write("周期".getBytes());
		raf.writeInt(103);
		
		raf.close();
		
		
	}

}












