package a_object.class_;
/*
 * ����һ�����ͻ������֮��Ӧ�Ĺ��캯��
 * ���캯�������ã��������ڸ�������г�ʼ����
 * ���캯����Сϸ�ڣ�
 * ��һ����û�ж��幹�캯��ʱ����ôϵͳ��Ĭ�ϸ��������һ���ղ����Ĺ��캯����

 ���������Զ����˹��캯����Ĭ�ϵĹ��캯����û���ˡ�
 
 ���캯����һ�㺯����д�����в�ͬ��
 ��������Ҳ�в�ͬ��
 
 ���캯�����ڶ���һ���������С��������ʼ����
 ��һ�㷽���Ƕ�����ò�ִ�У��Ǹ�������Ӷ���߱��Ĺ���

һ�������������캯��ֻ����һ�Ρ�
��һ�㷽�����Ա��ö�����ö�Ρ�

ʲôʱ���幹�캯���أ�
����������ʱ����������ھ;߱�һЩ���Ի�����Ϊ����ô����Щ���ݶ����ڹ��캯���С�

 */


class Person2
{
	private String name;
	private int age;
	
	
	/*
	 * �������顣
	 * ���ã���������г�ʼ��
	 * ����һ�������У����������ڹ��캯��ִ�С�
	 * �͹��캯��������
	 * ���������Ǹ����ж������ͳһ��ʼ����
	 * �����캯���Ǹ���Ӧ�Ķ�����г�ʼ����
	 * 
	 * ���������ж�����ǲ�ͬ�����Եĳ�ʼ�����ݡ�
	 */
	{
		System.out.println("person code run");
		cry();
	}
	
	Person2()
	{
		System.out.println("A:name="+name+",,age="+age);
	}
	Person2(String n)
	{
		name = n;
		System.out.println("B:name="+name+",,age="+age);
	}
	Person2(String n,int a)
	{
		name = n;
		age = a;
		System.out.println("C:name="+name+",,age="+age);
	}
	public void cry()
	{
		System.out.println("cry...");
	}
}

public class PersonDemo2 {

	public static void main(String[] args) 
	{
		Person2 P1 = new Person2();
		//P1.cry();
		//Person P2 = new Person("lisi");//������ʼ��
		
		//Person P = new Person("wangwu",10);
	
		
		
		

	}

}
