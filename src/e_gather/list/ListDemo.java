package e_gather.list;

import java.util.*;

/*
Collection
	|--List:元素是有序的，元素可以重复。因为该集合体系有索引。
		|--ArrayList:底层的数据结构使用的是数组结构。特点：查询速度很快，但是增删稍慢。线程不同步。
		|--LinkedList:底层使用的链表数据结构。特点：增删速度很快，查询稍慢。
		|--vector:底层是数组数据结构。线程同步。查询与增删速度慢。被ArrayList替代了。
	|--Set:元素是无序的，元素不可以重复。

List:
	特有方法。凡是可以操作角标的方法都是该体系特有的方法。
	
增
	add(index,element);
	addAll(index,Collection);
删
	remove(index);
改
	set(index,element);
查
	get(index);
	subList(from,to);
	listIterator();
	
List集合特有的迭代器，ListIterator是Iterator的子接口。

在迭代时，不可以通过结合对象的方法操作集合中的元素，
因为会发生ConcurrentModificationException。

所以，在迭代时，只能用迭代器的方法操作元素，可是Iterator方法时有限的，
只能对元素进行判断，取出，删除的操作，
如果想要其他的操作如添加，修改等，就需要使用其子接口ListIterator。

该接口只能通过List集合的listIterator方法获取。
 */
public class ListDemo 
{

	public static void main(String[] args) 
	{
		//演示列表迭代器。
		ArrayList al = new ArrayList();
		
		//添加元素。
		al.add("java01");
		al.add("java02");
		al.add("java03");
		
		sop(al);
		
		ListIterator li = al.listIterator();
//		sop("hasPrevious():"+li.hasPrevious());
		while(li.hasNext())
		{
			Object obj = li.next();
			if(obj.equals("java02"))
				//li.add("java007");
				li.set("java007");
		}
		
		while(li.hasPrevious())
		{
			sop("pre:"+li.previous());//如果为真，取出前一个元素
		}
//		sop("hasNext():"+li.hasNext());//判断后一个是否还有元素
//		sop("hasPrevious():"+li.hasPrevious());//判断前一个是否还有元素
		
		sop(al);
		
		/*
		//在迭代过程中，准备添加或者删除元素。
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if(obj.equals("java02"))
				//al.add("java008");
				it.remove();//将java02的引用从集合中删除了。
			sop("obj="+obj);
		}
		sop(al);
		*/

	}
	
	public static void method()
	{
		//演示列表迭代器。
		ArrayList al = new ArrayList();
		
		//添加元素。
		al.add("java01");
		al.add("java02");
		al.add("java03");
		
		sop("原集合："+al);
		
		//在指定位置添加元素。
		al.add(1,"java09");
		
		//删除指定位置的元素。
		//al.remove(2);
		
		//修改元素。
		//al.set(2,"java007");
		
		//通过角标获取元素。
		sop("get(1):"+al.get(1));
		
		sop(al);
		
		//获取所有元素。
		for(int x=0;x<al.size();x++)
		{
			System.out.println("al("+x+")="+al.get(x));
		}
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			sop("next:"+it.next());
		}
		
		//通过index获取对象的位置。
		sop("index="+al.indexOf("java02"));
		
		//返回列表中指定的范围的元素，包含头不包含尾
		List sub = al.subList(1,3);
		
		sop("sub="+sub);
		
	}
	
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
