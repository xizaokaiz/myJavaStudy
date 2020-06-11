package b_exception;

/*
��һ��Բ�κͳ����Ρ�
�����Ի�ȡ������������������ַǷ�����ֵ����Ϊ�ǻ�ȡ����������⡣
����ͨ���쳣����ʾ��
���ж����������л�����ơ�
 */

class NoValueException extends RuntimeException
{
	NoValueException(String message)
	{
		super(message);
	}
}
interface Shape
{
	void getArea();
}
class Rec implements Shape
{
	private int len,wid;
	Rec(int len,int wid)
	{
		if(len<=0 || wid<=0)
			throw new NoValueException("���ַǷ�ֵ");
		this.len = len;
		this.wid = wid;
	}
	public void getArea()
	{
		System.out.println(len*wid);
	}
}
class Circle implements Shape
{
	private int radius;
	public static final double PI = 3.14;//ȫ�ֳ���
	Circle(int radius)
	{
		if(radius<=0)
			throw new NoValueException("�Ƿ�");
		this.radius = radius;
	}
	public void getArea()
	{
		System.out.println(radius*radius*PI);
	}
}

public class ExceptionTest2 
{
	public static void main(String[] args) 
	{
//		Rec r = new Rec(-4,3);
//		r.getArea();
		Circle c = new Circle(-9);
		c.getArea();
		System.out.println("over");
		
	}
}
