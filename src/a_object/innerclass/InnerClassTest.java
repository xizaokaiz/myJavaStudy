package a_object.innerclass;

interface Inter2
{
	void method();
}

class Test2
{
	//������룬ͨ�������ڲ��ࡣ
	/*
	static class Inter implements Inter2
	{
		public void method()
		{
			System.out.println("method run");
		}
	}
	*/
	
	//�����ڲ���д��
	static Inter2 function()
	{
		return new Inter2() 
		{
			public void method()
			{
				System.out.println("method run");
			}
		};
	}
}

public class InnerClassTest 
{

	public static void main(String[] args) 
	{
		//Test.function():Test������һ����̬�ķ���funciton��
		//.method():function������������Ľ����һ�����󡣶���һ��Inter���͵Ķ���
		//��Ϊֻ����Inter���͵Ķ��󣬲ſ��Ե���method������
		
		Test2.function().method();
//		���ȼ�
//		Inter2 in = Test2.function();
//		in.method();
		
		show(new Inter2()
		{
			public void method()
			{
				System.out.println("method show run");
			}
		});

	}
	public static void show(Inter2 in)
	{
		in.method();
	}
}

//����
class InterTest
{
	public static void main(String [] args)
	{
		new Object()//Object���������
		{
			public void function()
			{
				System.out.println("yeye");
			}
		}.function();
	}
}
