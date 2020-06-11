package e_gather.set;

/*
��ϰ�������ַ�����������

�ַ�������߱��Ƚ��ԣ��������ıȽϷ�ʽ��������Ҫ�ģ�

��ʱ��ֻ��ʹ�ñȽ�����
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
		
		
		int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));//��Ҫ����:�Ƚϳ���
		
		if(num==0)
			return s1.compareTo(s2);//��Ҫ����:��Ȼ����
		
		return num;
		
	}
	
}
