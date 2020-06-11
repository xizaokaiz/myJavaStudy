package a_object.static_;

class Person4
{
	private String name;
	private int age;
	private static String country = "cn";
	Person4(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	{
		System.out.println(name+".."+age);//构造代码块
	}
	
	public void setName(String name)
	{
		this.name = name;//this:谁调用，就给谁赋值
	}
	
	public void speak()
	{
		System.out.println(this.name+"..."+this.name);
	}
	
	public static void showCountry()
	{
		System.out.println("country="+country);
		method();//省略类名 Person.method()	
		
	}
	public static void method()
	{
		System.out.println("method run");
	}
	

}




public class StaticPersonDemo 
{

	public static void main(String[] args) 
	{
		Person4 p = new Person4("zhangsan",20);
		p.setName("lisi");
		p.speak();
		p.showCountry();
		
		/* Person4 p = new Person4("zhangsan",20);
		      该句话都做了什么事情？
		 * 1、因为New用到 Person.class，所以会先找到Person.class文件并加载到内存中。
		 * 2、会执行该类中的static代码块，如果有的话，给Person.class类进行初始化
		 * 3、在堆内存中开辟空间，分配内存地址。
		 * 4、在堆内存中建立对象的特有属性，并进行默认初始化。
		 * 5、对属性进行显示初始化。
		 * 6、对对象进行构造代码块初始化。
		 * 7、对对象进行对应的构造函数初始化。
		 * 8、将内存地址附给栈内存中的P变量。
		 */
	}

}
