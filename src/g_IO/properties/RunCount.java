package g_IO.properties;
/*
��ϰ�����ڼ�¼Ӧ�ó������д�����
	���ʹ�ô����ѵ�����ô����ע����ʾ��

�������뵽���ǣ���������
���Ǹü����������ڳ����У����ų�������ж����ڴ��д��ڣ���������������
�����Ÿ�Ӧ�ó�����˳����ü�����Ҳ���ڴ�����ʧ�ˡ�
��һ���������ó��������¿�ʼ�����������������������Ҫ�ġ�

����ʹ�������ü�������ֵҲ���ڣ��´γ����������ȼ��ظü�������ֵ����1�������´洢������
����Ҫ����һ�������ļ������ڼ�¼�������ʹ�ô�����

�������ļ�ʹ�ü�ֵ�Ե���ʽ�����������Ķ����ݣ����������ݡ�
��ֵ������ʱmap���ϣ�����ʱ���ļ���ʽ�洢��ʹ��IO��������ômap+IO -->properties.
�����ļ�����ʵ��Ӧ�ó������ݵĹ���
 */
import java.io.*;
import java.util.*;
public class RunCount 
{

	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		
		//���ļ���װ��һ������
		File file = new File("E:\\Test\\IO\\count.ini");
		//�ж��ļ��Ƿ���ڣ��������ڣ����½�
		if(!file.exists()) 
		{
			file.createNewFile();
		}
		
		//���ļ�����������
		FileInputStream fis = new FileInputStream(file);
		
		//���ļ����뼯��
		prop.load(fis);
		
		//�����ļ�������,�����ļ�ʹ�ô���
		int count = 0;
		String value = prop.getProperty("time");
		//�жϴ���
		if(value!=null)
		{
			//��time�м�����������count
			count = Integer.parseInt(value);
			if(count>=5)
			{
				System.out.println("���ã�ʹ�ô����ѵ�����Ǯ��");
				return ;
			}
		}
		count++;
		
		//��countֵ����time��
		prop.setProperty("time", count+"");
		//�������е���Ϣд���ļ�
		FileOutputStream fos = new FileOutputStream(file);
		prop.store(fos, "");
		
		fis.close();
		fos.close();
		
		
		
		

	}

}




