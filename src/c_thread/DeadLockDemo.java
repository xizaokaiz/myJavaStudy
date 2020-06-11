package c_thread;

/*
死锁。
同步中嵌套同步。
 */

class Ticket5 implements Runnable
{
	private int tickt=1000;
	Object obj = new Object();
	boolean flag = true;
	public void run()
	{
		if(flag)
		{
			while(true)
			{
				synchronized(obj)
				{
					show();
				}
					
			}
		}
		else
			while(true)
				show();
	}
	public synchronized void show()//this
	{
		synchronized(obj)
		{
		if(tickt>0)
		{
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"...code:"+tickt--);
		}
		}
	}
}

public class DeadLockDemo 
{
	public static void main(String[] args)
	{
	
		Ticket5 t = new Ticket5();
		
		Thread t1 = new Thread(t);//创建了一个线程
		Thread t2 = new Thread(t);//创建了一个线程
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag = false;
		t2.start();
	}
}
