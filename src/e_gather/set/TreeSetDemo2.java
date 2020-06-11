package e_gather.set;

import java.util.*;

/*
当元素自身不具备比较性，或者具备的比较性不是所需要的。
这时需要让容器自身具备比较性。
定义了比较器，将比较器对象作为参数传递给TreeSet集合的构造函数。

当两种排序都存在时，以比较器为主。

定义一个类，实现Comparator接口，覆盖compare方法。
 */
class Student2 implements Comparable//该接口强制让学生具备比较性
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
			throw new RuntimeException("不是学生对象");
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

class MyCompare implements Comparator//该接口强制让学生具备比较性
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
