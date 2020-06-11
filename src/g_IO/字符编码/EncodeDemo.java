package g_IO.字符编码;
/*
编码：字符串变成字节数组。

解码：字节数组变成字符串。

String-->byte[]; str.getBytes(charsetName);
byte[]-->String; new String(byte[],charsetName); 
 */
import java.util.*;
public class EncodeDemo 
{

	public static void main(String[] args) throws Exception
	{
		String s = "你好";
		
		//字符串转换字节数组
		byte[] b1 = s.getBytes("gbk");
		//打印字节数组内容
		System.out.println(Arrays.toString(b1));
		//解码格式错误,解决方法：将编码重新编入字节数组，再解码。
		String s1 = new String(b1,"iso8859-1");
		System.out.println("s1="+s1);
		//对s1进行iso8859-1编码
		byte[] b2 = s1.getBytes("iso8859-1");
		String s2 = new String(b2,"gbk");
		System.out.println(Arrays.toString(b2));
		System.out.println("s2="+s2);
		
		/*
		若用gbk-->utf-8-->gbk若用上种情况是不能正确解码的，
		因为两种编码格式都涉及到了中文字符。
		 */

	}

}
