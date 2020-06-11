package c_thread;
/*
���ͬ����������̬���κ�ʹ�õ�����ʲô��

ͨ����֤�����ֲ�����this����Ϊ��̬������Ҳ�����Զ���this��

��̬���ڴ�ʱ���ڴ���û�б�����󣬵���һ���и����Ӧ���ֽ����ļ�����
����.class �ö����������Class

��̬��ͬ��������ʹ�õ����Ǹ÷�����������ֽ����ļ���������.class
 */

class Ticket4 implements Runnable
{
	private static int tickt=100;
	//Object obj = new Object();
	boolean flag = true;
	public void run()
	{
		if(flag)
		while(true)
		{
			synchronized(Ticket4.class)
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
	public static synchronized void show()//this
	{
		if(tickt>0)
		{
			try{Thread.sleep(10);}catch(Exception e){}
			System.out.println(Thread.currentThread().getName()+"...show..."+tickt--);
		}
	}
}

public class StaticMethodDemo 
{

	public static void main(String[] args) 
	{
		Ticket4 t = new Ticket4();
		
		Thread t1 = new Thread(t);//������һ���߳�
		Thread t2 = new Thread(t);//������һ���߳�
		t1.start();
		try{Thread.sleep(10);}catch(Exception e){}
		t.flag = false;
		t2.start();

	}

}
