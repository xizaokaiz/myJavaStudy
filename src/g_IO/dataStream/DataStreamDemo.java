package g_IO.dataStream;
/*
DataInputStream 与 DataOutputStream

可以用于操作基本数据类型的数据的流对象。
 */
import java.io.*;

public class DataStreamDemo {

	public static void main(String[] args)throws IOException {
//		writeData();
//		readData();
		
//		writeUTFData();
		readUTFData();

	}
	
	//读UTF-修改版类型
	public static void readUTFData()throws IOException
	{
		DataInputStream dis = new DataInputStream(new FileInputStream("E:\\Test\\IO\\utfdata.txt"));
		
		String s = dis.readUTF();
		
		System.out.println(s);
		
		dis.close();
	}
	
	//写UTF-修改版类型，使用指定的类型才能读出
	public static void writeUTFData()throws IOException
	{
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\Test\\IO\\utfdata.txt"));
		
		//写入UTF-8编码类型的内容
		dos.writeUTF("你好");
		
		dos.close();
	}

	//读出数据
	public static void readData()throws IOException
	{
		//创建输入流
		DataInputStream dis = new DataInputStream(new FileInputStream("E:\\Test\\IO\\data.txt"));
		
		//将Int型数据保存到num中
		int num = dis.readInt();
		boolean b = dis.readBoolean();
		double d = dis.readDouble();
		
		//打印结果
		System.out.println("num="+num);
		System.out.println("b="+b);
		System.out.println("d="+d);
		
		dis.close();
	}
	
	//写入数据
	public static void writeData()throws IOException
	{
		//创建输入流
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\Test\\IO\\data.txt"));
		
		//写入Int型数据
		dos.writeInt(234);
		//写入布尔型数据
		dos.writeBoolean(true);
		//写入double型数据
		dos.writeDouble(22.323);
		
		dos.close();
	}

}
