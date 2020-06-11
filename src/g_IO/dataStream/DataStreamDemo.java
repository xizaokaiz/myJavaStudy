package g_IO.dataStream;
/*
DataInputStream �� DataOutputStream

�������ڲ��������������͵����ݵ�������
 */
import java.io.*;

public class DataStreamDemo {

	public static void main(String[] args)throws IOException {
//		writeData();
//		readData();
		
//		writeUTFData();
		readUTFData();

	}
	
	//��UTF-�޸İ�����
	public static void readUTFData()throws IOException
	{
		DataInputStream dis = new DataInputStream(new FileInputStream("E:\\Test\\IO\\utfdata.txt"));
		
		String s = dis.readUTF();
		
		System.out.println(s);
		
		dis.close();
	}
	
	//дUTF-�޸İ����ͣ�ʹ��ָ�������Ͳ��ܶ���
	public static void writeUTFData()throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\Test\\IO\\utfdata.txt"));
		
		//д��UTF-8�������͵�����
		dos.writeUTF("���");
		
		dos.close();
	}

	//��������
	public static void readData()throws IOException
	{
		//����������
		DataInputStream dis = new DataInputStream(new FileInputStream("E:\\Test\\IO\\data.txt"));
		
		//��Int�����ݱ��浽num��
		int num = dis.readInt();
		boolean b = dis.readBoolean();
		double d = dis.readDouble();
		
		//��ӡ���
		System.out.println("num="+num);
		System.out.println("b="+b);
		System.out.println("d="+d);
		
		dis.close();
	}
	
	//д������
	public static void writeData()throws IOException
	{
		//����������
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\Test\\IO\\data.txt"));
		
		//д��Int������
		dos.writeInt(234);
		//д�벼��������
		dos.writeBoolean(true);
		//д��double������
		dos.writeDouble(22.323);
		
		dos.close();
	}

}
