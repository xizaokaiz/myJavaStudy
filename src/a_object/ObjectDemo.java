package a_object;

/*
Object:�����ж����ֱ�Ӻ��߼�Ӹ��࣬��˵�е��ϵۡ�
�����ж���Ŀ϶������ж��󶼾߱��Ĺ��ܡ�

Object�����Ѿ��ṩ�˶Զ����Ƿ���ͬ�ıȽϷ�����
����Զ�������Ҳ�бȽ���ͬ�Ĺ��ܣ�û�б�Ҫ���¶��塣
ֻҪ��Ϯ�����еĹ��ܣ������Լ����еıȽ����ݼ��ɣ�����Ǹ��ǡ�
 */

class Demo2 //extends Object
{
	private int num;
	Demo2(int num)
	{
		this.num = num;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Demo2))//�ж��������obj�ͣ�����flase
			return false;
		Demo2 d = (Demo2)obj;
		return this.num == d.num;
	}
	
	/*
	public boolean compare(Demo2 d)
	{
		return this.num==d.num;
	}
	*/
	public String toString()
	{
		return "demo:"+num;
	}
}

class Person
{
	
}

public class ObjectDemo {

	public static void main(String[] args) 
	{
		Demo2 d1 = new Demo2(4);
		System.out.println(d1.toString());
		//Demo2 d2 = new Demo2(4);
//		Class c = d1.getClass();
//		System.out.println(c.getName());
//		System.out.println(Integer.toHexString(d1.hashCode()));
//		System.out.println(d1.toString());
		//Person p = new Person();
		//System.out.println(d1.equals(p));

	}

}
