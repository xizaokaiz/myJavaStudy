package b_exception;

/*
finally����飺����һ��ִ�еĴ��롣
ͨ�����ڹر���Դ��
 */

class FuShuException2 extends Exception
{
	FuShuException2(String msg)
	{
		super(msg);
	}
}
class Demo5
{
	int div(int a,int b)throws FuShuException2
	{
		if(b<0)
			throw new FuShuException2("����Ϊ���� ");
		return a/b;
	}
}

public class ExceptionDemo5 
{

	public static void main(String[] args) 
	{
		Demo5 d = new Demo5();
		try
		{
			int x = d.div(4,-1);
			System.out.println("x="+x);
		}
		catch(FuShuException2 e)
		{
			System.out.println(e.toString());
			return;
			//System.exit(0);//ϵͳ���˳���jvm������
		}
		finally
		{
			System.out.println("finally");//finally�д�ŵ���һ����ִ�еĴ��롣
		}
		
		System.out.println("over");

	}

}
/*
class NoException extends Exception
{
	
}
public void method()throws NoException
{
	�������ݿ�;
	
	���ݲ�����//throw new SQLException();
	
	�ر����ݿ⣻//�ö������������ݲ����Ƿ�ɹ���һ��Ҫ�ر���Դ��
	
	try
	{
		�������ݿ⣻
		
		���ݲ�����//throw new SQLException();
	}
	catch(SQLException e)
	{
		������ݿ�����쳣����;
		throw new NoException();
	}
	finally
	{
		�ر����ݿ⣻
	}
}
*/









