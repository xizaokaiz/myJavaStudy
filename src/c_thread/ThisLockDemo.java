package c_thread;
/*
ͬ�������õ���һ�����أ�
������Ҫ��������ã���ô��������һ�������������ã�����this��
����ͬ������ʹ�õ�����this��

ͨ���ó��������֤��

ʹ�������߳�����Ʊ��
һ���߳���ͬ��������С�
һ���߳���ͬ�������С�
����ִ����Ʊ������
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
		
		Thread t1 = new Thread(t);//������һ���߳�
		Thread t2 = new Thread(t);//������һ���߳�
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag = false;
		t2.start();
		
//		Thread t3 = new Thread(t);//������һ���߳�
//		Thread t4 = new Thread(t);//������һ���߳�
//		t3.start();
//		t4.start();

	}

}
