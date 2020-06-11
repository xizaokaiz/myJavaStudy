package e_gather.map;

/*
map扩展知识:

map集合被使用是因为具备映射关系。

分析问题：
一个学校有多个教室，每一个教室都有名称。
 */

import java.util.*;

class Student4
{
	private String name;
	private String id;
	public Student4(String id,String name)
	{
		this.name = name;
		this.id = id ;
	}
	public String toString()
	{
		return id+name;
	}
}

public class MapDemo3 
{
	//遍历与存储学生对象
	public static void demo()
	{
		HashMap<String,List<Student4>> czbk = new HashMap<String,List<Student4>>();
		
		List<Student4> yure = new ArrayList<Student4>();
		List<Student4> jiuye = new ArrayList<Student4>();
		
		czbk.put("yureban",yure);
		czbk.put("jiuye",jiuye);
		
		yure.add(new Student4("01","zhangsan"));
		yure.add(new Student4("02","wangwu"));
		jiuye.add(new Student4("01","lisi"));
		jiuye.add(new Student4("02","zhangliu"));
		
		Iterator<String> it = czbk.keySet().iterator();
		while(it.hasNext())
		{
			String roomName = it.next();
			List<Student4> room = czbk.get(roomName);
			System.out.println(roomName);
			getInfos(room);
			
		}
	}
	public static void getInfos(List<Student4> list)
	{
		Iterator<Student4> it = list.iterator();
		while(it.hasNext())
		{
			Student4 s = it.next();
			System.out.println(s);
		}
	}
	
	

	public static void main(String[] args) 
	{
		demo();
		
		/*
		//一对多：传智播客
		//				|--预热班
		//				|--就业班
		HashMap<String,HashMap<String,String>> czbk = new HashMap<String,HashMap<String,String>>();
		
		HashMap<String,String> jiuye = new HashMap<String,String>();
		
		HashMap<String,String> yure = new HashMap<String,String>();
		
		czbk.put("yuyreban",yure);
		czbk.put("jiuyeban",jiuye);
		
		jiuye.put("01","zhangsan");
		jiuye.put("02","lisi");
		
		
		yure.put("01","wangwu");
		yure.put("02","zhaoliu");
		
		//遍历czbk集合，获取所有的教室
		Iterator<String> it = czbk.keySet().iterator();
		while(it.hasNext())
		{
			String roomName = it.next();
			HashMap<String,String> room = czbk.get(roomName);
			System.out.println(roomName);
			getStudentInfo(room);
		}
	*/	
		
		
		
	}
	public static void getStudentInfo(HashMap<String,String> roomMap)
	{
		Iterator<String> it = roomMap.keySet().iterator();
		while(it.hasNext())
		{
			String id = it.next();
			String name = roomMap.get(id);
			System.out.println(id+":"+name);
		}
	
	}
	

}
