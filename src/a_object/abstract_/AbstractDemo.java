package a_object.abstract_;
/*
��������г�����ͬ���ܣ����ǹ������岻ͬ��
���ǿ��Խ������ϳ�ȡ����ʱ��ֻ��ȡ���ܶ��壬������ȡ�������塣

���󣺿�������

��������ص㣺
1�����󷽷�һ���ڳ������С�
2�����󷽷��ͳ����඼���뱻abstract�ؼ������Ρ�
3�������಻������new����������Ϊ���ó��󷽷�û���塣
4���������еĳ��󷽷�Ҫ��ʹ�ã����������ิд�����еĳ��󷽷��󣬽������������á�
	�������ֻ�����˲��ֳ��󷽷�����ô�����໹��һ�������ࡣ
	
�������һ����û��̫��Ĳ�ͬ��
������������������������ֻ�����������г�����һЩ�������Ķ�����
��Щ��ȷ���Ĳ��֣�Ҳ�Ǹ�����Ĺ��ܣ���Ҫ��ȷ�����������޷��������塣
ͨ�����󷽷�����ʾ��

�������һ������˸������������������п��Զ�����󷽷���
�����಻����ʵ������

���⣺�������п��Բ�������󷽷��������������ǲ��ø��ཨ������
 */

abstract class Student2
{
	abstract void study() ;
	void sleep()
	{
		System.out.println("����");
	}
}

class ChongciStudent extends Student2
{
	void study()
	{
		System.out.println("chongci study");
	}
}

class BaseStudent extends Student2
{
	void study()
	{
		System.out.println("base study");
	}
}

class AdvStudent extends Student2
{
	void study()
	{
		System.out.println("adv study");
	}
}

public class AbstractDemo 
{

	public static void main(String[] args) 
	{
		new BaseStudent().study();
		new ChongciStudent().study();

	}

}
