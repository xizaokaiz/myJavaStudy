package g_IO.file;
import java.io.*;
/*
File��ĳ���������
1.����
	boolean createNewFile();��ָ��λ�ô����ļ���������ļ��Ѿ����ڣ��򲻻��ٴ���������false��
							�����������һ�������������һ�����ͻᴴ���ļ�������ļ��Ѿ������򱻸��ǡ�
	createTempFile();������ʱ�ļ���
	boolean mkdir();�����ļ��С�
	boolean mkidrs();�����༶�ļ��С�
2.ɾ��
	boolean delete();ɾ��ʧ�ܷ���false��
	void deleteOnExit();�ڳ����˳�ʱɾ��ָ���ļ���
3.�ж�
	boolean exists();�ļ��Ƿ���ڡ�
	isFile();�Ƿ����ļ���
	isDirectory();�Ƿ���Ŀ¼��
	isHidden();�Ƿ��������ļ���
	isAbsolute();�Ƿ��Ǿ���·����

4.��ȡ��Ϣ
	getName();��ȡ���ơ�
	getPath();��ȡ·����
	getParent();��ȡ��Ŀ¼��
	
	getAbsoluteFile();��ȡ����·����
	long lastModified();��ȡ�ļ����һ�α��޸ĵ�ʱ�䡣
	long length();��ȡ�ļ����ֽ�����
 */
public class FileDemo 
{
	public static void main(String[] args)throws IOException
	{
		method_6();
	}
	
	//����File����
	public static void comsMethod()
	{
		//��a.txt��װ��file���󣬿��Խ����еĺ�δ���ֵ��ļ������ļ��з�װ�ɶ���
		File f1 = new File("E:\\Test\\IO\\in.txt");
		//���(��Ŀ¼�����ļ�[Ҳ�ɱ���])
		File f2 = new File("E:\\Test\\IO","in.txt");
		//��ɴ������󱣴游Ŀ¼
		File d = new File("E:\\Test\\IO");
		File f3 = new File(d,"in.txt");
		
		System.out.println("f1:"+f1);
		System.out.println("f2:"+f2);
		System.out.println("f3:"+f3);
		//��ƽ̨��ʶ��ķָ�����File.separator
		File f4 = new File("E:"+File.separator+"Test"+File.separator+"IO"+File.separator+"in.txt");
		
	}
	
	//�����ļ�
	public static void method_1()throws IOException
	{
		File f = new File("E:\\Test\\IO\\file.txt");
//		System.out.println("create:"+f.createNewFile());
		//�����ļ���
		File dir = new File("E:\\Test\\IO\\Mkdir");
		System.out.println("mkdir:"+dir.mkdir());
	}
	
	//ɾ���ļ�
	public static void method_2()throws IOException
	{
		File f = new File("E:\\Test\\IO\\file.txt");
		System.out.println("detele:"+f.delete());
	}
	
	//�ж��ļ�
	public static void method_3()throws IOException
	{
		File f = new File("E:\\Test\\IO\\file.txt");
//		System.out.println("execute:"+f.canExecute());
		System.out.println("exist:"+f.exists());
	}
	
	//�ж��ļ�
	public static void method_4()throws IOException
	{
		File f = new File("file.txt");
		//��ס���ж��ļ������Ƿ����ļ�����Ŀ¼ʱ������Ҫ���жϸ��ļ������װ�������Ƿ���ڣ�
		//ͨ��exists�жϡ�
		System.out.println("dir:"+f.isDirectory());
		System.out.println("file:"+f.isFile());
		System.out.println("absolute:"+f.isAbsolute());
		
	}
	
	//��ȡ��Ϣ
	public static void method_5()
	{
		File f = new File("E:\\Test\\IO\\file.txt");
		System.out.println("path:"+f.getPath());
		System.out.println("abspath:"+f.getAbsolutePath());
		System.out.println("parent:"+f.getParent());//�÷������ص��Ǿ���·���еĸ�Ŀ¼�������ȡ�������·��������null��
													//������·��������һ��Ŀ¼��ô��Ŀ¼���Ƿ��ؽ����
		System.out.println("length:"+f.length());
	}
	
	//�޸��ļ���/�ƶ��ļ���
	public static void method_6()
	{
		File f1 = new File("E:\\Test\\IO\\in.txt");
		File f2 = new File("E:\\Test\\IO\\iin.txt");
		
		System.out.println("rename:"+f1.renameTo(f2));
		
	}
	
	
	
	

}
