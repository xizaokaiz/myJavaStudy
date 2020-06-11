package f_Generic;

import java.util.*;

public class GenericDemo2 
{

	public static void main(String[] args) 
	{
		TreeSet<String> ts = new TreeSet<String>(new LenComparator());
		
		ts.add("saf");
		ts.add("ddafd");
		ts.add("a");
		ts.add("bbd");
		
		Iterator<String> it = ts.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}
		
	}

}
class LenComparator implements Comparator<String>//传入String类型
{
	public int compare(String o1,String o2)
	{
		int num = new Integer(o1.length()).compareTo(new Integer(o2.length()));
		
		if(num==0)
			return o1.compareTo(o2);
		
		return num;
	}
}