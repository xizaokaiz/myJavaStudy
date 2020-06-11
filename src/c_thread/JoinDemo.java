package c_thread;

/*
join:
当A线程执行到了B线程的.jion()方法时，A就会等待，等B线程都执行完，A才会执行。

join可以用来临时加入线程执行。

设置优先级：
MAX_PRIORITY 
          线程可以具有的最高优先级。 
MIN_PRIORITY 
          线程可以具有的最低优先级。 
NORM_PRIORITY
	 分配给线程的默认优先级。
	 
yield() 
          暂停当前正在执行的线程对象，并执行其他线程。
 

 */

class Demo2 implements Runnable
{
	public void run()
	{
		for(int x=0;x<70;x++)
		{
			System.out.println(Thread.currentThread().getName()+"..."+x);
			Thread.yield();
		}
	}
}

public class JoinDemo 
{

	public static void main(String[] args)throws Exception
	{
		Demo2 d = new Demo2();
		Thread t1 = new Thread(d);
		Thread t2 = new Thread(d);
		
		t1.start();
		//t1.setPriority(Thread.MAX_PRIORITY);
		
		//t1.join();
		t2.start();
		for(int x=0;x<80;x++)
		{
			System.out.println("mian..."+x);
		}
		System.out.println("over");

	}

}
