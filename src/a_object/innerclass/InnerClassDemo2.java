package a_object.innerclass;

/*
�ڲ��ඨ���ھֲ�ʱ��
1�������Ա���Ա���η�����
2������ֱ�ӷ����ⲿ���еĳ�Ա����Ϊ�������ⲿ���е����á�
	���ǲ����Է��������ڵľֲ��еı�����ֻ�ܷ��ʱ�final���εľֲ�������
 */

class Outer2
{
	int x = 3;
	void method(final int a)
	{
		final int y = 4;
		class Innter
		{
			void function()
			{
				System.out.println(a);
			}
		}
		new Innter().function();
	}
}

public class InnerClassDemo2
{

	public static void main(String[] args) 
	{
		//new Outer2().method(7);
		Outer2 out = new Outer2();
		out.method(7);
		out.method(8);

	}

}
