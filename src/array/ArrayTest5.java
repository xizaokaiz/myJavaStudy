package array;

public class ArrayTest5 {

	public static void main(String[] args) 
	{
		toBin(7);
		toHex(60);

	}
	//ʮ����-->ʮ������
	public static void toHex(int num)
	{
		StringBuffer sb = new StringBuffer();
		for(int x = 0;x<8;x++)
		{
			
			int temp = num & 15;
			if(temp>9)
				//System.out.println((char)(temp-10+'A'));
				sb.append((char)(temp-10+'A'));     //ASCIIֵ
			else
				//System.out.println(temp);
				sb.append(temp);
			num = num >>> 4;  //������λ����������
		}
		System.out.println(sb.reverse());
	}
	
	
	//ʮ����-->������
	public static void toBin(int num)
	{
		StringBuffer sb = new StringBuffer();//��װ���ݵ�����
		while(num>0)
		{
			//System.out.println(num%2);
			sb.append(num%2);
			num = num / 2;
		}
		System.out.println(sb.reverse());//reverse:��ת
	}

}
