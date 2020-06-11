package a_object.abstract_;
/*
���������ڿ���һ��ϵͳʱ��Ҫ��Ա�����н�ģ��Ա������3�����ԣ�
�����������Լ����ʡ�����Ҳ��Ա�������˺���Ա���������⣬���⻹��һ��
�������ԡ���ʹ�ü̳е�˼����Ƴ�Ա����;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�

Ա���ࣺ name id pay

�����ࣺ�̳���Ա���������Լ����е�bonus��

 */

abstract class Employee
{
	private String name;
	private String id;
	private double pay;
	
	Employee(String name,String id,double pay)
	{
		this.name = name;
		this.id = id;
		this.pay = pay;
	}
	
	public abstract void work();
}

class Manager extends Employee
{
	private int bonus;
	Manager(String name,String id,double pay,int bonus)
	{
		super(name,id,pay);
		this.bonus = bonus;
	}
	
	public void work() 
	{
		System.out.println("manager work");
	}
	
}

class Pro extends Employee
{
	Pro(String name,String id,double pay)
	{
		super(name,id,pay);
		
	}
	
	public void work()
	{
		System.out.println("Pro work");
	}
}

public class AbstractTest 
{

	public static void main(String[] args) 
	{
		

	}

}
