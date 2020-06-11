package a_object;
//package a_object;
///*
////练习题
///*
//class Fu
//{
//	boolean show(char a)
//	{
//		System.out.println(a);
//		return true;
//	}
//}
//
//class Demo extends Fu
//{
//	public static void main(String[] args)
//	{
//		int i = 0;
//		Fu f = new Demo();
//		Demo d = new Demo();
//		for(f.show('A');f.show('B')&&(i<2);f.show('c'))
//		{
//			i++;
//			d.show('D');
//		}
//	}
//	boolean show(char a)
//	{
//		System.out.println(a);
//		return false;
//	}
//}
//*/
////-----------------------------------------------------------------
//
//class Super
//{
//	int i = 0;
//	public Super(String a)
//	{
//		System.out.println("A");
//		i = 1;
//	}
//	public Super()
//	{
//		System.out.println("B");
//		i+=2;
//	}
//	
//}
//class Demo2 extends Super
//{
//	public Demo2(String a)
//	{
//		System.out.println("C");
//	}
//	public static void mian(String[] args)
//	{
//		int i = 4;
//		Super d = new Demo2("A");
//		System.out.println(d.i);
//	}
//}
//*/
////-----------------------------------------------------------------
//interface Inter
//{
//	void show(int a,int b);
//	void func();
//}
//class Demo
//{
//	public static void main(String[] args)
//	{
//		//补足代码，调用两个函数，要求用匿名内部类。
//		Inter in = new Inter()
//		{
//			public void show(int a,int b)
//			{
//				
//			}
//			public void func()
//			{
//				
//			}
//		};
//		in.show(4,5);
//		in.func();
//	}
//}
////-----------------------------------------------------------------
//class Test
//{
//	public static String output = "";
//	public static void foo(int i)
//	{
//		try
//		{
//			if(i==1)
//				throw new Exception();
//			output+="1";
//		}
//		catch(Exception e)
//		{
//			output+="2";
//			return;
//		}
//		finally
//		{
//			output+="3";
//		}
//		output+="4";//return后不执行
//	}
//	public static void mian(String[] args)
//	{
//		foo(0);
//		System.out.println(output);//134
//		foo(1);
//		System.out.println(output);//13423
//	}
//}
//
