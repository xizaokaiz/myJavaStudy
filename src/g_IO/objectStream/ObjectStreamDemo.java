package g_IO.objectStream;
/*
序列化
 */
import java.io.*;
public class ObjectStreamDemo 
{

	public static void main(String[] args) throws Exception
	{
		//writeObj();
		readObj();

	}
	
	//读
	public static void readObj()throws Exception
	{
		//建立序列化对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\Test\\IO\\obj.txt"));
		//读出数据
		Person p = (Person)ois.readObject();
		
		System.out.println(p);
		
		ois.close();
	}
	
	//写
	public static void writeObj()throws IOException
	{
		//建立序列化对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\Test\\IO\\obj.txt"));
		//写入输出流
		oos.writeObject(new Person("lisi",39,"kr"));
		
		oos.close();
		
	}
	
	

}

