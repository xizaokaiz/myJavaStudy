package e_gather.collections;
/*
���Ͽ�ܵĹ����ࡣ
Collections:
 */

/*
binarySerch()
sort()
max()
swap()
 */

import java.util.*;
//�Ƚ��ַ������Ƚ�������
class StrLenComparator implements Comparator<String>
{
	public int compare(String s1,String s2)
	{
		if(s1.length()>s2.length())
			return 1;
		if(s1.length()<s2.length())
			return -1;
		return s1.compareTo(s2);
	}
}



public class CollectionsDemo 
{
	public static void binarySerchDemo()
	{
		List<String> list = new ArrayList<String>();
		
		list.add("cbc");
		list.add("abcs");
		list.add("cdcdd");
		list.add("ss");
		
		Collections.sort(list,new StrLenComparator());
		
		System.out.println(list);
		
		//int index = Collections.binarySearch(list,"aaa");
		//int index = halfSerach(list,"cbc");
											/*�Ƚ���˳�����*/
		int index = halfSerach(list,"ss",new StrLenComparator());
		System.out.println("index:"+index);
	}
	
	// �۰����ʵ��ԭ��	--> Collections.binarySearch()
	public static int halfSerach(List<String> list,String key,Comparator<String> comp)
	{
		int max,min,mid;
		max = list.size()-1;
		min = 0;
		
		while(min<=max) 
		{
			mid = (max+min)>>1;//  /2;
			String str = list.get(mid);
			
			//int num = str.compareTo(key);
			
			int num = comp.compare(str,key);
			if(num>0)
				max = mid - 1;
			else if(num<0)
				min = mid + 1;
			else
				return mid;
		}
		return -min-1;
	}
	
	public static void main(String[] args) 
	{
		List<String> list = new ArrayList<String>();
		
		list.add("cbc");
		list.add("abcs");
		list.add("cdcdd");
		list.add("ss");
		
		System.out.println(list);
		
		//sort(List<T> list, Comparator<? super T> c):���򣬱Ƚ��� 
		Collections.sort(list,new StrLenComparator());
		
		System.out.println(list);
		
		//��ȡ���ֵ
		String max = Collections.max(list/*,new StrLenComparator()*/);
		System.out.println("max:"+max);
		
		//����Ԫ��
		Collections.swap(list,1,2);
		System.out.println("swap:"+list);
		
		//��ȡָ��Ԫ���±�
		binarySerchDemo();
		
		
		
	}

}


