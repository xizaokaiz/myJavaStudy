package a_object.class_;
//需求：描述汽车（颜色，轮胎数）。描述事物其实就是在描述事物的属性和行为
//属性对应是类中变量，行为对应的类中的函数（方法）
//其实定义类，就是在描述事物，就是在定义属性和行为。属性和行为共同成为类中的成员（成员变量和成员方法）。
/*
 * 成员变量和局部变量。
 * 作用范围。
 * 成员变量作用于整个类中。
 * 局部变量作用于函数中，或者语句中。
 * 成员变量：在堆内存中，因为对象的存在，才在内存中存在。
 * 局部变量：存在栈内存中。
 * 
 */
	class Car
	{
		//描述颜色
		String color = "红色";
		//描述轮胎数
		int num = 4;
		//运行行为
		 void run()
		 {
			 System.out.println(color+".."+num);
		 }
	}
public class CarDemo 
{
	public static void main(String[] args) 
	{
		//生产汽车，在java中通过new操作符来完成
		//其实就是在堆内存产生一个实体
		Car c = new Car();//c就是一个类类型变量，记住：类类型变量指向对象
		//需求：将已有车的颜色改成蓝色。指挥该对象做使用。在Java指挥方式是：对象，对象成员
		c.color = "blue";
		c.run();
		Car c1 = new Car();
		c1.run();//red 4;
		

	}
	

}
