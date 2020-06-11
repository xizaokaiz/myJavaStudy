package other_object;

/*
Runtime对象
该类并没有提供构造函数，
说明不可以new对象。那么会直接想到该类中的方法都是静态的，
发现该类中还有非静态方法，说明该类肯定会提供了方法获取本类对象，
而且该方法时静态的，并返回值类型是本类类型。

由这个特点可以看出该类使用了单例设计模式完成。

该方法时static Runtime getRuntime();
 */

public class RuntimeDemo 
{

	public static void main(String[] args) throws Exception
	{
		Runtime r = Runtime.getRuntime();
		//返回一个进程
		Process p = r.exec("notepad.exe SystemDemo.java");
		
//		Thread.sleep(4000);
//		
//		//杀掉进程
//		p.destroy();
	}

}
