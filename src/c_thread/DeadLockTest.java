package c_thread;

class Test2 implements Runnable
{
	private boolean flag;
	Test2(boolean flag)
	{
		this.flag = flag;
	}
	public void run()
	{
		if(flag)
		{
			while(true)
			{
			synchronized(MyLock.Locka)
			{
				System.out.println("if Locka");
				
				synchronized(MyLock.Lockb)
				{
					System.out.println("if Lockb");
				}
			}
			}
			
		}
		else
		{
			while(true)
			{
			synchronized(MyLock.Lockb)
			{
				System.out.println("else Lockb");
				
				synchronized(MyLock.Locka)
				{
					System.out.println("else Locka");
				}
			}
			}
		}
	}
}
class MyLock
{
	static Object Locka = new Object();
	static Object Lockb = new Object();
}

public class DeadLockTest 
{

	public static void main(String[] args) 
	{
		Thread t1 = new Thread(new Test2(true));
		Thread t2 = new Thread(new Test2(false));
		t1.start();
		t2.start();

	}

}
