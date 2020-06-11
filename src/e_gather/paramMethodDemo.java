package e_gather;

/*
JDK1.5版本出现的新特性。

方法的可变参数：
在使用时注意：可变参数一定要定义在参数列表的最后面。
 */

public class paramMethodDemo 
{

	public static void main(String[] args) 
	{
		/*
		可变参数：
		其实就是上一种数组参数的简写形式，不用每一次都手动的建立数组对象，
		只要将要操作的元素作为参数传递即可。
		隐式的将这些参数封装成了数组。
		 */
		show("haha",4,3,2,4);

	}
	
	public static void show(String str,int... arr)
	{
		System.out.println(arr.length);
	}
	
	/*
	public static void show(int[] arr)
	{
		
	}
	*/

}
