package c_thread;
/*
同步函数用的哪一个锁呢？
函数需要被对象调用，那么函数都有一个所属对象引用，就是this。
所以同步函数使用的锁是this。

通过该程序进行验证。

使用两个线程来卖票。
一个线程在同步代码块中。
一个线程在同步函数中。
都在执行卖票动作。
 */
class Ticket3 implements Runnable
{
	private int tickt=100;
	Object obj = new Object();
	boolean flag = true;
	public void run()
	{
		if(flag)
		while(true)
		{
			synchronized(this)
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
	public synchronized void show()//this
	{
		if(tickt>0)
		{
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"...show..."+tickt--);
		}
	}
}

public class ThisLockDemo 
{

	public static void main(String[] args) 
	{
		Ticket3 t = new Ticket3();
		
		Thread t1 = new Thread(t);//创建了一个线程
		Thread t2 = new Thread(t);//创建了一个线程
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag = false;
		t2.start();
		
//		Thread t3 = new Thread(t);//创建了一个线程
//		Thread t4 = new Thread(t);//创建了一个线程
//		t3.start();
//		t4.start();

	}

}
