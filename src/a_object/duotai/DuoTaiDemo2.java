package a_object.duotai;

public class DuoTaiDemo2 
{

	public static void main(String[] args) 
	{
		//Animal a = new Cat();//类型提升。向上转型。
		//a.eat();
		
		//如果想要调用猫的特有方法，如何操作？
		//强制将父类的引用，转成子类的类型，向下转型。
		//Cat c = (Cat)a;
		//c.catchMouse();
		
		//千万不要出现这样的操作：将父类对象转成子类类型
		//我们能转换的是父类应用指向了自己的子类对象时，该应用可以被提升，也可以被转换。
		//多态自始至终都是子类对象在做着变化。
//		Animal a = new Animal();
//		Cat c = (Cat)a;
		

		function(new Dog());
		function(new Cat());
		function(new Pig());
		
		
	}
	public static void function(Animal a)
	{
		a.eat();
		if(a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog c = (Dog)a;
			c.kanJia();
		}
		else if(a instanceof Pig)
		{
			Pig p = (Pig)a;
			p.gongDi();
		}
		
		
	}
}
