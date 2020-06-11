package c_thread;

//代码优化
/*
对于多个生产者和消费者。
为什么要定义while判断标记。
原因：让被唤醒的下城再一次判断标记。

为什么定义notifyAll，
因为需要唤醒对方线程。
因为只用notify，容易出现只唤醒本方线程的情况，导致程序中的所有线程都等待。
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
				r.set("丽丽","女女女女");
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
