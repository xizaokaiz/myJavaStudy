package a_object.innerclass;
/*
 �ڲ���ķ��ʹ���:
 1���ڲ������ֱ�ӷ����ⲿ���еĳ�Ա������˽�С�
 	֮���Կ���ֱ�ӷ����ⲿ���еĳ�Ա������Ϊ�ڲ����г���һ���ⲿ������ã���ʽ���ⲿ����.this
 2���ⲿ��Ҫ�����ڲ��࣬���뽨���ڲ������
 
 ���ʸ�ʽ��
 1�����ڲ��ඨ�����ⲿ��ĳ�Աλ���ϣ����ҷ�˽�У��������ⲿ�������У�ֱ�ӽ����ڲ������
 ��ʽ
 	�ⲿ����.�ڲ�����  ������ = �ⲿ�����.�ڲ������
 	Outer.Inner in = new Outer().new Inner();
2�����ڲ����ڳ�Աλ���ϣ��Ϳ��Ա���Ա���η������Ρ�
	���磬private:���ڲ������ⲿ���н��з�װ��
	static:�ڲ���;߱�static�����ԡ�
	���ڲ��౻��̬���κ� ֻ��ֱ�ӷ����ⲿ���е�static��Ա�������˷��ʾ��ޡ�
	
	���ⲿ�������У����ֱ�ӷ���static�ڲ���ķǾ�̬��Ա�أ�
	new Outer.Inner().function();
	
	���ⲿ�������У����ֱ�ӷ���static�ڲ���ľ�̬��Ա�أ�
	Outer.Inner.function();
	
	ע�⣺���ڲ����ж����˾�̬��Ա�����ڲ��������static�ġ�
		���ⲿ���еľ�̬���������ڲ���ʱ���ڲ���Ҳ������static�ġ�
		
����������ʱ��������ڲ�����������������ڲ�����������
��Ϊ�ڲ�������ʹ���ⲿ��������ݡ�

class Body
{
	private class XinZang
	{
	
	}
	public void show()
	{
		new XinZang();
	}

}

	
 */
class Outer
{
	private static int x = 3;
	
	static class Inner//��̬�ڲ���
	{
		static void function()
		{
			System.out.println("inner:"+x);
		}
	}
	
	static class Inner2
	{
		void show()
		{
			System.out.println("Inner show");
		}
	}
	
	public static void method()
	{
//		Inner in = new Inner();
//		in.function();
		Inner2 in = new Inner2();
		in.show();
	}
}

public class InnerClassDemo 
{

	public static void main(String[] args) 
	{
		Outer.Inner.function();
		Outer.method();
		//new Outer.Inner().function();
		
//		Outer out = new Outer();
//		out.method();
		
		//ֱ�ӷ����ڲ����еĳ�Ա
//		Outer.Inner in = new Outer().new Inner();
//		in.function();

	}

}
