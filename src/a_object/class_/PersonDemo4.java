package a_object.class_;

/*
 * this��䣺���ڹ��캯��֮����л�����á�
 * 
 * this���ֻ�ܶ����ڹ��캯���ĵ�һ�С���Ϊ��ʼ��Ҫ��ִ�С�
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


