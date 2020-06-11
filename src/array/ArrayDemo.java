package array;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		//int[] arr = new int[3]; //一堆数组
		//int[][] arr = new int[3][4]; //定义了名称为arr的二维数组，二维数组中有3个一堆数组
								   //每一个一堆数组中有四个元素
		int[][] arr = {{3,5,1,7},{2,3,5,8},{6,1,8,2}};
		//二维数组遍历
		int sum = 0;
		for(int x=0;x<arr.length;x++)
		{
			for(int y=0;y<arr[x].length;y++)
			{
				sum = sum + arr[x][y];
			}
		}
		System.out.println("sum="+sum);
	}
	
}
