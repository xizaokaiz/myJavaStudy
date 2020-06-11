package e_gather.map;

/*
每一个学生都有对应的归属地。
学生Student，地址String。
学生属性：姓名，年龄。
注意：姓名和年龄相同的视为同一个学生。
保证学生的唯一性。

1.描述学生。

2.定义Map容器，将学生作为键，地址作为值，存入。

3.获取Map集合中的元素。

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
			throw new ClassCastException("类型错误");
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
		
		//第一种取出方式 keySet
//		Set<Student3> keySet = hm.keySet();
//		Iterator<Student3> it = keySet.iterator();
//		
//		while(it.hasNext())
//		{
//			Student3 stu = it.next();
//			String addr = hm.get(stu);
//			System.out.println(stu+":"+addr);
//		}
		
		//第二种取出方式entrySet
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
