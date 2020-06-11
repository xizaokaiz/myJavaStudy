package a_object.class_;

/*
 * this语句：用于构造函数之间进行互相调用。
 * 
 * this语句只能定义在构造函数的第一行。因为初始化要先执行。
 */

public class PersonDemo4 
{
	
	public static void main(String[] args) 
	{
		Person6 p = new Person6("lisi",30);
	}
}
	
class Person6
{
	private String name;
	private int age;
		
	Person6(String name)
	{
		this.name = name;
	}
		
	Person6(String name,int age)
	{
		//this.name = name;
		this(name);//p(name);
		this.age = age;
	}
}


