package b_exception;

/*
��Ϊ��Ŀ�л�������е����⡣
����Щ���Ⲣδ��java����������װ����
���Զ�����Щ���е�������԰���java�Ķ������װ��˼�롣
�����е����⣬�����Զ�����쳣��װ��

�Զ����쳣��

�����ڱ������У����ڳ�����-1��Ҳ��Ϊ�Ǵ�������޷���������ġ�
��ô����Ҫ�������������Զ����������

���ں����ڲ�������throw�׳��쳣������ô�ͱ���Ҫ����Ӧ�Ĵ�������
Ҫô���ڲ�try catch����
Ҫô�ں����������õ����ߴ���

һ������ڣ������ڳ����쳣����������Ҫ������

���ִ�ӡ�Ľ����ֻ���쳣�����ƣ�ȴû���쳣����Ϣ��
��Ϊ�Զ�����쳣��δ����������Ϣ��

��ζ����쳣��Ϣ�أ�
��Ϊ�������Ѿ����쳣��Ϣ�Ĳ���������ˡ�
��������ֻҪ�ڹ���ʱ�����쳣��Ϣ���ݸ�����ͨ��super��䡣
��ô�Ϳ���ֱ��ͨ��getMessage������ȡ�Զ�����쳣��

�Զ����쳣��
�������Զ�����̳�Exception��

�̳�Exceptionԭ��
�쳣��ϵ��һ���ص㣺��Ϊ�쳣����쳣���󶼱��׳���
���Ƕ��߱������ԡ������������Throwable�����ϵ�ж����ص㡣

ֻ�������ϵ�е���Ͷ���ſ��Ա�throws��throw������

throws��throw������
throwsʹ���ں����ϡ�
throwʹ���ں����ڡ�

throws��������쳣�ࡣ���Ը�������ö��Ÿ�����
throw��������쳣����
 */

class FuShuException extends Exception //getMessage();
{
	private int value;//�쳣��ֵ
	
	FuShuException()
	{
		super();
	}
	FuShuException(String msg,int value)
	{
		super(msg);
		this.value = value;
	}
	public int getValue()
	{
		return value;
	}
	
}
class Demo3
{
	int div(int a,int b)throws Exception
	{
		if(b<0)
			throw new FuShuException("�����˳����Ǹ�������� / by fushu",b);//�ֶ�ͨ��throw�ؼ����׳�һ���Զ����쳣����
		return a/b;
	}
}

public class ExceptionDemo3 
{

	public static void main(String[] args) 
	{
		Demo3 d = new Demo3();
		try
		{
			int x = d.div(4,-9);
			System.out.println("x="+x);
		}
		catch(FuShuException e)
		{
			System.out.println(e.toString());
			//System.out.println("����Ϊ����");
			System.out.println("����ĸ����ǣ�"+e.getValue());
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		System.out.println("over");

	}

}
