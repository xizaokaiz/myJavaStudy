package e_gather;

import java.util.*;

/*
���Ͽ��
Ϊʲô�������ô��������أ�
��Ϊÿһ�����������ݵĴ洢��ʽ���в�ͬ��
����洢��ʽ��֮Ϊ�����ݽṹ��
 */

/*
�Ͱ�ȡ����ʽ�����ڼ��ϵ��ڲ���
����ȡ����ʽ�Ϳ���ֱ�ӷ��ʼ������ݵ�Ԫ�ء�
��ôȡ����ʽ�ͱ���������ڲ��ࡣ

��ÿһ�����������ݽṹ��ͬ��
����ȡ���Ķ���ϸ��Ҳ��һ�������Ƕ��й������ݣ��жϺ�ȡ������ô���Խ���Щ���Գ�ȡ��

��ô��Щ�ڲ��඼����һ�����򣬸ù�����Iterator��
��λ�ȡ��ϵ�ȡ�������أ�
ͨ��һ�������ṩ�ķ�����iterator();
 */

/*
1��add�����Ĳ���������Object���Ա��ڽ����������Ͷ���

2�������д洢�Ķ��Ƕ��������(��ַ)��

ʲô�ǵ������أ�
��ʵ���Ǽ��ϵ�ȡ��Ԫ�صķ�ʽ��
 */
public class CollectionDemo 
{

	public static void main(String[] args) 
	{
		method_get();
	}
	
	public static void method_get()
	{
		ArrayList al1 = new ArrayList();
		
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		/*
		Iterator it = al1.iterator();//��ȡ������������ȡ�������е�Ԫ�ء�
		while(it.hasNext())
		{
			sop(it.next());
		}
		*/
		
		for(Iterator it = al1.iterator();it.hasNext();)//�ڴ��ͷ�
		{
			sop(it.next());
		}
	}
	
	public static void method_2()
	{
		ArrayList al1 = new ArrayList();
		
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");
		
		ArrayList al2 = new ArrayList();
		
		al2.add("java03");
		al2.add("java04");
		al2.add("java05");
		al2.add("java06");
		
		//al1.retainAll(al2);//ȡ������all��ֻ�ᱣ����al2����ͬ��Ԫ�ء�
		al1.removeAll(al2);//ɾ��������Ԫ��
		
		sop("al1:"+al1);
		sop("al2:"+al2);
		
	}
	
	public static void base_method()
	{
		//����һ������������ʹ��Collection�ӿڵ����ࡣArrayList
		ArrayList al = new ArrayList();
				
		//1�����Ԫ�ء�
		al.add("java01");//add(Object obj);
		al.add("java02");
		al.add("java03");
		al.add("java04");
				
		//��ӡԭ����
		sop("ԭ����:"+al);
				
		//3��ɾ��Ԫ�ء�
		//al.remove("java02");
		//al.clear();//��ռ��ϡ�
				
		//4���ж�Ԫ�ء�
		sop("java03�Ƿ����"+al.contains("java03"));
		sop("�����Ƿ�Ϊ�գ���"+al.isEmpty());
				
		//2����ȡ����(���ϳ���)��
		sop("size:"+al.size());
				
		//��ӡ�ı��ļ��Ρ�
		sop(al);
		
	}
	
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
