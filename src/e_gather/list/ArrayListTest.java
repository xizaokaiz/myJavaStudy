package e_gather.list;

import java.util.*;

/*
ȥ��ArrayList�����е��ظ�Ԫ�ء�
 */

public class ArrayListTest 
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		
		list.add("java01");
		list.add("java02");
		list.add("java01");
		list.add("java02");
		list.add("java01");
		//list.add("java03");
		
		//�ڵ���ʱѭ����next����һ�Σ���ҪhasNext�ж�һ�Σ�
		/*
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			sop(it.next()+"..."+it.next());
		}
		*/
		
//		sop(list);
//		sop(singleElement(list));
	}
	public static ArrayList singleElement(ArrayList list)
	{
		//����һ����ʱ������
		ArrayList newlist = new ArrayList();
		
		Iterator it = list.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if(!newlist.contains(obj))
				newlist.add(obj);
		}
		return newlist;
		
	}

}
