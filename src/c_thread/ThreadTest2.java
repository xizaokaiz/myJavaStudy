package c_thread;

/*
开发时如何建立线程
 */

public class ThreadTest2 
{

	public static void main(String[] args) 
	{
		new Thread()
		{
			public void run()
			{
				for(int x=0;x<80;x++)
				{
					 System.out.println(Thread.currentThread().getName()+"..."+x);
				}
			}
		}.start();
		 
		for(int x=0;x<80;x++)
		{
			System.out.println(Thread.currentThread().getName()+"..."+x);
		}
		 
		Runnable r = new Runnable()
		{
			 public void run()
			 {
				 for(int x=0;x<80;x++)
				 {
					 System.out.println(Thread.currentThread().getName()+"..."+x);
				 }
			 }
		};
		new Thread(r).start();
		 

	}

}
