package e_gather.list;

import java.util.*;

/*
ö�پ���Vector���еĳ�ȡ��ʽ��
����ö�ٺ͵���������
��ʵö�ٺ͵�����ʱһ���ġ�

��Ϊö�ٵ������Լ����������ƶ�������
���Ա�������ȡ���ˡ�
ö�����������ˡ�
 */

public class VectorDemo 
{

	public static void main(String[] args) 
	{
		Vector v = new Vector();
		
		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");
		
		Enumeration en = v.elements();
		
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
		}
		
	}

}
