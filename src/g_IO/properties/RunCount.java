package g_IO.properties;
/*
练习：用于记录应用程序运行次数，
	如果使用次数已到，那么给出注册提示。

很容易想到的是：计数器。
可是该计数器定义在程序中，随着程序的运行而在内存中存在，并进行了自增。
但随着该应用程序的退出，该计数器也在内存中消失了。
下一次在启动该程序，又重新开始从零计数，这样不是我们想要的。

程序即使结束，该计数器的值也存在，下次程序启动会先加载该计数器的值并加1后再重新存储起来，
所以要建立一个配置文件，用于记录该软件的使用次数。

该配置文件使用键值对的形式，这样便于阅读数据，并操作数据。
键值对数据时map集合，数据时以文件形式存储，使用IO技术，那么map+IO -->properties.
配置文件可以实现应用程序数据的共享。
 */
import java.io.*;
import java.util.*;
public class RunCount 
{

	public static void main(String[] args) throws IOException
	{
		Properties prop = new Properties();
		
		//将文件封装成一个对象
		File file = new File("E:\\Test\\IO\\count.ini");
		//判断文件是否存在，若不存在，则新建
		if(!file.exists()) 
		{
			file.createNewFile();
		}
		
		//将文件对象传入流中
		FileInputStream fis = new FileInputStream(file);
		
		//将文件传入集合
		prop.load(fis);
		
		//建立文件计数器,计算文件使用次数
		int count = 0;
		String value = prop.getProperty("time");
		//判断次数
		if(value!=null)
		{
			//将time中计数次数存入count
			count = Integer.parseInt(value);
			if(count>=5)
			{
				System.out.println("您好，使用次数已到，拿钱！");
				return ;
			}
		}
		count++;
		
		//将count值传入time键
		prop.setProperty("time", count+"");
		//将集合中的信息写入文件
		FileOutputStream fos = new FileOutputStream(file);
		prop.store(fos, "");
		
		fis.close();
		fos.close();
		
		
		
		

	}

}




