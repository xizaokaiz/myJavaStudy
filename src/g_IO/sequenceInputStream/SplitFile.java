package g_IO.sequenceInputStream;
/*
文件的切分和合并
 */
import java.io.*;
import java.util.*;
public class SplitFile {

	public static void main(String[] args)throws IOException {
		//splitFile();
		merge();

	}
	//文件合并
	public static void merge()throws IOException
	{
		//将源碎片存入集合
		ArrayList<FileInputStream> arr = new ArrayList<FileInputStream>();
		
		for(int x=1;x<=9;x++)
		{
			arr.add(new FileInputStream("E:\\Test\\IO\\splitfile\\"+(x++)+".part"));
		}
		//因为是匿名内部类，所以用final修饰(即不能被复写)
		final Iterator<FileInputStream> it = arr.iterator();
		//复写方法,获取源
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>()
		{
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
			public FileInputStream nextElement()
			{
				return it.next();
			}
		};
		//合并碎片
		SequenceInputStream sis = new SequenceInputStream(en);
		//目的
		FileOutputStream fos = new FileOutputStream("E:\\Test\\IO\\splitfile\\0.MP3");
		
		byte[] buf = new byte[1024];
		
		int len = 0;
		while((len=sis.read(buf))!=-1)
		{
			//从0个字节开始将len写入到buf，存入fos中
			fos.write(buf,0,len);
		}
		
		fos.close();
		sis.close();
		
	}
	
	//文件切分-->字节流
	public static void splitFile()throws IOException
	{
		//源
		FileInputStream fis = new FileInputStream("E:\\Test\\IO\\splitfile\\1.MP3");
		
		FileOutputStream fos = null;
		//按1MB来切分
		byte[] buf = new byte[1024*1024];
		
		int len = 0;
		int count = 1;
		while((len=fis.read(buf))!=-1)
		{
			//目的
			fos = new FileOutputStream("E:\\Test\\IO\\splitfile\\"+(count++)+".part");
			fos.write(buf,0,len);
			fos.close();
		}
		
		fis.close();
	}
	

}
