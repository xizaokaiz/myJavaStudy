package g_IO.objectStream;
/*
���л�
 */
import java.io.*;
public class ObjectStreamDemo 
{

	public static void main(String[] args) throws Exception
	{
		//writeObj();
		readObj();

	}
	
	//��
	public static void readObj()throws Exception
	{
		//�������л�����
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\Test\\IO\\obj.txt"));
		//��������
		Person p = (Person)ois.readObject();
		
		System.out.println(p);
		
		ois.close();
	}
	
	//д
	public static void writeObj()throws IOException
	{
		//�������л�����
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\Test\\IO\\obj.txt"));
		//д�������
		oos.writeObject(new Person("lisi",39,"kr"));
		
		oos.close();
		
	}
	
	

}

