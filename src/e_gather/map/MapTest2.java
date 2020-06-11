package e_gather.map;

import java.util.*;
/*
需求：对学生对象的年龄进行升序排序。

因为数据时以键值对形式存在的，所以要使用可以排序的Map集合。TreeMap
 */

class StuNameComparator implements Comparator<Student3>
{
	public int compare(Student3 s1,Student3 s2)
	{
		int num = s1.getName().compareTo(s2.getName());
		if(num==0)
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
		return num;
	}
}

public class MapTest2 
{

	public static void main(String[] args) 
	{
		TreeMap<Student3,String> tm = new TreeMap<Student3,String>();
		
		tm.put(new Student3("zhangsan01",18),"shanghai");
//		tm.put(new Student3("zhangsan01",18),"chongqing");
		tm.put(new Student3("zhangsan02",19),"shenzhen");
		tm.put(new Student3("zhangsan04",17),"guangdong");
		tm.put(new Student3("azhangsan03",16),"beijing");
		
		Set<Map.Entry<Student3,String>> entrySet = tm.entrySet();
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
