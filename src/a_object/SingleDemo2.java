package a_object;
/*
这个是先初始化对象。
称为：饿汉式。

Single类一进内存，就已经创建好了对象。
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

//对象是方法被调用是，才初始化，也叫做对象的<延时加载>。称为：懒汉式。
//Single类进内存，对象还没有存在，只有调用了getInstance方法时，才建立对象。
class Single2
{
	private static Single2 s = null;
	private Single2() {}
	public static synchronized Single2 getInstance() //synchronized：同步
	{
		if(s==null)
		{
			synchronized(Single.class)//锁
			{
				if(s==null)
					s = new Single2();
			}
		}
		return s;
	}
}
//记录原则：定义单例，建议使用饿汉式。
public class SingleDemo2 
{
	
	
	public static void main(String[] args) 
	{
		

	}

}
