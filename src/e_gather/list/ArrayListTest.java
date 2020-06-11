package e_gather.list;

import java.util.*;

/*
去除ArrayList集合中的重复元素。
 */

public class ArrayListTest 
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add("java01");
		list.add("java02");
		list.add("java01");
		list.add("java02");
		list.add("java01");
		//list.add("java03");
		
		//在迭代时循环中next调用一次，就要hasNext判断一次，
		/*
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			sop(it.next()+"..."+it.next());
		}
		*/
		
//		sop(list);
//		sop(singleElement(list));
	}
	public static ArrayList singleElement(ArrayList list)
	{
		//定义一个临时容器。
		ArrayList newlist = new ArrayList();
		
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if(!newlist.contains(obj))
				newlist.add(obj);
		}
		return newlist;
		
	}

}
