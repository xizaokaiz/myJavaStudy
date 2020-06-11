package a_object.innerclass;

/*
匿名内部类：
1、匿名内部类其实就是内部类的简写格式。
2、定义匿名内部类的前提：
	继承一个类或者实现接口。
3、匿名内部类的格式：new 父类或者接口（）{定义子类的内容}
4、其实匿名内部类就是一个匿名子类对象，而且这个对象有点胖，可以理解为带内容的对象。
5、匿名内部类中定义的方法最好不要超过3个。
 */

abstract class AbsDemo
{
	abstract void show();
}

class Outer3
{
	int x = 3;
	/*
	class Inner extends AbsDemo
	{
		void show()
		{
			System.out.println("show:"+x);
		}
		void abc()
		{
				System.out.println("haha");
		}
	}
	*/
	public void function()
	{
		int num = 5;
		//new Inner().show();
		AbsDemo d = new AbsDemo()//父类引用指向子类对象
		{
			void show()
			{
				System.out.println("num="+num);
			}
			void abc()
			{
				System.out.println("haha");
			}
		};
		d.show();
		//d.abc();编译失败，父类无此方法。
	}
}

public class InnerClassDemo3 
{

	public static void main(String[] args) 
	{
		new Outer3().function();

	}

}
