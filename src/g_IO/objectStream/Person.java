package g_IO.objectStream;

import java.io.*;

//ʵ�ֽӿ����������л�����
class Person implements Serializable
{
	//�̶���ʶ�����л�����
	public static final long serialVersionUID = 42L;
	
	private String name;
	//transient:���ܱ����л�
	transient int age;
	//��̬���ܱ����л�
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
