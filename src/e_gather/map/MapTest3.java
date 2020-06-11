package e_gather.map;

/*
��ϰ��
"adfwaeasdfasdfwgg"��ȡ���ַ����е���ĸ���ֵĴ�����

ϣ����ӡ�����a(1)c(2)...

ͨ��������£�ÿһ����ĸ���ж�Ӧ�Ĵ�����
˵����ĸ�ʹ���֮�䶼��ӳ���ϵ��

ע���ˣ���������ӳ���ϵʱ������ѡ��map���ϡ�
��ΪMap�����д�ŵľ���ӳ���ϵ��

ʲôʱ��ʹ��map�����أ�
������֮�������ӳ���ϵʱ�������뵽map���ϡ�

˼·��
1.���ַ���ת�����ַ����飬��ΪҪ��ÿһ����ĸ���в�����
2.����һ��map���ϣ���Ϊ��ӡ�������ĸ��˳������ʹ��treemap���ϡ�
3.�����ַ����顣
	��ÿһ����ĸ��Ϊ��ȥ��map���ϣ��������Null���ͽ�����ĸ��1���뵽map�����С�
	������ز���Null,˵������ĸ��map�������Ѿ����ڣ����ж�Ӧ�Ĵ�������ô�û�ȡ�ô���������������Ȼ�󽫸���ĸ��������Ĵ������뵽map�����У�
	���ǵ�ԭ��������һ����ֵ��
4.��map�����е����ݱ��ָ�����ַ�����ʽ���ء�

 */

import java.util.*;

public class MapTest3 
{

	public static void main(String[] args) 
	{
		String s = charCount("adfwaeasdfasdfwgg");
		System.out.println(s);

	}
	public static String charCount(String str)
	{
		//���ַ����洢�ַ�����
		char[] chs = str.toCharArray();
		
		TreeMap<Character,Integer> tm = new TreeMap<Character,Integer>();
		
		int count = 0;
		
		for(int x=0;x<chs.length;x++)
		{
			if(!(chs[x]>='a' && chs[x]<='z' || chs[x]>='A' && chs[x]<='Z'))
				continue;
				
			//ֵ---���ؼ���ֵ
			Integer value = tm.get(chs[x]);
			
			if(value!=null)
				count = value;
			count++;
			tm.put(chs[x],count);
			count = 0;
			
			/*
			//�жϣ�1.���Ϊ�գ�����ĸ�����1���롣
			//		2.�����Ϊ�գ�����1�����Ǵ��롣
			if(value==null)
			{
				tm.put(chs[x],1);
			}
			else 
			{
				value++;
				tm.put(chs[x],value);
			}
			*/
			
			
		}
		//����������
		StringBuilder sb = new StringBuilder();
		
		Set<Map.Entry<Character,Integer>> entrySet = tm.entrySet();
		Iterator<Map.Entry<Character,Integer>> it = entrySet.iterator();
		while(it.hasNext())
		{
			Map.Entry<Character,Integer> me = it.next();
			Character ch = me.getKey();
			Integer value = me.getValue();
			sb.append(ch+"("+value+")");
		}
		return sb.toString();
		
	}

}
