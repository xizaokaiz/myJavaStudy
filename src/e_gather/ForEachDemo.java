package e_gather;

import java.util.*;
/*
�߼�forѭ��

��ʽ��
for(�������� ���������������ļ���(Collection)��������)
{

}

�Լ��Ͻ��б�����ֻ�ܻ�ȡԪ�أ����ǲ��ܶԼ��Ͻ��в�����

���������˱����������Խ���remove������Ԫ�صĶ�����
���ʹ��ListIterator���������ڱ��������жԼ��Ͻ�����ɾ�Ĳ�Ķ�����

��ͳfor�͸߼�for��ʲô�����أ�
�߼�for��һ�������ԣ������Ǳ�������Ŀ�ꡣ
���飺�ڱ��������ʱ�򣬻���ϣ��ʹ�ô�ͳfor����Ϊ��ͳfor���Զ���Ǳꡣ
 */
public class ForEachDemo 
{

	public static void main(String[] args) 
	{
		
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("abc01");
		al.add("abc02");
		al.add("abc03");
		
		for(String s:al)
		{
			s = "kk";
			//System.out.println(s);
		}
		System.out.println(al);
		
		int[] arr = {3,5,1};
		for(int i:arr)
		{
			System.out.println("i:"+i);
		}
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(1,"a");
		hm.put(2,"b");
		hm.put(3,"c");
		
		Set<Integer> keySet = hm.keySet();
		for(Integer i:keySet)
		{
			System.out.println(i+":"+hm.get(i));
		}
		
		
		for(Map.Entry<Integer,String> me:hm.entrySet())
		{
			System.out.println(me.getKey()+"..."+me.getValue());
		}
		
	}

}
