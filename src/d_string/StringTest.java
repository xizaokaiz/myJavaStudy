package d_string;
/*
1��ģ��һ��trim������ȥ���ַ������˵Ŀո�
	˼·��
	1���ж��ַ�����һ��λ���Ƿ��ǿո�����Ǽ��������жϣ�ֱ�����ǿո�Ϊֹ��
		��β���жϿո�Ҳ����ˡ�
	2������ʼ�ͽ�β���жϵ����ǿո�ʱ������Ҫ��ȡ���ַ�����
	
2����һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת��"abcdefg";abfedcg
	˼·��
	1������ѧϰ���������Ԫ�ؽ��з�ת��
	2�����ַ���������飬�����鷴ת��
	3������ת����������ַ�����
	4��ֻҪ����ת�Ĳ��ֵĿ�ʼ�ͽ���Ϊֹ��Ϊ�������ݼ��ɡ�
	

 */


public class StringTest 
{
	public static void sop(String str)
	{
		System.out.println(str);
	}
	public static void main(String[] args) 
	{
		String s = "  ab cd  ";
		sop("("+s+")");
//		s = myTrim(s);
//		sop("("+s+")");
		sop("("+reverseString(s)+")");

	}
	
	//��ϰһ��ȥ���ַ������˿ո�
	public static String myTrim(String str)
	{
		int start = 0,end = str.length()-1;
		while(start<=end && str.charAt(start)==' ')
			start++;
		while(start<=end && str.charAt(end)==' ')
			end--;
		
		return str.substring(start,end+1);
	}
//-------------------------------------------------------------------------------------------------	
	//��ϰ�������ַ�����ת��
	/*
	˼·��
	1�����ַ����������
	2�������鷴ת
	3�����������ַ���
	 */
	
	public static String reverseString(String s,int start,int end)
	{
		//�ַ���������
		char[] chs = s.toCharArray();
		
		//��ת����
		reverse(chs,start,end);
		
		//���������ַ���
		return new String(chs);
	}
	public static String reverseString(String s)
	{
		return reverseString(s,0,s.length());
	}
	private static void reverse(char[] arr,int x,int y)
	{
		for(int start=x,end=y-1;start<end;start++,end--)
		{
			swap(arr,start,end);
		}
		
	}
	private static void swap(char[] arr,int x,int y)
	{
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
//-------------------------------------------------------------------------------------------------	

}
