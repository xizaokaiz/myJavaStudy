package e_gather.map;

/*
Map集合特点：该集合存储键值对，一对一对往里存，而且要保证键的唯一性。
	1.添加
		put(K key, V value)
		putAll(Map<? extends K,? extends V> m) 
	2.删除
		clear()
		remove(Object key)
	3.判断
		containsKey(Object key)
		containsValue(Object value)
		isEmpty() 
	4.获取
		get(Object key) 
		size()
		values()
		
		entrySet()
		keySet()
		
Map
	|--Hashtable:底层是哈希表数据结构，不可以存入null键null值，该集合是线程同步的。jdk1.0，效率低。
	|--HashMap:底层是哈希表数据结构，允许使用null键null值，该集合是线程不同步的。jdk1.2，效率高。
	|--TreeMap:底层是二叉树数据结构。可以用于给Map集合中的键进行排序。线程不同步。
	
和Set很像
其实Set底层就是使用了Map结合。
 */
import java.util.*;
public class MapDemo 
{

	public static void main(String[] args) 
	{
		Map<String,String> map = new HashMap<String,String>();
		
		//添加元素；如果出现添加相同键的值，那么后添加的值会覆盖原有键对应的值
		//且put方法会返回被覆盖的值。
		map.put("01","zhansan1");
		map.put("02","zhansan2");
		map.put("03","zhansan3");
		
		System.out.println("containKey:"+map.containsKey("02"));
		//System.out.println("remove:"+map.remove("02"));
		
		System.out.println("get:"+map.get("02"));
		
		map.put("04",null);
		System.out.println("get:"+map.get("04"));
		//可以通过get方法的返回值来判断一个键是否存在，通过返回null来判断。
		
		//获取map集合中所有的值。
		Collection<String> coll = map.values();
		System.out.println(coll);
		System.out.println(map);
	}

}
