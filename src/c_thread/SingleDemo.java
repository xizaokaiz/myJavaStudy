package c_thread;

/*
单例设计模式。掌握
 */

/*
饿汉式。
class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}

 */

//懒汉式
class Single
{
	private static Single s = null;
	private Single(){}
	
	public static Single getInstance()
	{
		if(s==null)
		{
			synchronized(Single.class)
			{
				if(s==null)
					s = new Single();
			}
		}
		return s;
	}
}

public class SingleDemo 
{

	public static void main(String[] args) 
	{
		

	}

}
