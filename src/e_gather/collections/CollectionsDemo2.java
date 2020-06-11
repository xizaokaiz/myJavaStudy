package e_gather.collections;

import java.util.*;
/*
fill():有作业
replaceAll()
shuffleDemo()
 */

class StrComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		/*
		int num = s1.compareTo(s2);
		if(num>0)
			return -1;
		if(num<0)
			return 1;
		return num;
		*/
		return s2.compareTo(s1);
	}
}

public class CollectionsDemo2 
{
	public static void main(String[] args) 
	{
		//fillDemo();
		//replaceAllDemo();
		//orderDemo();
		shuffleDemo();
	}
	
	
	public static void shuffleDemo()
	{
		List<String> list = new ArrayList<String>();
		
		list.add("cbc");
		list.add("abcs");
		list.add("cdcdd");
		list.add("ss");
		
		System.out.println(list);
		Collections.shuffle(list);
		System.out.println(list);
	}
	
	
	public static void orderDemo()
	{											//实现原理 --> new StrComparator()
//		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder());
		
		//按长度排序然后进行反转
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new StrLenComparator()));
		ts.add("cbc");
		ts.add("abcs");
		ts.add("bdcdd");
		ts.add("ss");
		System.out.println(ts);
		
	}
	
	public static void replaceAllDemo()
	{
		List<String> list = new ArrayList<String>();
		
		list.add("cbc");
		list.add("abcs");
		list.add("cdcdd");
		list.add("ss");
		
		System.out.println(list);
		Collections.replaceAll(list,"cbc","aa");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
	}
	
	/*
	练习：fill方法可以将list集合中所有元素替换成指定元素。
		将list集合中部分元素替换成指定元素。
	 */
	public static void fillDemo()//list,start,end
	{
		List<String> list = new ArrayList<String>();
		
		list.add("cbc");
		list.add("abcs");
		list.add("cdcdd");
		list.add("ss");	
		
		System.out.println(list);
		Collections.fill(list,"pp");
		System.out.println(list);
	}

}
