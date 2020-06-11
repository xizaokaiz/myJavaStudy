package b_exception;

/*
finally代码块：定义一定执行的代码。
通常用于关闭资源。
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
			throw new FuShuException2("除数为负数 ");
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
			//System.exit(0);//系统，退出，jvm结束。
		}
		finally
		{
			System.out.println("finally");//finally中存放的是一定会执行的代码。
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
	连接数据库;
	
	数据操作；//throw new SQLException();
	
	关闭数据库；//该动作，无论数据操作是否成功，一定要关闭资源。
	
	try
	{
		连接数据库；
		
		数据操作；//throw new SQLException();
	}
	catch(SQLException e)
	{
		会对数据库进行异常处理;
		throw new NoException();
	}
	finally
	{
		关闭数据库；
	}
}
*/









