package g_IO.字节流;

/*
 * 字符流-->字节流          字节流-->字符流
字符流：
FileReader
FIleWriter

BufferedReader
BufferedWriter
字节流：
FileInputStream
FileOutputStream

BufferedInputStream
BufferedOutputStream
--------------------------------------------------------------
通过刚才的键盘录入一行数据并打印其大写，发现其实就是读一行数据的原理，
也就是readLine方法。
能不能直接使用readLine方法来完成键盘录入的一行数据的读取呢？

readLine方法是BufferedReader类中的方法，
而键盘录入的read方法是字节流InputStream的方法。
那么能不能将自接力转成字符流，再使用字符流缓冲区中的readLine方法呢？
 */
import java.io.*;
public class TransStreamDemo 
{

	public static void main(String[] args) throws IOException
	{
		/*
		//获取键盘录入对象。
		InputStream in = System.in;
		//将字节流对象转成字符流对象，使用转换流：InputStreamReader。
		InputStreamReader isr = new InputStreamReader(in);
		//为了提高效率，将字符流进行缓冲区技术的高效操作：BufferedReader。
		BufferedReader bufr = new BufferedReader(isr);
		*/
		//键盘录入常见写法
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		/*
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			System.out.println(line.toUpperCase());
		}
		bufr.close();
		*/
		
		OutputStream out = System.out;
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		String line = null;
		while((line=bufr.readLine())!=null)
		{
			if("over".equals(line))
				break;
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
		bufr.close();
		
		
	}

}
