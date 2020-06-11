package e_gather.set;

/*
练习：按照字符串长度排序。

字符串本身具备比较性，但是它的比较方式不是所需要的，

这时就只能使用比较器。
 */

import java.util.*;

public class TreeSetTest 
{

	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet(new StrLenComparator());
		
		ts.add("abcd");
		ts.add("cc");
		ts.add("cha");
		ts.add("z");
		ts.add("aaa");
		ts.add("haha");
		
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}

class StrLenComparator implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		String s1 = (String)o1;
		String s2 = (String)o2;
		
		
		int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));//主要条件:比较长度
		
		if(num==0)
			return s1.compareTo(s2);//次要条件:自然排序
		
		return num;
		
	}
	
}
