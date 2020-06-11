package e_gather.set;

import java.util.*;
/*
往hashSet集合中存入自定义对象。
姓名和年龄相同为同一个人，重复元素。 
 */
public class HashSetTest 
{

	
	
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		
		hs.add(new Person2("a1",11));
//		hs.add(new Person2("a1",11));
		hs.add(new Person2("a2",12));
		hs.add(new Person2("a3",13));
		
		//sop("a1:"+hs.contains(new Person("a1",11)));
		hs.remove(new Person2("a3",13));
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			Person2 p = (Person2)it.next();
			sop(p.getName()+"::"+p.getAge());
		}
		
		

	}

}

class Person2
{
	private String name;
	private int age;
	Person2(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public int hashCode()
	{
		System.out.println(this.name+"...hashCode");
		return name.hashCode()+age*39;//年龄乘一个数保证唯一性，尽量不调用equals方法。
	}
	
	public boolean equals(Object obj)
	{
		
		if(!(obj instanceof Person2))//如果传入的对象不是Person类型，返回false。
			return false;
		Person2 p = (Person2)obj;
		System.out.println(this.name+"...equals.."+p.name);
		return this.name.equals(p.name)/*比较字符串*/ && this.age == p.age;
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
