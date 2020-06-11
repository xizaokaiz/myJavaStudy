package d_string;
/*
StringBuffer���ַ�����������

��һ������
�ص㣺
1�����ҳ����ǿɱ仯�ġ�
2�������ֽڲ�������������͡�
3�����ջ�ͨ��toString��������ַ�����
CURD
C create U update R read D delete

1���洢��
	StringBuffer append():��ָ��������Ϊ������ӵ��������ݽ�β����
	StringBuffer insert(index,����)�����Խ����ݲ��뵽ָ��indexλ�á�
	
2��ɾ����
	StringBuffer delete(start,end):ɾ���������е����ݣ�����start��������end��
	StringBuffer deleteCharAt(index):ɾ��ָ��λ�õ��ַ���

3����ȡ
	char CharAt(int index)
	int indexOf(String str)
	int lastIndexOf(String str)
	int length()
	String substring(int start,int end)

4���޸�
	StringBuffer replace(start,end,string);
	void setCharAt(int index,char ch);
	
5����ת
	StringBuffer reverse();
	
6������������ָ�����ݴ洢��ָ���ַ�������
	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) 
	
JDK1.5�汾֮�������StringBuilder

StringBuffer���߳�ͬ����
StringBuilder���̲߳�ͬ����

�Ժ󿪷�������ʹ��StringBuilder
�����������أ�
1�����Ч��
2������д
3����߰�ȫ��
 */


public class StringBufferDemo 
{

	public static void main(String[] args) 
	{
		//method_update();
		
		StringBuilder sb = new StringBuilder("abcdef");
		
		char[] chs = new char[6];
		sb.getChars(1,4,chs,1);
		for(int x=0;x<chs.length;x++)
		{
			sop("chs["+x+"]="+chs[x]+";");
		}

	}
	public static void method_update()
	{
		StringBuffer sb = new StringBuffer("abcde");
//		sb.replace(1,4,"java");
		sb.setCharAt(2,'k');
		sop(sb.toString());
	}
	
	public static void method_del()
	{
		StringBuffer sb = new StringBuffer("abcde");
//		sb.delete(1,3);
		//��ջ�����
//		sb.delete(0,sb.length());
//		sb.delete(2,3);
		sb.deleteCharAt(2);
		sop(sb.toString());
	}
	
	public static void method_add()
	{
		StringBuffer sb = new StringBuffer();
		
		sb.append("abc").append(false).append(34);
//		StringBuffer sb1 = sb.append(34);
//		sop("sb==sb1:"+(sb==sb1));
		sb.insert(1,"qq");
		sop(sb.toString());
//		sop(sb1.toString());
	}
	
	public static void sop(String str)
	{
		System.out.println(str);
	}

}
