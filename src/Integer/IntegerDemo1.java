package Integer;



public class IntegerDemo1 
{

	public static void main(String[] args)
	{
//		method();
//		Integer x = new Integer(3);
		Integer x = 3;//自动装箱。new Integer(3);
		x = x/*	x.intValue() */ + 2;//x+2:x 进行自动拆箱，变成了int类型，和2进行加法运算。
				//再将和进行装箱赋给x。
		
		Integer m = 128;
		Integer n = 128;
		sop("m==n:"+(m==n));
		
		Integer a = 127;
		Integer b = 127;
		sop("a==b:"+(a==b));//结果为true。因为a和b指向了同一个Integer对象。
		//因为当数值在byte范围内时(-128 ~ +127)，对于新特性，如果该数值已经存在已经存在，则不会再开辟新的空间。
		
	}
	
	
	public static void method() 
	{
		Integer x = new Integer("123");
		
		Integer y = new Integer(123);
		
		sop("x==y:"+(x==y));//比较地址值
		sop("x.equals(y):"+x.equals(y));//Integer复写了equals方法为比较数值

	}
	public static void sop(String str)
	{
		System.out.println(str);
	}

}
