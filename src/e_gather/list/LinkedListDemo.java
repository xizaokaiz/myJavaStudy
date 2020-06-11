package e_gather.list;

import java.util.*;
/*
LinkedList���з���
addFirst();
addLast();

getFirst();
getLast();
��ȡԪ�أ�����ɾ��Ԫ�ء�

removeFirst();
removeLast();
��ȡԪ�أ���Ԫ�ر�ɾ�������������û��Ԫ�أ������NoSuchElementException

��JDK1.6����������취��

offerFirst();
offerLast();

peekFirst();
peekLast();
��ȡԪ�أ�����ɾ��Ԫ�ء����������û��Ԫ�أ��᷵��null��

pollFirst();
pollLast();
��ȡԪ�أ���Ԫ�ر�ɾ�������������û��Ԫ�أ��᷵��null��
 */
public class LinkedListDemo 
{

	public static void main(String[] args) 
	{
		LinkedList link = new LinkedList();
		
		link.addLast("java01");
		link.addLast("java02");
		link.addLast("java03");
		link.addLast("java04");
		
//		sop(link.removeFirst());
//		sop(link.removeFirst());
//		sop("size="+link.size());
		
//		sop(link);
//		sop(link.getFirst());
//		sop(link.getLast());
		
		//����
		while(!link.isEmpty())
		{
			sop(link.removeLast());
		}
		
		
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
