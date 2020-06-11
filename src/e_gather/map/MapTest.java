package e_gather.map;

/*
ÿһ��ѧ�����ж�Ӧ�Ĺ����ء�
ѧ��Student����ַString��
ѧ�����ԣ����������䡣
ע�⣺������������ͬ����Ϊͬһ��ѧ����
��֤ѧ����Ψһ�ԡ�

1.����ѧ����

2.����Map��������ѧ����Ϊ������ַ��Ϊֵ�����롣

3.��ȡMap�����е�Ԫ�ء�

*/

import java.util.*;

class Student3 implements Comparable<Student3>
{
	private String name;
	private int age;
	public Student3(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	
	public int compareTo(Student3 s)
	{
		int num = new Integer(this.age).compareTo(new Integer(s.age));
		if(num==0)
			return this.name.compareTo(s.name);
		return num;
	}
	
	public int hashCode()
	{
		return name.hashCode()+age*39;
	}
	
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student3))
			throw new ClassCastException("���ʹ���");
		Student3 s = (Student3)obj;
		return this.name.equals(s.name) && this.age==s.age;
	}
	
	public String toString()
	{
		return name+":"+age;
	}
	
	
}

public class MapTest 
{

	public static void main(String[] args) 
	{
		HashMap<Student3,String> hm = new HashMap<Student3,String>();
		
		hm.put(new Student3("zhangsan01",18),"shanghai");
		hm.put(new Student3("zhangsan01",18),"chongqing");
		hm.put(new Student3("zhangsan02",19),"shenzhen");
		hm.put(new Student3("zhangsan03",17),"guangdong");
		hm.put(new Student3("zhangsan04",16),"beijing");
		
		//��һ��ȡ����ʽ keySet
//		Set<Student3> keySet = hm.keySet();
//		Iterator<Student3> it = keySet.iterator();
//		
//		while(it.hasNext())
//		{
//			Student3 stu = it.next();
//			String addr = hm.get(stu);
//			System.out.println(stu+":"+addr);
//		}
		
		//�ڶ���ȡ����ʽentrySet
		Set<Map.Entry<Student3,String>> entrySet = hm.entrySet();
		
		Iterator<Map.Entry<Student3,String>> it = entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Student3,String> me = it.next();
			Student3 stu = me.getKey();
			String addr = me.getValue();
			System.out.println(stu+":"+addr);
		}
		
		

	}

}
