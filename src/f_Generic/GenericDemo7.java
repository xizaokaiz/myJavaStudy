package f_Generic;

import java.util.*;

/*
泛型--父类引用
 */

public class GenericDemo7 
{

	public static void main(String[] args) 
	{
		TreeSet<Student3> ts = new TreeSet<Student3>(new Com());
		
		ts.add(new Student3("abc006"));
		ts.add(new Student3("abc002"));
		ts.add(new Student3("abc001"));
		ts.add(new Student3("abc003"));
		
		Iterator<Student3> it = ts.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next().getName());
		}
		
		TreeSet<Worker3> ts1 = new TreeSet<Worker3>(new Com());
		
		ts1.add(new Worker3("abc--006"));
		ts1.add(new Worker3("abc--002"));
		ts1.add(new Worker3("abc--001"));
		ts1.add(new Worker3("abc--003"));
		
		Iterator<Worker3> it1 = ts1.iterator();
		
		while(it1.hasNext())
		{
			System.out.println(it1.next().getName());
		}
	}

}

class Com implements Comparator<Person3>
{
	public int compare(Person3 p1,Person3 p2)
	{
		return p1.getName().compareTo(p2.getName());
	}
}

class Person3
{
	private String name;
	public Person3(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public String toString()
	{
		return "Person:"+name;
	}
}

class Student3 extends Person3
{

	public Student3(String name) 
	{
		super(name);
	}
	
}

class Worker3 extends Person3
{
	public Worker3(String name)
	{
		super(name);
	}
}