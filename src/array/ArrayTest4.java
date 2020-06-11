package array;

public class ArrayTest4 {
	//����Ĳ��Ҳ���
	public static void main(String[] args) {
	int[] arr = {2,4,5,7,19,32,45};
	int index = getIndex_2(arr,8);
	System.out.println("index="+index);
		
	}
	//��ϰ����һ����������飬��Ҫ��һ��Ԫ�ز��뵽�������У���Ҫ��֤������������ġ�8
	//��λ�ȡ��Ԫ���������е�λ��
	public static int getIndex_2(int[] arr,int key)
	{
		int min = 0,max = arr.length-1,mid;
		while(min<=max)
		{
			mid = (min+max)>>1;
			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				 max = mid - 1;
			else
				return mid;
		}
		return min; //���ز���Ԫ�صĽǱ�
	}
	
	
	
	//�۰�ĵڶ��ַ�ʽ
	public static int halfSearch_2(int[] arr,int key)
	{
		int min = 0,max = arr.length-1,mid;
		while(min<=max)
		{
			mid = (min+max)>>1;
			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;
			else 
				return mid;
		}
		return -1;
	}
	
	//�۰���ҡ����Ч�ʣ����Ǳ���Ҫ��֤
	public static int halfSearch(int[] arr,int key)
	{
		int min,max,mid;
		min = 0;
		max = arr.length-1;
		mid = (min+max)/2;
		
		while(arr[mid]!=key)
		{
			if(key>arr[mid])
				min = mid + 1;
			else if(key<arr[mid])
				max = mid - 1;
			if(min>max)
				return -1;
			mid = (max+mid)/2;
		}
		return mid;
		
	}
	
	//���幦�ܣ���ȡkey��һ�γ����������е�λ�ã��������ʱ-1 ��ô�����key�������в����ڡ�
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
	
}
