package c_thread;

/*
������
ͬ����Ƕ��ͬ����
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
		
		Thread t1 = new Thread(t);//������һ���߳�
		Thread t2 = new Thread(t);//������һ���߳�
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag = false;
		t2.start();
	}
}
