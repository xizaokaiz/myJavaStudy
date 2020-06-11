package Integer;

/*
�����������Ͷ����װ�ࡣ

byte 	Byte
short 	Short
int		Integer
long	Long
boolean Boolean
float	Float
double	Double
char	Character

�����������Ͷ����װ���������ã�
�������ڻ����������ͺ��ַ�������֮����ת����

������������ת���ַ�����
	
	������������+""
	
	������������.toString(������������ֵ);
	
	�磺Integer.toString(34);//������34����ַ���"34";
	
�ַ���ת�ɻ����������͡�

	xxx a = Xxx.parseXxx(String);
	
	int a = Integer.parseInt("123");//���ַ���"123"ת����int��
	
	double d = Double.parseDouble("12.23");//���ַ���"12.23"ת����double��
	
	boolean b = Boolean.parseBoolean("true");//���ַ���"true"ת����boolean��
	
	Integer i = new Integer("123");//�Ǿ�̬ת��:���ַ���"123"ת��Ϊint��
	int num = i.intValue();
	
ʮ����ת���������ơ�
	toBinaryString();//ʮ����ת������
	toHexString();//ʮ����תʮ������
	toOctalString();//ʮ����ת�˽���

��������ת��ʮ���ơ�
	parseInt(String,radix);//String:Ҫת���Ľ�������radix:��������������

*/

public class IntegerDemo 
{
	public static void main(String[] args) 
	{
		//�������͵����ֵ��
//		sop("int max:"+Integer.MAX_VALUE);
		
		//��һ���ַ���ת������
		int num = Integer.parseInt("123");//���봫�����ָ�ʽ���ַ�����
//		long x = Long.parseLong("123");
//		boolean b = Boolean.parseBoolean("trues");
		
//		sop("num="+(num+3));
//		sop(Integer.toBinaryString(6));//ʮ����ת������
//		sop(Integer.toHexString(60));//ʮ����תʮ������
		
		int x = Integer.parseInt("3c",16);//��ʮ������3cת��Ϊʮ����
		sop("x="+x);
		
		


	}
	
	public static void sop(String str)
	{
		System.out.println(str);
	}
	

}
