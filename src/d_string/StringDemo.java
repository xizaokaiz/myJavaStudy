package d_string;

public class StringDemo 
{

	public static void main(String[] args) 
	{
		String s1 = "abc";//s1��һ�������ͱ�����"abc"��һ������
						//�ַ�������ص�:һ������ʼ���Ͳ����Ա��ı䡣
		
		String s2 = new String("abc");
		/*
		s1��s2��ʲô����
		s1���ڴ�����һ������
		s2���ڴ�������������
		*/
		
		
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));//String�ิд��Object����equals������
										//�÷��������ж��ַ����Ƿ���ͬ��
	}

}
