package g_IO.�ַ�����;
/*
���룺�ַ�������ֽ����顣

���룺�ֽ��������ַ�����

String-->byte[]; str.getBytes(charsetName);
byte[]-->String; new String(byte[],charsetName); 
 */
import java.util.*;
public class EncodeDemo 
{

	public static void main(String[] args) throws Exception
	{
		String s = "���";
		
		//�ַ���ת���ֽ�����
		byte[] b1 = s.getBytes("gbk");
		//��ӡ�ֽ���������
		System.out.println(Arrays.toString(b1));
		//�����ʽ����,������������������±����ֽ����飬�ٽ��롣
		String s1 = new String(b1,"iso8859-1");
		System.out.println("s1="+s1);
		//��s1����iso8859-1����
		byte[] b2 = s1.getBytes("iso8859-1");
		String s2 = new String(b2,"gbk");
		System.out.println(Arrays.toString(b2));
		System.out.println("s2="+s2);
		
		/*
		����gbk-->utf-8-->gbk������������ǲ�����ȷ����ģ�
		��Ϊ���ֱ����ʽ���漰���������ַ���
		 */

	}

}
