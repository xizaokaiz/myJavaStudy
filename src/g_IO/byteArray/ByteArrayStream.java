package g_IO.byteArray;
/*
���ڲ����ֽ������������
�����Ķ�д˼��������ݡ�

ByteArrayInputStream: �ڹ����ʱ����Ҫ��������Դ����������Դ��һ���ֽ����顣

ByteArrayOutputStream:�ڹ����ʱ�򣬲��ö�������Ŀ�ģ���Ϊ�ö������Ѿ��ڲ���װ�˿ɱ䳤�ȵ��ֽ����顣
��������ݵ�Ŀ�ĵء�

��Ϊ�����������󶼲��������飬��û��ʹ��ϵͳ��Դ��
���ԣ����ý���close�رա�

�����������ɽ���ʱ��
Դ�豸������ System.in ��Ӳ�� FileStream ���ڴ� ArrayStream
Ŀ�ģ�����̨ System.out ��Ӳ�� FileStream ���ڴ� ArrayStream

 */

import java.io.*;
public class ByteArrayStream 
{

	public static void main(String[] args) 
	{
		//����Դ
		ByteArrayInputStream bis = new ByteArrayInputStream("ABCDEF".getBytes());
		
		//Ŀ��
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		int by = 0;
		
		while((by=bis.read())!=-1)
		{
			bos.write(by);
		}
		
		System.out.println(bos.size());
		System.out.println(bos.toString());
		
		//д��ָ������������
//		bos.writeTo(new FileOutputStream("a.txt"));

	}

}
