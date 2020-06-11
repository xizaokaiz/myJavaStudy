package g_IO.properties;
/*
ProPerties��hashTable�����࣬
Ҳ����˵���߱�Map���ϵ��ص㣬����������洢�ļ�ֵ�Զ����ַ���������Ҫ���͡�
�Ǽ����к�IO�������ϵļ����������ö�����ص㣺�������ڼ�ֵ����ʽ�������ļ���

��ô�ڼ�������ʱ����Ҫ�����й̶���ʽ����=ֵ��
 */
import java.io.*;
import java.util.*;
public class PropertiesDemo 
{

	public static void main(String[] args) throws IOException
	{
		loadDemo();

	}
	
	/*��ʾ����ν����е����ݴ洢��������
	  	��Ҫ��info.txt�м�ֵ���ݴ浽�����н��в�����
	  		1.��һ������info.txt�ļ�����
	  		2.��ȡһ�����ݣ������������á�=�������и�
	  		3.�Ⱥ������Ϊ�����ұ���Ϊֵ�����뵽Properties�����м���
	 */
	public static void method_d()throws IOException
	{
		BufferedReader bufr = new BufferedReader(new FileReader("E:\\Test\\IO\\info.txt"));
		
		String line = null;
		
		Properties prop = new Properties();
		
		//��ȡһ�н����ж�
		while((line=bufr.readLine())!=null)
		{
			//��"="�з�
			String[] arr = line.split("=");
			prop.setProperty(arr[0], arr[1]);
		}
		bufr.close();
		
		System.out.println(prop);
		
	}
	//��load�����洢������
	public static void loadDemo()throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Test\\IO\\info.txt");
		
		//�����е����ݼ��ؽ�����
		prop.load(fis);
		
		prop.setProperty("wangwu", 39+"");
		
		FileOutputStream fos = new FileOutputStream("E:\\Test\\IO\\info.txt");
		
		prop.store(fos,"haha");
		
		prop.list(System.out);
		
		fos.close();
		fis.close();
		
		
	}
	
	//���úͻ�ȡԪ��
	public static void setAndGet()
	{
		Properties prop = new Properties();
		
		prop.setProperty("zhangsan","20");
		prop.setProperty("lisi","30");
		
		System.out.println(prop);
		
		String value = prop.getProperty("lisi");
		System.out.println(value);
		
		//���ü���
		prop.setProperty("lisi", 89+"");
		
		//��������
		Set<String> names = prop.stringPropertyNames();
		for(String s:names) {
			System.out.println(s+":"+prop.getProperty(s));
		}
		
	}

}
