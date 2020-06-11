package g_IO.字符编码;
/*
ASCII:美国标准信息交换码。
	用一个字节的7位可以表示。、
ISO8859-1:拉丁码表示。欧洲码表
	用一个字节的8位表示。
GB2312:中国的中文编码表。
GBK:中国的中文编码表升级，融合了更多的中文文字符号。
Unicode:国际标准码，融合了多种文字。
	所有文字都用两个字节来表示，Java语言使用的就是Unicode
UTF-8:最多用三个字节来表示一个字符。
 */
import java.io.*;
public class EncodeStream 
{
	public static void main(String[] args)throws IOException
	{
//		writeText();
		readText();
	}
	
	//读
	public static void readText()throws IOException
	{
		InputStreamReader isr = new InputStreamReader
				(new FileInputStream("E:\\Test\\IO\\utf.txt"),"GBK");
		
		char[] buf = new char[10];
		int len = isr.read(buf);
		
		String str = new String(buf,0,len);
		
		System.out.println(str);
		
		
		isr.close();
	}
	
	//写
	public static void writeText()throws IOException
	{
		OutputStreamWriter osw = new OutputStreamWriter
				(new FileOutputStream("E:\\Test\\IO\\utf.txt"),"UTF-8");//按UTF-8类型写入
		
		osw.write("你好");
		
		osw.close();
		
	}
}
