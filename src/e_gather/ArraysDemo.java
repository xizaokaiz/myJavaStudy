package e_gather;

import java.util.*;

/*
Arrays:���ڲ�������Ĺ�����
���涼�Ǿ�̬������

asList:��������list����
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
		
		//��������list������ʲô�ô���
		/*
		����ʹ�ü��ϵ�˼��ͷ��������������е�Ԫ�ء�
		
		ע�⣺�������ɼ��ϣ�������ʹ�ü��ϵ���ɾ������
		��Ϊ����ĳ����ǹ̶��ġ�
		
		�������ɾ����ô�ᷢ��UnsupportedOperationException
		 */
		List<String> list = Arrays.asList(arr);
//		sop("contains:"+list.contains("cc"));
//		list.add("qq");//UnsupportedOperationException
//		sop(list);
//----------------------------------------------------------------------------------		
		/*
		��������е�Ԫ�ض��Ƕ�����ô��ɼ���ʱ�������е�Ԫ�ؾ�ֱ��ת�ɼ����е�Ԫ�ء�
		��������е�Ԫ�ض��ǻ����������ͣ���ô�Ὣ��������Ϊ�����е�Ԫ�ش��ڡ�
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












