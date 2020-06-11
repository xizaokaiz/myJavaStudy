package array;

public class ArrayTest6 {

	public static void main(String[] args) 
	{
		//toHex(57);
		toBin(6);
		
	}
	/*
	 * 0 1 2 3 4 5 6 7 8 9 A  B  C  D  E  F  ==ʮ�������е�Ԫ��
	 * 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15
	 * ����� �����е�Ԫ����ʱ�洢������������Ӧ��ϵ
	 * ÿһ��&15���ֵ��Ϊ����ȥ�齨���õı��Ϳ����Ҷ�Ӧ��Ԫ��
	 * ������-10+��a���򵥵ö�
	 * �������ô�����أ� ����ͨ�����ݵ���ʽ������
	 * */
	public static void toHex(int num)
	{
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		//����һ����ʱ����
		char[] arr = new char[8];
		//ָ��
		int pos = arr.length;
		while(num!=0)
		{
			int temp = num & 15;
			arr[--pos] = chs[temp];
			num = num >>> 4;
			
		}
		System.out.println("pos="+pos);
		for(int x=pos;x<arr.length;x++)//�������
		{
			System.out.print(arr[x]+",");
		}
	}
	
	public static void toBin(int num)
	{
		//��������Ƶı�
		char[] chs = {'0','1'};
		//����һ����ʱ�洢����
		char[] arr = new char[32];
		//����һ�����������ָ��
		int pos = arr.length;
		while(num!=0)
		{
			int temp = num & 1;
			arr[--pos] = chs[temp];
			num = num >>> 1;
		}
		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}
	
	
}
