package e_gather.list;

import java.util.*;

/*
Collection
	|--List:Ԫ��������ģ�Ԫ�ؿ����ظ�����Ϊ�ü�����ϵ��������
		|--ArrayList:�ײ�����ݽṹʹ�õ�������ṹ���ص㣺��ѯ�ٶȺܿ죬������ɾ�������̲߳�ͬ����
		|--LinkedList:�ײ�ʹ�õ��������ݽṹ���ص㣺��ɾ�ٶȺܿ죬��ѯ������
		|--vector:�ײ����������ݽṹ���߳�ͬ������ѯ����ɾ�ٶ�������ArrayList����ˡ�
	|--Set:Ԫ��������ģ�Ԫ�ز������ظ���

List:
	���з��������ǿ��Բ����Ǳ�ķ������Ǹ���ϵ���еķ�����
	
��
	add(index,element);
	addAll(index,Collection);
ɾ
	remove(index);
��
	set(index,element);
��
	get(index);
	subList(from,to);
	listIterator();
	
List�������еĵ�������ListIterator��Iterator���ӽӿڡ�

�ڵ���ʱ��������ͨ����϶���ķ������������е�Ԫ�أ�
��Ϊ�ᷢ��ConcurrentModificationException��

���ԣ��ڵ���ʱ��ֻ���õ������ķ�������Ԫ�أ�����Iterator����ʱ���޵ģ�
ֻ�ܶ�Ԫ�ؽ����жϣ�ȡ����ɾ���Ĳ�����
�����Ҫ�����Ĳ�������ӣ��޸ĵȣ�����Ҫʹ�����ӽӿ�ListIterator��

�ýӿ�ֻ��ͨ��List���ϵ�listIterator������ȡ��
 */
public class ListDemo 
{

	public static void main(String[] args) 
	{
		//��ʾ�б��������
		ArrayList al = new ArrayList();
		
		//���Ԫ�ء�
		al.add("java01");
		al.add("java02");
		al.add("java03");
		
		sop(al);
		
		ListIterator li = al.listIterator();
//		sop("hasPrevious():"+li.hasPrevious());
		while(li.hasNext())
		{
			Object obj = li.next();
			if(obj.equals("java02"))
				//li.add("java007");
				li.set("java007");
		}
		
		while(li.hasPrevious())
		{
			sop("pre:"+li.previous());//���Ϊ�棬ȡ��ǰһ��Ԫ��
		}
//		sop("hasNext():"+li.hasNext());//�жϺ�һ���Ƿ���Ԫ��
//		sop("hasPrevious():"+li.hasPrevious());//�ж�ǰһ���Ƿ���Ԫ��
		
		sop(al);
		
		/*
		//�ڵ��������У�׼����ӻ���ɾ��Ԫ�ء�
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object obj = it.next();
			if(obj.equals("java02"))
				//al.add("java008");
				it.remove();//��java02�����ôӼ�����ɾ���ˡ�
			sop("obj="+obj);
		}
		sop(al);
		*/

	}
	
	public static void method()
	{
		//��ʾ�б��������
		ArrayList al = new ArrayList();
		
		//���Ԫ�ء�
		al.add("java01");
		al.add("java02");
		al.add("java03");
		
		sop("ԭ���ϣ�"+al);
		
		//��ָ��λ�����Ԫ�ء�
		al.add(1,"java09");
		
		//ɾ��ָ��λ�õ�Ԫ�ء�
		//al.remove(2);
		
		//�޸�Ԫ�ء�
		//al.set(2,"java007");
		
		//ͨ���Ǳ��ȡԪ�ء�
		sop("get(1):"+al.get(1));
		
		sop(al);
		
		//��ȡ����Ԫ�ء�
		for(int x=0;x<al.size();x++)
		{
			System.out.println("al("+x+")="+al.get(x));
		}
		
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			sop("next:"+it.next());
		}
		
		//ͨ��index��ȡ�����λ�á�
		sop("index="+al.indexOf("java02"));
		
		//�����б���ָ���ķ�Χ��Ԫ�أ�����ͷ������β
		List sub = al.subList(1,3);
		
		sop("sub="+sub);
		
	}
	
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
