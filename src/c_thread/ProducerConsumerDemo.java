package c_thread;



public class ProducerConsumerDemo 
{

	public static void main(String[] args) 
	{
		Resource r = new Resource();
		
		Producer pro = new Producer(r);
		Consumer con = new Consumer(r);
		
		Thread t1 = new Thread(pro);
		Thread t2 = new Thread(con);
		Thread t3 = new Thread(pro);
		Thread t4 = new Thread(con);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();

	}

}

class Resource
{
	private String name;
	private int count = 1;
	private boolean flag = false;
	
	public synchronized void set(String name)
	{
		while(flag)
			try{wait();}catch(Exception e) {}
		this.name = name+"--"+count++;
		flag = true;
		this.notifyAll();//唤醒所有线程
		
		System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
	}
	public synchronized void out()
	{
		while(!flag)
			try{wait();}catch(Exception e) {}
		System.out.println(Thread.currentThread().getName()+"...消费者......."+this.name);
		flag = false;
		this.notifyAll();
	}
}

class Producer implements Runnable
{
	private Resource res;
	
	Producer(Resource res)
	{
		this.res = res;
	}
	public void run()
	{
		while(true)
		{
			res.set("+商品+");
		}
	}
}
class Consumer implements Runnable
{
	private Resource res;
	
	Consumer(Resource res)
	{
		this.res = res;
	}
	public void run()
	{
		while(true)
		{
			res.out();
		}
	}
}

