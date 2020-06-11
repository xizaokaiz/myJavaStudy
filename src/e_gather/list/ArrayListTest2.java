package e_gather.list;

import java.util.*;

/*
将自定义对象作为对象元素存在ArrayList集合中，并去除重复元素。

比如：存人对象。同姓名同年龄，视为同一个人，为重复元素。

思路：
1、对人描述，将数据封装进人对象。
2、定义容器，将人存入。
3、取出。

List集合判断元素是否相同，依据是元素的equals方法。
 */

class Person
{
	private String name;
	private int age;
	Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public boolean equals(Object obj)
	{
		
		if(!(obj instanceof Person))//如果传入的对象不是Person类型，返回false。
			return false;
		Person p = (Person)obj;
		System.out.println(this.name+"..."+p.name);
		return this.name.equals(p.name)/*比较字符串*/ && this.age == p.age/*比较数值*/;
	}
	
}


public class ArrayListTest2 
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add(new Person("lisi01",30));
		al.add(new Person("lisi02",32));//al.add(Object obj);//Object obj = new Person("lisi",30);
		al.add(new Person("lisi03",33));
//		al.add(new Person("lisi03",33));
		al.add(new Person("lisi04",35));
		
//		al = singleElement(al);
		
		sop("remove 03:"+al.remove(new Person("lisi03",33)));//remove也调用了equals方法进行判断
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Person p = (Person)it.next();
			sop(p.getName()+"::"+p.getAge());
		}
		

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
