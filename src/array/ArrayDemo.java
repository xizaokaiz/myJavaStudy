package array;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		//int[] arr = new int[3]; //һ������
		//int[][] arr = new int[3][4]; //����������Ϊarr�Ķ�ά���飬��ά��������3��һ������
								   //ÿһ��һ�����������ĸ�Ԫ��
		int[][] arr = {{3,5,1,7},{2,3,5,8},{6,1,8,2}};
		//��ά�������
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
