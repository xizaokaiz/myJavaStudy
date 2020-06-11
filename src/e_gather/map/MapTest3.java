package e_gather.map;

/*
练习：
"adfwaeasdfasdfwgg"获取该字符串中的字母出现的次数。

希望打印结果：a(1)c(2)...

通过结果发下，每一个字母都有对应的次数，
说明字母和次数之间都有映射关系。

注意了，当发现有映射关系时，可以选择map集合。
因为Map集合中存放的就是映射关系。

什么时候使用map集合呢？
当数据之间存在着映射关系时，就先想到map集合。

思路：
1.将字符串转换成字符数组，因为要对每一个字母进行操作。
2.定义一个map集合，因为打印结果的字母有顺序，所以使用treemap集合。
3.遍历字符数组。
	将每一个字母作为键去查map集合，如果返回Null，就将该字母和1存入到map集合中。
	如果返回不是Null,说明该字母在map集合内已经存在，并有对应的次数，那么久获取该次数并进行自增，然后将该字母和自增后的次数存入到map集合中，
	覆盖掉原来键所对一个的值。
4.将map集合中的数据变成指定的字符串形式返回。

 */

import java.util.*;

public class MapTest3 
{

	public static void main(String[] args) 
	{
		String s = charCount("adfwaeasdfasdfwgg");
		System.out.println(s);

	}
	public static String charCount(String str)
	{
		//将字符串存储字符数组
		char[] chs = str.toCharArray();
		
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		int count = 0;
		
		for(int x=0;x<chs.length;x++)
		{
			if(!(chs[x]>='a' && chs[x]<='z' || chs[x]>='A' && chs[x]<='Z'))
				continue;
				
			//值---返回键找值
			Integer value = tm.get(chs[x]);
			
			if(value!=null)
				count = value;
			count++;
			tm.put(chs[x],count);
			count = 0;
			
			/*
			//判断：1.如果为空，将字母与次数1存入。
			//		2.如果不为空，自增1，覆盖存入。
			if(value==null)
			{
				tm.put(chs[x],1);
			}
			else 
			{
				value++;
				tm.put(chs[x],value);
			}
			*/
			
			
		}
		//建立缓冲区
		StringBuilder sb = new StringBuilder();
		
		Set<Map.Entry<Character,Integer>> entrySet = tm.entrySet();
		Iterator<Map.Entry<Character,Integer>> it = entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Character,Integer> me = it.next();
			Character ch = me.getKey();
			Integer value = me.getValue();
			sb.append(ch+"("+value+")");
		}
		return sb.toString();
		
	}

}
