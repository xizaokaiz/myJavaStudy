package a_object.linterface;

/*
接口：初期理解，可以认为是一个特殊的抽象类
	 当抽象类中的方法都是抽象的，那么该类可以通过接口的形式来表示。
class 用于定义类
interface 用于定义接口

接口定义时，格式特点：
1、接口中常见定义：常量，抽象方法。
2、接口中的成员都有固定修饰符。
	常量：public static final
	方法：public abstract 
记住：接口中的成员都是public的。

接口：是不可以创建对象的，因为有抽象方法。
需要被子类实现，子类对接口中的抽象方法全都覆盖后，子类才可以实例化。
否则子类是一个抽象类。

接口可以被类多实现，也是对多继承不支持的转换形式，java支持多实现。
 */

interface Inter
{
	public static final int NUM = 3;
	public abstract void show();
}

interface InterA
{
	public abstract void show();
}
class Demo
{
	public void function() {}
}
class Test extends Demo implements Inter,InterA//一个类在实现多个接口时还可以继承另一个类
{
	public void show() {}
}

//接口之间的多继承
interface A
{
	public abstract void methodA();
}
interface B //extends A
{
	public abstract void methodB();
}
interface C extends A,B
{
	public abstract void methodC();
}
class D implements C
{
	public void methodA() {}
	public void methodB() {}
	public void methodC() {}
}



public class IinterfaceDemo 
{

	public static void main(String[] args) 
	{
		Test t = new Test();
		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);

	}

}
