package c_thread;


import java.util.concurrent.locks.*;
/*
JDK1.5 中提供了多线程升级解决方案。
将同步Synchronized替换成现实Lock操作。
将Object中的wait，notify，notifyAll,替换了Condition对象。
该对象可以Lock锁 进行获取。
该实例中，实现了本方只唤醒对方的操作。
 */

class Resource2
{
	private String name;
	private int count = 1;
	private boolean flag = false;
	private Lock lock = new ReentrantLock();
	private Condition condition_pro = lock.newCondition();
	private Condition condition_con = lock.newCondition();
	public void set(String name)throws InterruptedException
	{
			lock.lock();			
			try
			{
				while(flag)
					condition_pro.await();
				this.name = name+"--"+count++;
				flag = true;
				System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
				condition_con.signal();
			}
			finally
			{
				lock.unlock();
			}
			
		
	}
	public synchronized void out()throws InterruptedException
	{
		lock.lock();
		try 
		{
			while(!flag)
				condition_con.await();
			System.out.println(Thread.currentThread().getName()+"...消费者......."+this.name);
			flag = false;
			condition_pro.signal();
		}
		finally
		{
			lock.unlock();//释放锁的动作一定要执行。
		}
	}
}

class Producer2 implements Runnable
{
	private Resource2 res;
	
	Producer2(Resource2 res)
	{
		this.res = res;
	}
	public void run()
	{
		while(true)
		{
			try
			{
				res.set("+商品+");
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}
class Consumer2 implements Runnable
{
	private Resource2 res;
	
	Consumer2(Resource2 res)
	{
		this.res = res;
	}
	public void run()
	{
		while(true)
		{
			try 
			{
				res.out();
			}
			catch(InterruptedException e)
			{
				
			}
		}
	}
}

public class ProducerConsumerDemo2 
{

	public static void main(String[] args) 
	{
		Resource2 r = new Resource2();
		
		Producer2 pro = new Producer2(r);
		Consumer2 con = new Consumer2(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		Thread t3 = new Thread(pro);
		Thread t4 = new Thread(con);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
