package b_exception;
/*
�ں����������쳣��
������߰�ȫ�ԣ��õ��ó����д������������ʧ�ܡ�

�Զ��쳣�Ĵ���
1�������쳣ʱ������������Ϊ������쳣����������ÿ��Ը����塣
2���Է����������쳣���Ͷ�Ӧ�м���catch�顣��Ҫ��������catch�顣
	������catch���е��쳣���ּ̳й�ϵ�������쳣catch����������档
	
�����ڽ���catch����ʱ��catchһ��Ҫ������崦��ʽ��
��Ҫ�򵥶���һ��  e.printStackTrace
Ҳ��Ҫ�򵥵ľ���дһ��������
 */
class Demo2
{
	int div(int a,int b)throws ArithmeticException,ArrayIndexOutOfBoundsException//�ڹ�����ͨ��throws�Ĺؼ��������˸ù����п��ܳ������⡣
	{
		int[] arr = new int[a];
		System.out.println(arr[4]);
		return a/b;
	}
}

public class ExceptionDemo2 
{

	public static void main(String[] args) //throws Exception
	{
		Demo2 d = new Demo2();
		try 
		{
			int x = d.div(4,0);
			System.out.println("x="+x);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
			System.out.println("�������");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			System.out.println("�Ǳ�Խ��");
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		System.out.println("over");

	}

}
