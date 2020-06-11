package e_gather;

import java.util.*;

/*
集合框架
为什么会出现这么多的容器呢？
因为每一个容器对数据的存储方式都有不同。
这个存储方式称之为：数据结构。
 */

/*
就把取出方式定义在集合的内部，
这样取出方式就可以直接访问集合内容的元素。
那么取出方式就被定义成了内部类。

而每一个容器的数据结构不同，
所以取出的动作细节也不一样。但是都有共性内容：判断和取出。那么可以将这些共性抽取。

那么这些内部类都符合一个规则，该规则是Iterator。
如何获取结合的取出对象呢？
通过一个对外提供的方法：iterator();
 */

/*
1、add方法的参数类型是Object，以便于接收任意类型对象。

2、集合中存储的都是对象的引用(地址)。

什么是迭代器呢？
其实就是集合的取出元素的方式。
 */
public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		method_get();
	}
	
	public static void method_get()
	{
		ArrayList al1 = new ArrayList();
		
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		/*
		Iterator it = al1.iterator();//获取迭代器，用于取出集合中的元素。
		while(it.hasNext())
		{
			sop(it.next());
		}
		*/
		
		for(Iterator it = al1.iterator();it.hasNext();)//内存释放
		{
			sop(it.next());
		}
	}
	
	public static void method_2()
	{
		ArrayList al1 = new ArrayList();
		
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		
		ArrayList al2 = new ArrayList();
		
		al2.add("java03");
		al2.add("java04");
		al2.add("java05");
		al2.add("java06");
		
		//al1.retainAll(al2);//取交集，all中只会保留和al2中相同的元素。
		al1.removeAll(al2);//删除交集的元素
		
		sop("al1:"+al1);
		sop("al2:"+al2);
		
	}
	
	public static void base_method()
	{
		//创建一个集合容器。使用Collection接口的子类。ArrayList
		ArrayList al = new ArrayList();
				
		//1、添加元素。
		al.add("java01");//add(Object obj);
		al.add("java02");
		al.add("java03");
		al.add("java04");
				
		//打印原集合
		sop("原集合:"+al);
				
		//3、删除元素。
		//al.remove("java02");
		//al.clear();//清空集合。
				
		//4、判断元素。
		sop("java03是否存在"+al.contains("java03"));
		sop("集合是否为空？："+al.isEmpty());
				
		//2、获取个数(集合长度)。
		sop("size:"+al.size());
				
		//打印改变后的几何。
		sop(al);
		
	}
	
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
