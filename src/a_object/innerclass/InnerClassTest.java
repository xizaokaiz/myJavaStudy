package a_object.innerclass;

interface Inter2
{
	void method();
}

class Test2
{
	//补足代码，通过匿名内部类。
	/*
	static class Inter implements Inter2
	{
		public void method()
		{
			System.out.println("method run");
		}
	}
	*/
	
	//匿名内部类写法
	static Inter2 function()
	{
		return new Inter2() 
		{
			public void method()
			{
				System.out.println("method run");
			}
		};
	}
}

public class InnerClassTest 
{

	public static void main(String[] args) 
	{
		//Test.function():Test类中有一个静态的方法funciton。
		//.method():function这个方法运算后的结果是一个对象。而且一个Inter类型的对象
		//因为只有是Inter类型的对象，才可以调用method方法。
		
		Test2.function().method();
//		↓等价
//		Inter2 in = Test2.function();
//		in.method();
		
		show(new Inter2()
		{
			public void method()
			{
				System.out.println("method show run");
			}
		});

	}
	public static void show(Inter2 in)
	{
		in.method();
	}
}

//面试
class InterTest
{
	public static void main(String [] args)
	{
		new Object()//Object的子类对象
		{
			public void function()
			{
				System.out.println("yeye");
			}
		}.function();
	}
}
