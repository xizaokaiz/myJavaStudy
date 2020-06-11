package array;

public class ArrayTest {

	public static void main(String[] args) {
	
		int[] arr = {5,1,6,4,8,9};
		int max = getMax_2(arr);
		System.out.println("Max="+max);
		int min = getMin(arr);
		System.out.println("Min="+min);
	}
	public static int getMax(int[] arr)
	{
		int max = arr[0];
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>max)
				max = arr[x];
		}
		return max;
		
	}
	/*获取最大值的另一种方式,将临时变量初始化为数组中任意一个角标*/
	public static int getMax_2(int[] arr)
	{
		int max = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>max)
				max = x;
		}
		return arr[max];
		
	}
	//获取最小值
	public static int getMin(int[] arr)
	{
		int min = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]<arr[min])
				min = x;
		}
		return arr[min];
	}
	//获取doble类型数组的最大值。因为功能一致，所以定义相同函数名称，以重载形式存在
	/*public static double getMax(double[] arr)
	{
		
	}*/
	
	

}
