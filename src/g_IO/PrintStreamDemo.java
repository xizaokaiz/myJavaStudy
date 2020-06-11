package g_IO;
/*
打印流：该流提供了打印方法，可以将各种数据类型的数据都原样打印。

字节打印流：PrintStream
构造函数可以接收的参数类型：
1.file对象	File
2.字符串路径 String
3.字节输出流 OutputStream

字节打印流：PrintWriter
构造函数可以接收的参数类型：
1.file对象	File
2.字符串路径 String
3.字节输出流 OutputStream
4.字符输出流 Writer

字符打印流：PrintWriter
 */
import java.io.*;
public class PrintStreamDemo {

	public static void main(String[] args)throws IOException {
		//读取键盘输入
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		//System.out-->控制台输出，new FileWriter()-->封装进流对象里，true-->自动刷新
		PrintWriter out = new PrintWriter(new FileWriter("E:\\Test\\IO\\print.txt"),true);	
		
		String line = null;
		
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			out.println(line.toUpperCase());
		}
		
		out.close();
		bufr.close();
		
		
	}

}
