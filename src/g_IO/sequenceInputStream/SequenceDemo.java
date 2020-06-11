package g_IO.sequenceInputStream;
/*
序列流：
合并多个流
 */
import java.util.*;
import java.io.*;
public class SequenceDemo {

	public static void main(String[] args)throws IOException {
		//集合，泛型-->指定文件流
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		//添加对象-->文件流
		v.add(new FileInputStream("E:\\Test\\IO\\1.txt"));
		v.add(new FileInputStream("E:\\Test\\IO\\2.txt"));
		v.add(new FileInputStream("E:\\Test\\IO\\3.txt"));
		//讲集合中的元素装入
		Enumeration<FileInputStream> en = v.elements();
		//合并流对象
		SequenceInputStream sis = new SequenceInputStream(en);
		//目的
		FileOutputStream fos = new FileOutputStream("E:\\Test\\IO\\4.txt");
		
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

}
