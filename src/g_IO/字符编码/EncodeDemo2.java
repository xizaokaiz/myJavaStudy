package g_IO.�ַ�����;
/*
��ͨ����
 */
import java.io.*;
public class EncodeDemo2 
{

	public static void main(String[] args) throws Exception
	{
		String s = "��ͨ";
		
		byte[] by = s.getBytes("gbk");
		
		for(byte b:by)
		{
			//ת������ȡ����λ
			System.out.println(Integer.toBinaryString(b&255));
		}
		
	}

}
