package e_gather.list;

/*
ʹ��LinkedListģ��һ����ջ���߶������ݽṹ��

��ջ���Ƚ���� ��ͬһ�����ӡ�
���У��Ƚ��ȳ� First in First out FIFO ��ͬһ��ˮ�ܡ�


 */
import java.util.*;

class Processtion
{
	private LinkedList link;
	Processtion()
	{
		link = new LinkedList();
	}
	public void myAdd(Object obj)
	{
		link.addFirst(obj);
	}
	public Object myGet()
	{
		return link.removeLast();//�Ƚ��ȳ�
		//return link.removeFirst();//�Ƚ����
	}
	public boolean isNull()
	{
		return link.isEmpty();
	}
	
}

public class LinkedListTest 
{

	public static void main(String[] args) 
	{
		Processtion p = new Processtion();
		
		p.myAdd("java01");
		p.myAdd("java02");
		p.myAdd("java03");
		p.myAdd("java04");
		
		while(!p.isNull())
		{
			System.out.println(p.myGet());
		}

	}

}
