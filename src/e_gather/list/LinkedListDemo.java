package e_gather.list;

import java.util.*;
/*
LinkedList特有方法
addFirst();
addLast();

getFirst();
getLast();
获取元素，但不删除元素。

removeFirst();
removeLast();
获取元素，但元素被删除。如果集合中没有元素，会出现NoSuchElementException

在JDK1.6出现了替代办法。

offerFirst();
offerLast();

peekFirst();
peekLast();
获取元素，但不删除元素。如果集合中没有元素，会返回null。

pollFirst();
pollLast();
获取元素，但元素被删除。如果集合中没有元素，会返回null。
 */
public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		LinkedList link = new LinkedList();
		
		link.addLast("java01");
		link.addLast("java02");
		link.addLast("java03");
		link.addLast("java04");
		
//		sop(link.removeFirst());
//		sop(link.removeFirst());
//		sop("size="+link.size());
		
//		sop(link);
//		sop(link.getFirst());
//		sop(link.getLast());
		
		//迭代
		while(!link.isEmpty())
		{
			sop(link.removeLast());
		}
		
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
