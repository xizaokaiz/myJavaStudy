package g_IO.file;
/*
ɾ��һ�������ݵ�Ŀ¼��
ɾ��ԭ��
��windows�У�ɾ��Ŀ¼������������ɾ���ģ�
��Ȼ�Ǵ�������ɾ��������Ҫ�õ��ݹ顣
 */
import java.io.*;
public class RemoveDir 
{

	public static void main(String[] args) 
	{
		File dir = new File("E:\\Test\\IO\\�½��ļ���");
		removeDir(dir);

	}
	
	//ɾ��Ŀ¼
	public static void removeDir(File dir)
	{
		File[] files = dir.listFiles();
		//����Ŀ¼
		for(int x=0;x<files.length;x++)
		{
			//�ж��Ƿ�ΪĿ¼
			if(files[x].isDirectory())
				//���ǣ�������ж�ֱ����ΪĿ¼
				removeDir(files[x]);
				//��ӡɾ�����ļ����ƣ�ɾ���ļ�
				System.out.println(files[x].toString()+":-file-:"+files[x].delete());
		}
		//��ӡɾ����Ŀ¼���ƣ�ɾ��Ŀ¼
		System.out.println(dir+"::dir::"+dir.delete());
	}

}
