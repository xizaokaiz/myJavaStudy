package g_IO.randomAccessFile;
/*
RandomAccessFile

���಻����IO��ϵ�е����࣬����ֱ�Ӽ̳���Object��

��������IO���еĳ�Ա����Ϊ���߱�����д�Ĺ��ܣ�
�ڲ���װ��һ�����飬����ͨ��ָ��������Ԫ�ؽ��в�����
����ͨ��getFilePointer��ȡָ��λ�ã�ͬʱ����ͨ��seek�ı�ָ��λ�á�

��ʵ��ɶ�д��ԭ������ڲ���װ���ֽ����������������
��ͨ�����캯�����Կ���������ֻ�ܲ����ļ���
���Ҳ����ļ�����ģʽ��ֻ�� r ,��д rw

���ģʽΪֻ��r�����ᴴ���ļ�����ȥ��ȡһ���Ѵ��ڵ��ļ���������ļ������ڣ��������쳣��
���ģʽΪrw�����Ҹö���Ĺ��캯��Ҫ�������ļ������ڣ����Զ���������������򲻻Ḳ�ǡ�
  

 */
import java.io.*;
public class RandomAccessFileDemo 
{

	public static void main(String[] args) throws IOException
	{
		wrtieFile_2();

	}
	
	//��
	public static void readFile()throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("E:\\Test\\IO\\ran.txt","r");
		
		//���������е�ָ��,�ӵ�8���ֽڿ�ʼ��ȡ
		//raf.seek(8*1);
		
		//����ָ�����ֽ�����ֻ��������
		raf.skipBytes(8);
		
		byte[] buf = new byte[4];
		//������װ�����ֽڵ��ֽ�����
		raf.read(buf);
		//תΪ�ַ���
		String name = new String(buf);
		//�Ӵ��ļ���ȡһ���з��ŵ� 32 λ������
		int age = raf.readInt();
		
		System.out.println("name="+name);
		System.out.println("age="+age);
		
		raf.close();
	}
	
	//д
	public static void writeFile()throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("E:\\Test\\IO\\ran.txt","rw");
		
		raf.write("����".getBytes());
		//���ĸ��ֽڽ� int д����ļ�����д���ֽڡ�
		raf.writeInt(97);
		raf.write("����".getBytes());
		raf.writeInt(99);
		
		raf.close();
	}
	public static void wrtieFile_2()throws IOException
	{
		RandomAccessFile raf = new RandomAccessFile("E:\\Test\\IO\\ran.txt","rw");
		//�ӵ�8���ֽڿ�ʼд��
		raf.seek(8*1);
		raf.write("����".getBytes());
		raf.writeInt(103);
		
		raf.close();
		
		
	}

}












