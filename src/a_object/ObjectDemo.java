package a_object;

/*
Object:是所有对象的直接后者间接父类，传说中的上帝。
该类中定义的肯定是所有对象都具备的功能。

Object类中已经提供了对对象是否相同的比较方法。
如果自定义类中也有比较相同的功能，没有必要重新定义。
只要沿袭父类中的功能，建立自己特有的比较内容即可，这就是覆盖。
 */

class Demo2 //extends Object
{
	private int num;
	Demo2(int num)
	{
		this.num = num;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Demo2))//判断如果不是obj型，返回flase
			return false;
		Demo2 d = (Demo2)obj;
		return this.num == d.num;
	}
	
	/*
	public boolean compare(Demo2 d)
	{
		return this.num==d.num;
	}
	*/
	public String toString()
	{
		return "demo:"+num;
	}
}

class Person
{
	
}

public class ObjectDemo {

	public static void main(String[] args) 
	{
		Demo2 d1 = new Demo2(4);
		System.out.println(d1.toString());
		//Demo2 d2 = new Demo2(4);
//		Class c = d1.getClass();
//		System.out.println(c.getName());
//		System.out.println(Integer.toHexString(d1.hashCode()));
//		System.out.println(d1.toString());
		//Person p = new Person();
		//System.out.println(d1.equals(p));

	}

}
