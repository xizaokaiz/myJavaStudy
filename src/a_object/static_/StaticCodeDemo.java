package a_object.static_;
/*
 * ��̬�����
 * ��ʽ��
 * static
 * {
 * 	��̬������е�ִ�����
 * }
 * �ص㣺������ļ��ض�ִ�У�ִֻ��һ��,��������������
 * ���ڸ�����г�ʼ���ġ�
 */

class StaticCode
{
	int num = 4;
	static
	{
		System.out.println("a");
	}
	public static void show()
	{
		System.out.println("show run");
	}
	StaticCode(int x)
	{
		System.out.println("b"+num);
	}
	
}
class StaticCodeDemo {

	static
	{
		//System.out.println("b");
	}
	public static void main(String[] args) 
	{
		//new StaticCode();
		//new StaticCode();
		//System.out.println("over");
		//StaticCode.show();
		//StaticCode s = null;
		new StaticCode(4);
	}
	static
	{
		//System.out.println("c");
	}

}
