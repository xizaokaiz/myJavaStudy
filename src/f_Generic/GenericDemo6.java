package f_Generic;
import java.util.*;

/* 
?ͨ�����Ҳ�������Ϊռλ����
���͵��޶���
? extends E:���Խ���E���ͻ���E�������͡����ޡ�
? extends E:���Խ���E���ͻ���E�ĸ����͡����ޡ�
 */

public class GenericDemo6 
{

	public static void main(String[] args) 
	{
		/*
		ArrayList<String> al = new ArrayList<String>();
		al.add("abc");
		al.add("abd");
		al.add("ase");
		al.add("sdf");
		
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1);
		al1.add(4);
		al1.add(5);
		al1.add(7);
		
		printColl(al);
		printColl(al1);
		*/
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(new Person("abc01"));
		al.add(new Person("abc02"));
		al.add(new Person("abc03"));
		printColl(al);
		
		ArrayList<Student2> al1 = new ArrayList<Student2>();
		al1.add(new Student2("abc--01"));
		al1.add(new Student2("abc--02"));
		al1.add(new Student2("abc--03"));
		printColl(al1); //ArrayList<? extends Person> al = new ArrayList<Student>();error 
		
	}
	public static void printColl(Collection<? extends Person> al)
	{
		Iterator<? extends Person> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next().getName());
		}
	}
	
	/*
	public static void printColl(ArrayList<?> al)
	{
		Iterator<?> it = al.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
	*/

}

class Person
{
	private String name;
	public Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
}
	

class Student2 extends Person
{
	public Student2(String name)
	{
		super(name);
	}
}

/*
class Student implements Comparable<Person>//<? super E>
{
	public int compareTo(Person s)
	{
		this.getName();
	}
}

class Comp implements Comparator<Person>
{
	public int compare(Person s1,Person s2)
	{
		Person s1 = new Student("abc1");
		return s1.getName().compareTo(s2.getName());
	}
}

TreeSet<Student> ts = new TreeSet<Student>(new Comp());
ts.add(new Student("abc01"));
ts.add(new Student("abc02"));
ts.add(new Student("abc03"));
 */

