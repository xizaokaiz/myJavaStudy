package a_object.innerclass;

/*
�����ڲ��ࣺ
1�������ڲ�����ʵ�����ڲ���ļ�д��ʽ��
2�����������ڲ����ǰ�᣺
	�̳�һ�������ʵ�ֽӿڡ�
3�������ڲ���ĸ�ʽ��new ������߽ӿڣ���{�������������}
4����ʵ�����ڲ������һ������������󣬶�����������е��֣��������Ϊ�����ݵĶ���
5�������ڲ����ж���ķ�����ò�Ҫ����3����
 */

abstract class AbsDemo
{
	abstract void show();
}

class Outer3
{
	int x = 3;
	/*
	class Inner extends AbsDemo
	{
		void show()
		{
			System.out.println("show:"+x);
		}
		void abc()
		{
				System.out.println("haha");
		}
	}
	*/
	public void function()
	{
		int num = 5;
		//new Inner().show();
		AbsDemo d = new AbsDemo()//��������ָ���������
		{
			void show()
			{
				System.out.println("num="+num);
			}
			void abc()
			{
				System.out.println("haha");
			}
		};
		d.show();
		//d.abc();����ʧ�ܣ������޴˷�����
	}
}

public class InnerClassDemo3 
{

	public static void main(String[] args) 
	{
		new Outer3().function();

	}

}
