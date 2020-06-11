package d_string;

/*
String�������������ַ������
��ô�����ṩ�˶���������ַ������в�����

�����Ĳ�������Щ��
 "abcd"
------------------------------------------------------------------------------------------------- 
1����ȡ��
	1.1 �ַ����а������ַ�����Ҳ�����ַ����ĳ��ȡ�
		int length():��ȡ���ȡ�
	1.2 ����λ�û�ȡλ����ĳ���ַ���
		char charAt(int index):����ָ���������� char ֵ��
	1.3 �����ַ���ȡ���ַ����ַ����е�λ�á�
		int indexOf(int ch):���ص���ch���ַ����е�һ�γ��ֵ�λ�á�
		int indexOf(int ch,int fromIndex):��fromIndexָ��λ�ÿ�ʼ����ȡch���ַ����г��ֵ�λ�á�
		
		int indexOf(String str):���ص���str���ַ����е�һ�γ��ֵ�λ�á�
		int indexOf(String str��int fromIndex):��fromIndexָ��λ�ÿ�ʼ����ȡstr���ַ����г��ֵ�λ�á�
		
		int lastIndexOf(int ch):����
-------------------------------------------------------------------------------------------------		
2���ж�
	2.1 �ַ������Ƿ����ĳһ���Ӵ���
		boolean contains(str):
		����֮����indexOf(str):��������str��һ�γ��ֵ�λ�ã��������-1����ʾ��str�����ַ����д��ڡ�
				���ԣ�Ҳ�������ڶ�ָ���ж��Ƿ������
				if(str.indexOf("aa")!=-1)
				
				���Ҹ÷����������жϣ��ֿ��Ի�ȡ�ַ������ֵ�λ�á�
	2.2 �ַ���ʱ�������ݡ�
		boolean isEmpty():ԭ������жϳ����Ƿ�Ϊ0��
	2.3 �ַ����Ƿ�����ָ�����ݿ�ͷ��
		boolean startsWith(str);
	2.4 �ַ����Ƿ�����ָ�����ݽ�β��
		boolean endsWith(str);
	2.5 �ж��ַ��������Ƿ���ͬ����д��Object���е�equals������
		boolean equals(str);
	2.6 �ж������Ƿ���ͬ�������Դ�Сд��
		boolean equalsIgnoreCase();
-------------------------------------------------------------------------------------------------
3��ת��
	3.1 ���ַ�����ת���ַ�����
		���캯��: String(char[])
				 String(char[],offset,count):���ַ������е�һ����ת���ַ�����
				 
		��̬����: static String copyValueOf(char[]);
				 static String copyValueOf(char[] data,int offset,int count)
				 static String valueOf(char[]):
				 
		
 **	3.2 ���ַ���ת���ַ����顣
 		char[] toCharArray():
 		
	3.3 ���ֽ�����ת���ַ�����
		String(byte[])
		String(byte[],offset,count):���ֽ������е�һ����ת���ַ�����
	3.4 ���ַ���ת���ֽ����顣
		byte[] getBytes():
	3.5 ��������������ת���ַ�����
		static String valueOf(int)
		static String valueOf(double)
		
		//3+"";//String.valueOf(3);
		
		���⣺�ַ������ֽ�������ת�������У��ǿ���ָ�������ġ�
-------------------------------------------------------------------------------------------------		
4���滻
	String replace(oldchar,newchar);
-------------------------------------------------------------------------------------------------
5���и�
	String[] split(regex);
-------------------------------------------------------------------------------------------------
6���Ӵ�����ȡ�ַ����е�һ���֡�
	String substring(begin);
	String substring(begin,end);
-------------------------------------------------------------------------------------------------
7��ת����ȥ���ո񣬱Ƚϡ�
	7.1 ���ַ���ת���ɴ�д����Сд��
		String toUpperCase();
		String toLowerCase();
	7.2 ���ַ������˵Ķ���ո�ȥ����
		String trim();
	7.3 �������ַ���������Ȼ˳��ıȽϡ�
	int compareTo(string);

*/

public class StringMethodDemo 
{
	public static void method_7()
	{
		String s = "   Hello Java   ";
		sop(s.toUpperCase());
		sop(s.toLowerCase());
		sop(s.trim());
		
		String s1 = "a1c";
		String s2 = "aaa";
		sop(s1.compareTo(s2));
	}
	
	public static void method_sub()
	{
		String s = "abcdefg";
		sop(s.substring(2));//��ָ��λ�ÿ�ʼ����β������Ǳ겻���ڣ�������ַ����Ǳ�Խ���쳣��
		sop(s.substring(2,4));//����ͷ��������β�����ұգ�����ȡȫ����s.substring(0,s.length());
	}
	
	public static void method_split()
	{
		String s = "zhangsan,lisim,wangwu";
		String[] arr = s.split(",");
		for(int x=0;x<arr.length;x++)
		{
			sop(arr[x]);
		}
	}
	
	public static void method_replace()
	{
		String s = "hello java";
		//String s1 = s.replace('q','n');//���Ҫ�滻���ַ������ڣ����صĻ���ԭ����
		String s1 = s.replace("java","world");
		sop("s="+s);
		sop("s1="+s1);
	}
	
	public static void method_trans()
	{
		char[] arr = {'a','b','c','d','e','f'};
		
		String s = new String(arr,1,3);
		sop("s="+s);
		
		String s1 = "asdfawer";
		char[] chs = s1.toCharArray();
		
		for(int x=0;x<chs.length;x++)
		{
			sop("ch="+chs[x]);
		}
	}
	
	public static void method_is()
	{
		String str = "ArrayDemo.java";
		
		//�ж��ļ������Ƿ���Array���ʿ�ͷ��
		sop(str.startsWith("Array"));
		//�ж��ļ������Ƿ���.java���ļ���
		sop(str.endsWith(".java"));
		//�ж��ļ����Ƿ����Demo��
		sop(str.contains("Demo"));
	}

	public static void method_get()
	{
		String str = "abcabc";
		
		//����
		sop(str.length());
		
		//����������ȡ�ַ���
		sop(str.charAt(4));//�����ʵ��ַ����в����ڵĽǱ�ʱ�ᷢ��STringIndexOutOfBoundsException
		
		//�����ַ���ȡ����
		sop(str.indexOf('b',2));
		
		//��������һ���ַ�����λ��
		sop(str.lastIndexOf("a"));
	}
	
	public static void main(String[] args) 
	{
		method_7();
//		method_sub();
//		method_split();
//		method_replace();
//		method_trans();
//		method_is();
//		method_get();

	}
	
	
	
	
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
