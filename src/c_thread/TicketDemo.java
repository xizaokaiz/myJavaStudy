package c_thread;

 /*
 ���󣺼򵥵���Ʊ����
 �������ͬʱ��Ʊ��
 
 �����̵߳ĵڶ��ַ�ʽ��ʵ��Runnable�ӿ�
 ���裺
 1��������ʵ��Runnable�ӿ�
 2������Runnable�ӿ��е�Run����
 	���߳�Ҫ���еĴ������ڸ�run�����С�
 3��ͨ��Thread�ཨ���̶߳���
 4����Runnable�ӿڵ����������Ϊʵ�ʲ������ݸ�Thread��Ĺ��캯����
 	ΪʲôҪ��Runnable�ӿڵ�������󴫵ݸ�Thread�Ĺ��캯����
 	��Ϊ���Զ����run���������Ķ�����Runnable�ӿڵ��������
 	����Ҫ���߳�ȥָ�������run�������ͱ�����ȷ��run���������Ķ���
 5������Thread���start���������̲߳�����Runnable�ӿ������run������
 
 ʵ�ַ�ʽ�ͼ̳з�ʽ��ʲô�����أ�
ʵ�ַ�ʽ�ô��������˵��̳еľ����ԡ�
�ڶ����߳�ʱ������ʹ��ʵ�ַ�ʽ��

���ַ�ʽ������
�̳�Thread���̴߳�������Thread����run������
ʵ��Runnable���̴߳�����ڽӿڵ������run������
  */

class Ticket implements Runnable//extends Thread
{
	private int tickt=100;
	public void run()
	{
		while(true)
		{
			if(tickt>0)
				System.out.println(Thread.currentThread().getName()+"...sale..."+tickt--);
		}
	}
}

public class TicketDemo 
{

	public static void main(String[] args) 
	{
		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);//������һ���߳�
		Thread t2 = new Thread(t);//������һ���߳�
		Thread t3 = new Thread(t);//������һ���߳�
		Thread t4 = new Thread(t);//������һ���߳�
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		/*
		Ticket t1 = new Ticket();
		t1.start();
		*/
		

	}

}
