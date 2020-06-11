package e_gather.set;

import java.util.*;

/*
��Ԫ�������߱��Ƚ��ԣ����߾߱��ıȽ��Բ�������Ҫ�ġ�
��ʱ��Ҫ����������߱��Ƚ��ԡ�
�����˱Ƚ��������Ƚ���������Ϊ�������ݸ�TreeSet���ϵĹ��캯����

���������򶼴���ʱ���ԱȽ���Ϊ����

����һ���࣬ʵ��Comparator�ӿڣ�����compare������
 */
class Student2 implements Comparable//�ýӿ�ǿ����ѧ���߱��Ƚ���
{
	private String name;
	private int age;
	
	Student2(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int compareTo(Object obj)
	{
//		return 1;
		
		if(!(obj instanceof Student2))
			throw new RuntimeException("����ѧ������");
		Student2 s = (Student2)obj;
		
//		System.out.println(this.name+"....compareto..."+s.name);
		if(this.age>s.age)
			return 1;
		else if(this.age<s.age)
			return -1;
		else 
			{
				return this.name.compareTo(s.name);
			}
		
		
	}
	
	
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}

	
	
}
public class TreeSetDemo2 
{

	public static void main(String[] args) 
	{
		TreeSet ts = new TreeSet(new MyCompare());
		
		ts.add(new Student2("lisi02",22));
		ts.add(new Student2("lisi007",20));
		ts.add(new Student2("lisi007",21));
		ts.add(new Student2("lisi09",19));
		
		Iterator it = ts.iterator();
		while(it.hasNext())
		{
			Student2 stu = (Student2)it.next();
			System.out.println(stu.getName()+"..."+stu.getAge());
		}

	}

}

class MyCompare implements Comparator//�ýӿ�ǿ����ѧ���߱��Ƚ���
{
	public int compare(Object o1,Object o2)
	{
		Student2 s1 = (Student2)o1;
		Student2 s2 = (Student2)o2;
		
		int num = s1.getName().compareTo(s2.getName());
		if(num==0)
		{
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
			/*
			if(s1.getAge()>s2.getAge())
				return 1;
			else if(s1.getAge()<s2.getAge())
				return -1;
			return 0;
			*/
		}
		
		return num;
	}
}
