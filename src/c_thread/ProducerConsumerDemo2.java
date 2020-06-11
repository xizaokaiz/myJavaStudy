package c_thread;


import java.util.concurrent.locks.*;
/*
JDK1.5 ���ṩ�˶��߳��������������
��ͬ��Synchronized�滻����ʵLock������
��Object�е�wait��notify��notifyAll,�滻��Condition����
�ö������Lock�� ���л�ȡ��
��ʵ���У�ʵ���˱���ֻ���ѶԷ��Ĳ�����
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
				System.out.println(Thread.currentThread().getName()+"...������..."+this.name);
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
			System.out.println(Thread.currentThread().getName()+"...������......."+this.name);
			flag = false;
			condition_pro.signal();
		}
		finally
		{
			lock.unlock();//�ͷ����Ķ���һ��Ҫִ�С�
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
				res.set("+��Ʒ+");
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
