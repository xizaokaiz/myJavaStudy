package a_object.class_;
///*
// * this������ȥ�����������־ֲ������ͳ�Ա����ͬ�������
// * thisΪʲô���Խ��������⣿
// * this���״������ʲô�أ�
// * 
// * this���ʹ�����Ķ��󣬵��״�����һ���أ�
// * this���������ں����������������
// * ��˵���ĸ������ڵ���this���ڵĺ�����this�ʹ����Ǹ�����
// * 
// * this��Ӧ�ã����������й���ʱ���ú����ڲ�Ҫ�õ����øú����Ķ���ʱ����ʱ��this����ʾ�������
//				�������๦���ڲ�ʹ���˱�����󣬶���this��ʾ��
// */
class Person3
{
	private String name;
	private int age;
	
	Person3(int age)
	{
		this.age = age;
	
	}
	
	
	Person3(String name)
	{
		this.name = name;
	}
	Person3(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public void speak()
	{
		System.out.println("name="+this.name+"..age="+this.age);
		this.show();
	}
	public void show()
	{
		System.out.println(this.name);
	}

/*
 * ���󣺸��˶���һ�����ڱȽ������Ƿ���ͬ�Ĺ��ܣ�Ҳ�����Ƿ���ͬ����
 */
	
	public boolean compare(Person3 p)
	{
		return this.age==p.age;//this:�ĸ���������˷�����this�ʹ����ĸ�����
	}
	
}

public class PersonDemo3 
{

	public static void main(String[] args) 
	{
		Person3 p1 = new Person3(20);
		Person3 p2 = new Person3(25);
		boolean b = p1.compare(p2);//���岼���ͷ���ֵ
		System.out.println(b);
		//Person p = new Person("lisi");
		//Person p1 = new Person("zhangsan");
		//p.speak();
		//p1.speak();
		
	}

}
