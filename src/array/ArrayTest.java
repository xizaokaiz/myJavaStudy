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
	/*��ȡ���ֵ����һ�ַ�ʽ,����ʱ������ʼ��Ϊ����������һ���Ǳ�*/
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
	//��ȡ��Сֵ
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
	//��ȡdoble������������ֵ����Ϊ����һ�£����Զ�����ͬ�������ƣ���������ʽ����
	/*public static double getMax(double[] arr)
	{
		
	}*/
	
	

}
