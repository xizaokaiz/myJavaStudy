package e_gather.set;

/*
|--Set:Ԫ��������(�����ȡ����˳��һ��һ��)��Ԫ�ز������ظ���
	|--HashSet:�ײ����ݽṹ�ǹ�ϣ��
			HashSet����α�֤Ԫ��Ψһ�Ե��أ�
			��ͨ��Ԫ�ص�����������hasCode��equals����ɡ�
			���Ԫ�ص�HashCodeֵ��ͬ���Ż��ж�equals�Ƿ�Ϊtrue��
			���Ԫ�ص�hashCodeֵ��ͬ���������equals��
			
			ע�⣬�����ж�Ԫ���Ƿ���ڣ��Լ�ɾ���Ȳ����������ķ���ʱԪ�ص�hashCode��equals������
	|--TreeSet:
Set���ϵĹ��ܺ�Collection��һ�µġ�


 */

import java.util.*;
public class HashSetDemo 
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args) 
	{
		HashSet hs = new HashSet();
		
		hs.add("java01");
		hs.add("java02");
		hs.add("java03");
		hs.add("java04");
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			sop(it.next());
		}

	}

}
