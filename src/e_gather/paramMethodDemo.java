package e_gather;

/*
JDK1.5�汾���ֵ������ԡ�

�����Ŀɱ������
��ʹ��ʱע�⣺�ɱ����һ��Ҫ�����ڲ����б������档
 */

public class paramMethodDemo 
{

	public static void main(String[] args) 
	{
		/*
		�ɱ������
		��ʵ������һ����������ļ�д��ʽ������ÿһ�ζ��ֶ��Ľ����������
		ֻҪ��Ҫ������Ԫ����Ϊ�������ݼ��ɡ�
		��ʽ�Ľ���Щ������װ�������顣
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
