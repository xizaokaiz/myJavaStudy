package g_IO.properties;
/*
ProPerties是hashTable的子类，
也就是说它具备Map集合的特点，而且它里面存储的键值对都是字符串，不需要泛型。
是集合中和IO技术相结合的集合容器，该对象的特点：可以用于键值对形式的配置文件。

那么在加载数据时，需要数据有固定格式：键=值。
 */
import java.io.*;
import java.util.*;
public class PropertiesDemo 
{

	public static void main(String[] args) throws IOException
	{
		loadDemo();

	}
	
	/*演示：如何将流中的数据存储到集合中
	  	想要将info.txt中键值数据存到集合中进行操作：
	  		1.用一个流和info.txt文件关联
	  		2.读取一行数据，将该行数据用“=”进行切割
	  		3.等号左边作为键，右边作为值，存入到Properties集合中即可
	 */
	public static void method_d()throws IOException
	{
		BufferedReader bufr = new BufferedReader(new FileReader("E:\\Test\\IO\\info.txt"));
		
		String line = null;
		
		Properties prop = new Properties();
		
		//读取一行进行判断
		while((line=bufr.readLine())!=null)
		{
			//按"="切分
			String[] arr = line.split("=");
			prop.setProperty(arr[0], arr[1]);
		}
		bufr.close();
		
		System.out.println(prop);
		
	}
	//用load方法存储到集合
	public static void loadDemo()throws IOException
	{
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\Test\\IO\\info.txt");
		
		//将流中的数据加载进集合
		prop.load(fis);
		
		prop.setProperty("wangwu", 39+"");
		
		FileOutputStream fos = new FileOutputStream("E:\\Test\\IO\\info.txt");
		
		prop.store(fos,"haha");
		
		prop.list(System.out);
		
		fos.close();
		fis.close();
		
		
	}
	
	//设置和获取元素
	public static void setAndGet()
	{
		Properties prop = new Properties();
		
		prop.setProperty("zhangsan","20");
		prop.setProperty("lisi","30");
		
		System.out.println(prop);
		
		String value = prop.getProperty("lisi");
		System.out.println(value);
		
		//设置集合
		prop.setProperty("lisi", 89+"");
		
		//遍历集合
		Set<String> names = prop.stringPropertyNames();
		for(String s:names) {
			System.out.println(s+":"+prop.getProperty(s));
		}
		
	}

}
