package a_object.class_;

public class CarDemo2 {

	public static void main(String[] args) {

		//匿名对象
		/*
		new Car().num = 5;
		new Car().color = "blue";
		new Car().run();
		
		Car c = new Car();
		c.run();
		c.num = 4;
		new Car().run();
		*/
		
		//匿名对象使用方式一：当对对象的方法只调用一次时，可以用匿名对象来完成，这样写比较简化。
		//如果对一个对象进行多个成员调用，必须给这个对象起个名字。
		//匿名对象使用方式二：可以将匿名对象作为实际参数进行传递。
		Car c = new Car();
		show(c);
	//	show(new Car());

	}
	//需求：汽车修配厂。对汽车进行改装，将来的车够改成黑车，三个轮胎
	public static void show(Car c)
	{
		c.num = 3;
		c.color = "black";
		c.run();
	}

}
