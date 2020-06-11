package c_thread;
/*
如果同步函数被静态修饰后，使用的锁是什么？

通过验证，发现不在是this。因为静态方法中也不可以定义this。

静态进内存时，内存中没有本类对象，但是一定有该类对应的字节码文件对象。
类名.class 该对象的类型是Class

静态的同步方法，使用的锁是该方法所在类的字节码文件对象。类名.class
 */

class Ticket4 implements Runnable
{
	private static int tickt=100;
	//Object obj = new Object();
	boolean flag = true;
	public void run()
	{
		if(flag)
		while(true)
		{
			synchronized(Ticket4.class)
			{
				if(tickt>0)
				{
					try{Thread.sleep(10);}catch(Exception e){}
					System.out.println(Thread.currentThread().getName()+"...code:"+tickt--);
				}
			}
				
		}
		else
			while(true)
				show();
	}
	public static synchronized void show()//this
	{
		if(tickt>0)
		{
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"...show..."+tickt--);
		}
	}
}

public class StaticMethodDemo 
{

	public static void main(String[] args) 
	{
		Ticket4 t = new Ticket4();
		
		Thread t1 = new Thread(t);//创建了一个线程
		Thread t2 = new Thread(t);//创建了一个线程
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag = false;
		t2.start();

	}

}
