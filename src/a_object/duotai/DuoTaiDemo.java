package a_object.duotai;

/*
��̬���������Ϊ������ڵĶ���������̬��

�ˣ����ˣ�Ů��
���è����
è x = new è();

���� x = new è();

1����̬������
	���������ָ�����Լ����������
	���������Ҳ���Խ����Լ����������
	
2����̬��ǰ��
	������������֮���й�ϵ��Ҫô�̳У�Ҫôʵ�֡�
	ͨ������һ��ǰ�᣺���ڸ��ǡ�
	
3����̬�ĺô�
	��̬�ĳ��ִ�����߳������չ�ԡ�
	
4����̬�ı׶ˣ�
	�������չ�ԣ�����ֻ��ʹ�ø�������÷��ʸ����еĳ�Ա��
	
5����̬��Ӧ��

6����̬�ĳ��ִ����е��ص㣨��̬ʹ�õ�ע�����
 */

/*
���
è������
 */

abstract class Animal
{
	abstract void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void catchMouse()
	{
		System.out.println("ץ����");
	}
	
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("�Թ�ͷ");
	}
	public void kanJia()
	{
		System.out.println("����");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("����");
	}
	public void gongDi()
	{
		System.out.println("����");
	}
}
//-------------------------------------------

public class DuoTaiDemo 
{

	public static void main(String[] args) 
	{
		//Animal c = new Cat();
		//c.eat();
		
		function(new Cat());
		function(new Dog());
		function(new Pig());
		

	}
	public static void function(Animal a)//Animal a = new Cat();
	{
		a.eat();
		
	}
	/*
	public static void function(Cat c)
	{
		c.eat();
	}
	public static void function(Dog d)
	{
		d.eat();
	}
	public static void function(Cat p)
	{
		p.eat();
	}
	*/

}
