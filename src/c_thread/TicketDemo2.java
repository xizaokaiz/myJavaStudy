package c_thread;

/*
ͨ�����������֣���ӡ��0��-1��-2�ȴ�Ʊ

���̵߳����г����˰�ȫ���⡣

�����ԭ��
	����������ڲ���ͬһ���̹߳�������ʱ��һ���̶߳Զ������ִֻ����һ���֣���û��ִ���꣬
	��һ���̲߳������ִ�У����¹������ݵĴ���

���������
	�Զ��������������ݵ���䣬ֻ����һ���̶߳�ִ���ꡣ��ִ�й����У������̲߳����Բ���ִ�С�
	
Java���ڶ��̵߳İ�ȫ�����ṩ��רҵ�Ľ����ʽ��
����ͬ������顣
synchronized(����)
{
	��Ҫ��ͬ���Ĵ���
}
������ͬ�������������߳̿�����ͬ����ִ�С�
û�г��������̼߳�ʹ��ȡcpu��ִ��Ȩ��Ҳ����ȥ����Ϊû�л�ȡ����

���ϵ�������---����

ͬ����ǰ�᣺
1.����Ҫ�����������������ϵ��̡߳�
2.�����Ƕ���߳�ʹ��ͬһ������
3.���뱣֤ͬ����ֻ����һ���߳������С�

�ô�������˶��̵߳İ�ȫ���⡣
�׶ˣ�����̶߳���Ҫ�ж�������Ϊ������Դ��

 */

class Ticket2 implements Runnable//extends Thread
{
	private int tickt=100;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(obj)
			{
				try
				{
					Thread.sleep(10);
				}
				catch(Exception e)
				{
					
				}
				if(tickt>0)
					System.out.println(Thread.currentThread().getName()+"...sale..."+tickt--);
			}
		}
	}
}

public class TicketDemo2 
{

	public static void main(String[] args) 
	{
		Ticket2 t = new Ticket2();
		
		Thread t1 = new Thread(t);//������һ���߳�
		Thread t2 = new Thread(t);//������һ���߳�
		Thread t3 = new Thread(t);//������һ���߳�
		Thread t4 = new Thread(t);//������һ���߳�
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}
