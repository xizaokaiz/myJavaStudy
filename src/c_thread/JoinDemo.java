package c_thread;

/*
join:
��A�߳�ִ�е���B�̵߳�.jion()����ʱ��A�ͻ�ȴ�����B�̶߳�ִ���꣬A�Ż�ִ�С�

join����������ʱ�����߳�ִ�С�

�������ȼ���
MAX_PRIORITY 
          �߳̿��Ծ��е�������ȼ��� 
MIN_PRIORITY 
          �߳̿��Ծ��е�������ȼ��� 
NORM_PRIORITY
	 ������̵߳�Ĭ�����ȼ���
	 
yield() 
          ��ͣ��ǰ����ִ�е��̶߳��󣬲�ִ�������̡߳�
 

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
