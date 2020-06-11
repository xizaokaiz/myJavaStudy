package g_IO.objectStream;

import java.io.*;

//实现接口以启用序列化功能
class Person implements Serializable
{
	//固定标识，序列化方便
	public static final long serialVersionUID = 42L;
	
	private String name;
	//transient:不能被序列化
	transient int age;
	//静态不能被序列化
	static String country = "cn";
	public Person(String name,int age,String country)
	{
		this.name = name;
		this.age = age;
		this.country = country;
	}
	public String toString()
	{
		return name+":"+age+":"+country;
	}
}
