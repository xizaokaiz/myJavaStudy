package g_IO.�ַ�����;
/*
ASCII:������׼��Ϣ�����롣
	��һ���ֽڵ�7λ���Ա�ʾ����
ISO8859-1:�������ʾ��ŷ�����
	��һ���ֽڵ�8λ��ʾ��
GB2312:�й������ı����
GBK:�й������ı�����������ں��˸�����������ַ��š�
Unicode:���ʱ�׼�룬�ں��˶������֡�
	�������ֶ��������ֽ�����ʾ��Java����ʹ�õľ���Unicode
UTF-8:����������ֽ�����ʾһ���ַ���
 */
import java.io.*;
public class EncodeStream 
{
	public static void main(String[] args)throws IOException
	{
//		writeText();
		readText();
	}
	
	//��
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
	
	//д
	public static void writeText()throws IOException
	{
		OutputStreamWriter osw = new OutputStreamWriter
				(new FileOutputStream("E:\\Test\\IO\\utf.txt"),"UTF-8");//��UTF-8����д��
		
		osw.write("���");
		
		osw.close();
		
	}
}
