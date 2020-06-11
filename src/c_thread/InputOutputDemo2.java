package c_thread;

//�����Ż�
/*
���ڶ�������ߺ������ߡ�
ΪʲôҪ����while�жϱ�ǡ�
ԭ���ñ����ѵ��³���һ���жϱ�ǡ�

Ϊʲô����notifyAll��
��Ϊ��Ҫ���ѶԷ��̡߳�
��Ϊֻ��notify�����׳���ֻ���ѱ����̵߳���������³����е������̶߳��ȴ���
 */

class Res2
{
	private String name;
	private String sex;
	private boolean flag = false;
	
	public synchronized void set(String name,String sex)
	{
		if(this.flag)
			try{this.wait();}catch(Exception e) {}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}
	public synchronized void out()
	{
		if(!this.flag)
			try{this.wait();}catch(Exception e) {}
		System.out.println(this.name+"..."+this.sex);
		flag = false;
		this.notify();
	}
}

class Input2 implements Runnable
{
	private Res2 r;
	Input2(Res2 r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			if(x==0)
				r.set("maik","man");
			else
				r.set("����","ŮŮŮŮ");
				x = (x+1)%2;
		}
			
	}
	
}
class Output2 implements Runnable
{
	private Res2 r;
	Output2(Res2 r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			r.out();
			
		}
	}
}

public class InputOutputDemo2 
{

	public static void main(String[] args) 
	{
		Res r = new Res();
		
		new Thread(new Input(r)).start();
		new Thread(new Output(r)).start();

	}

}
