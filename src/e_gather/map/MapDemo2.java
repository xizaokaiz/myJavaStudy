package e_gather.map;

/*
map集合的两种遍历方式：
1.Set<k> keySet：将map中所有的键存存入到Set集合。因为set具备迭代器。
	所有可以迭代方式取出所有的键，再根据get方法，获取每一个键的值
	
	Map集合的取出原理：将map集合转成set集合，再通过迭代器取出。
2.Set<Map.Entry<k,v>> entrySet:将map集合中的映射关系存入到了set集合中，而这个关系的数据类型就是:Map.Entry
								entrySet()-->将Map集合中的映射关系取出，这个关系就是Map.Entry类型
								那么关系对象Map.Entry获取到后，就可以通过Map.Entry中getKey和getValue方法获取关系中的键和值。
								
Map.Entry 其实Entry也是一个接口，它是Map接口中的一个内部接口
interface Map
{
	public static interface Entry
	{
		public abstract Object getKey();
		public abstract Object getValue();
	}
}

class HashMap Implements Map
{
	class Hahs implements Map.Entry
	{
		public Object getKey(){}
		public Object getValue(){}
	}
}
*/


import java.util.*;

public class MapDemo2 
{

	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<String,String>();
		
		map.put("01","zhansan1");
		map.put("02","zhansan2");
		map.put("03","zhansan3");
		map.put("04","zhansan4");
		
		//将Map集合中的映射关系取出，存入到Set集合中。
		Set<Map.Entry<String,String>> entrySet= map.entrySet();
		
		Iterator<Map.Entry<String,String>> it = entrySet.iterator();
		
		while(it.hasNext())
		{
			Map.Entry<String,String> me = it.next();
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+":"+value);
			
		}
		
		
		
		//先获取map集合的所有键的Set集合，keySet();
		/*
		Set<String> keySet = map.keySet();
		//有了Set集合，就可以获取其迭代器。
		Iterator<String> it = keySet.iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			//有了键可以通过map集合的get方法获取其对应的值。
			String value = map.get(key);
			System.out.println("key:"+key+",value:"+value);
		}
		*/
		
		/*
		 * foreach遍历
		for(String str:keySet)
		{
			System.out.println(str+map.get(str));
		}
		*/
		
		
		

	}

}
