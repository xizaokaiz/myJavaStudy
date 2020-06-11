package e_gather;

import java.util.*;

/*
Arrays:用于操作数组的工具类
里面都是静态方法。

asList:将数组变成list集合
 */

public class ArraysDemo 
{

	public static void main(String[] args)
	{
		/*
		int[] arr = {2,4,5};
		
		System.out.println(Arrays.toString(arr));
		*/
		
		String[] arr = {"abc","cc","kkkk"};
		
		//把数组变成list集合有什么好处？
		/*
		可以使用集合的思想和方法来操作数组中的元素。
		
		注意：将数组变成集合，不可以使用集合的增删方法，
		因为数组的长度是固定的。
		
		如果你增删，那么会发生UnsupportedOperationException
		 */
		List<String> list = Arrays.asList(arr);
//		sop("contains:"+list.contains("cc"));
//		list.add("qq");//UnsupportedOperationException
//		sop(list);
//----------------------------------------------------------------------------------		
		/*
		如果数组中的元素都是对象，那么变成集合时，数组中的元素就直接转成集合中的元素。
		如果数组中的元素都是基本数据类型，那么会将该数组作为集合中的元素存在。
		 */
		
//		int[] nums = {2,4,5};
		Integer[] nums = {2,4,5};
		
		List<Integer> li = Arrays.asList(nums);
		sop(li);

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}












