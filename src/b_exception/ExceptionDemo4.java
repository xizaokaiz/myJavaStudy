package b_exception;

/*
Exception����һ������������쳣RuntimeException ����ʱ�쳣��
����ں��������׳����쳣�������Ͽ��Բ�������������һ��ͨ����
����ں����������˸��쳣�������߿��Բ��ý��д�������һ��ͨ����

֮���Բ��ú�������������Ϊ����Ҫ�õ����ߴ���
�����쳣������ϣ������ֹͣ����Ϊ������ʱ���������޷���������������ϣ��ֹͣ����󣬶Դ������������

�Զ����쳣ʱ��������쳣�ķ������޷��ټ����������㣬
�����Զ����쳣�̳�RuntimeException��

�����쳣�����֣�
1������ʱ�������쳣��
2������ʱ���������쳣������ʱ�쳣��RuntimeException�Լ������ࣩ��
 */

class FuShuException2 extends RuntimeException
{
	FuShuException2(String msg)
	{
		super(msg);
	}
}

class Demo4
{
	int div(int a,int b)//throws ArithmeticException
	{
		if(b<0)
			throw new RuntimeException("����Ϊ����");
		if(b==0)
			throw new ArithmeticException("�������");
		return a/b;
	}
}


public class ExceptionDemo4 
{

	public static void main(String[] args) 
	{
		Demo4 d = new Demo4();
		int x = d.div(4,-9);
		System.out.println("x="+x);
		System.out.println("over");
		
		Person p = new Person();
		p.checkName(null);

	}

}

class Person
{
	public void checkName(String name)
	{
		//if(name.equals("lisi"))//NullPointerException
		if("lisi".equals(name))//if(name!=null && name.equals("lisi"))
			System.out.println("yes");
		else
			System.out.println("no");
	}
}



