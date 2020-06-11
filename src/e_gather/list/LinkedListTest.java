package e_gather.list;

/*
使用LinkedList模拟一个堆栈或者队列数据结构。

堆栈：先进后出 如同一个杯子。
队列：先进先出 First in First out FIFO 如同一个水管。


 */
import java.util.*;

class Processtion
{
	private LinkedList link;
	Processtion()
	{
		link = new LinkedList();
	}
	public void myAdd(Object obj)
	{
		link.addFirst(obj);
	}
	public Object myGet()
	{
		return link.removeLast();//先进先出
		//return link.removeFirst();//先进后出
	}
	public boolean isNull()
	{
		return link.isEmpty();
	}
	
}

public class LinkedListTest 
{

	public static void main(String[] args) 
	{
		Processtion p = new Processtion();
		
		p.myAdd("java01");
		p.myAdd("java02");
		p.myAdd("java03");
		p.myAdd("java04");
		
		while(!p.isNull())
		{
			System.out.println(p.myGet());
		}

	}

}
