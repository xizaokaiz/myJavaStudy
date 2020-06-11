package g_IO.file;
/*
�г�ָ��Ŀ¼���ļ������ļ��У�������Ŀ¼�е����ݣ�Ҳ�����г�ָ��Ŀ¼���������ݡ�

��ΪĿ¼�л���Ŀ¼��ֻҪʹ��ͬһ���г�Ŀ¼���ܵĺ�����ɼ��ɣ�
���г������г��ֵĻ���Ŀ¼�Ļ��������ٴε��ñ����ܣ�Ҳ���Ǻ��������������
���ֱ�����ʽ���߱���ַ�����Ϊ�ݹ顣

�ݹ�ע�⣺
1.�޶�����
2.Ҫע��ݹ�Ĵ��������������ڴ������

 */
import java.io.*;
public class FileDemo3 
{

	public static void main(String[] args) 
	{
		File dir = new File("E:\\Test");
		showDir(dir,0);
		//showDir(dir);
		//toBin(4);
		
	}
	
	//��Ŀ¼�ȼ�����Ŀ¼
	public static String getLevel(int level)
	{
		StringBuilder sb = new StringBuilder();
		for(int x=0;x<level;x++)
		{
			sb.append("|--");
		}
		return sb.toString();
	}
	
	//�ݹ�ʮ����ת������
	public static void toBin(int num)
	{
		if(num>0)
		{
			toBin(num/2);
			System.out.println(num%2);
		}
	}
	
	public static void showDir(File dir,int level)
	{
		System.out.println(getLevel(level)+level);
		level++;
		//��ʾ�ļ���
		System.out.println(dir);
		File[] files = dir.listFiles();
		//����Ŀ¼
		for(int x=0; x<files.length; x++)
		{
			//�ж��Ƿ�Ϊ�ļ���
			if(files[x].isDirectory())
				//��Ϊ�棬��������ļ���
				showDir(files[x],level);
			else
				System.out.println(getLevel(level)+files[x]);
			
		}
				
	}

}
