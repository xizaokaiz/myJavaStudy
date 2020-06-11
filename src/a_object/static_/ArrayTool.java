package a_object.static_;
/*
��̬��Ӧ�� ��

ÿһ��Ӧ�ó����ж��й��ԵĹ��ܣ�
���Խ���Щ���ܽ��г�ȡ��������װ
�Ա㸴�á�

��Ȼ����ͨ������ArrayTool�Ķ���ʹ����Щ������������������в�����
���������⣺
1������ʱ���ڷ�װ���ݵģ�����ArrayTool����δ��װ�������ݡ�
2�����������ÿһ��������û���õ�ArratTool�����е��������ݡ�

��ʱ�Ϳ��ǣ��ó�����Ͻ����ǲ���Ҫ����ġ�
���Խ�ArrayTool�еķ����������static�ġ�ֱ��ͨ���������ü��ɡ�

����������̬�󣬿��Է�����ʹ�ã����Ǹ��໹�ǿ��Ա���������������ġ�
Ϊ�˸�Ϊ�Ͻ���ǿ���ø��಻�ܽ�������
����ͨ�������캯��˽�л���ɡ�

����������ArrayTool.class�ļ����͸������ˣ�������ֻҪ���ļ����õ�classpath·���£��Ϳ���ʹ�øù����ࡣ
���ǣ����ź��������е��׶����˶��ٸ��������Է�ȴ���������Ϊ���ಢû��ʹ��˵���顣
��ʼ���������˵���顣java��˵����ͨ���ĵ�ע������ɡ�
 */

/**
����һ�����Զ�������в����Ĺ����࣬�������ṩ�ˣ���ȡ��ֵ������ȹ��ܡ�
@author ����
@version v1.1 
 */
public class ArrayTool 
{
	
	/**
	 * �ղ������캯����
	 */
	private ArrayTool() {}
	
	/**
	 * ѡ������
	 * @param arr ����һ��int���͵�����
	 */
	public static void selectSort(int[] arr)//ѡ������
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
				{
					swap(arr,x,y);
				}
			}
			
		}
		
		/*public static void bubblSort(int[] arr)  //ð������
		{
			for(int x=0;x<arr.length-1;x++)
			{
				for(int y=0;y<arr.length-x-1;y++)
				{
					if(arr[y]>arr[y+1])
					{
						swap(arr,y,y+1);
					}
				}
			}
		}*/
		
	}
	/**
	 ��������Ԫ�ؽ���λ�õ��û�
	 @param arr ����һ��Int���͵�����
	 @param a Ҫ�û���λ��
	 @param b Ҫ�û���λ��
	 */
	private static void swap(int[] arr,int a,int b)//��������������
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
	}
	/**
	 ��ȡһ�����������е���Сֵ
	 @param arr  ����һ��Int���͵���ֵ��
	 @return �᷵��һ������������Сֵ��
	*/ 
	public int getMin(int[] arr)//��Сֵ
	{
		int min = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]<arr[min])
				min = x;
		}
		return min;
		
	}
	/**
	 ��ȡһ�����������е����ֵ
	 @param arr  ����һ��Int���͵���ֵ��
	 @return �᷵��һ�������������ֵ��
	*/ 
	public int getMax(int[] arr)//���ֵ
	{
		int max = 0;
		for(int x=1;x<arr.length;x++)
		{
			if(arr[x]>arr[max])
				max = x;
		}
		return max;
	}
	/**
	 * ���ڴ�ӡ�����е�Ԫ�ء���ӡ��ʽ�ǣ�[elemet1,elemet2]
	 * @param arr ����һ��int��������
	 */
	public static void printArray(int[] arr)
	{
		System.out.print("[");
		for(int x=0;x<arr.length;x++)
		{
			if(x!=arr.length-1) 
			{
			System.out.print(arr[x]+",");
			}
			else System.out.print("]");
		}	
	}

}

/*
һ������Ĭ�ϻ���һ���ղ����Ĺ��캯����
Ĭ�Ϲ��캯����Ȩ��������ı仯���仯��
 */
