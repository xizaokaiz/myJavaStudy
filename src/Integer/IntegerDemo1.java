package Integer;



public class IntegerDemo1 
{

	public static void main(String[] args)
	{
//		method();
//		Integer x = new Integer(3);
		Integer x = 3;//�Զ�װ�䡣new Integer(3);
		x = x/*	x.intValue() */ + 2;//x+2:x �����Զ����䣬�����int���ͣ���2���мӷ����㡣
				//�ٽ��ͽ���װ�丳��x��
		
		Integer m = 128;
		Integer n = 128;
		sop("m==n:"+(m==n));
		
		Integer a = 127;
		Integer b = 127;
		sop("a==b:"+(a==b));//���Ϊtrue����Ϊa��bָ����ͬһ��Integer����
		//��Ϊ����ֵ��byte��Χ��ʱ(-128 ~ +127)�����������ԣ��������ֵ�Ѿ������Ѿ����ڣ��򲻻��ٿ����µĿռ䡣
		
	}
	
	
	public static void method() 
	{
		Integer x = new Integer("123");
		
		Integer y = new Integer(123);
		
		sop("x==y:"+(x==y));//�Ƚϵ�ֵַ
		sop("x.equals(y):"+x.equals(y));//Integer��д��equals����Ϊ�Ƚ���ֵ

	}
	public static void sop(String str)
	{
		System.out.println(str);
	}

}
