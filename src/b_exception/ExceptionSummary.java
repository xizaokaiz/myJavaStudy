package b_exception;

/*
�쳣��
��ʲô���Ƕ��������������������ж���ķ�װ��

�쳣��ϵ��
	Throwable
		|--Error
		|--Exception
			|--RuntimeException
			
�쳣��ϵ���ص㣺�쳣��ϵ�е��������Լ������Ķ��󶼾߱������ԡ�
			    Ҳ����˵���Ա�throw��throws�ؼ�����������
			    ֻ���쳣��ϵ�߱�����ص㡣
��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������    
throw��throws���÷���

throw�����ں����ϣ������׳��쳣����
throws�����ں����ϣ������׳��쳣�࣬�����׳�����ö��Ÿ�����

����������throw�׳��쳣���󣬲�δ����try����������Ҫ�ں��������������ڱ���ʧ�ܡ�
ע�⣬RuntimeException���⡣Ҳ����˵������������ų���RuntimeException�쳣���������Բ���������
��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������  
��������������쳣����������Ҫ���д�����������������throws����try��

�쳣�����֣�
	����ʱ������쳣
		���쳣�ڱ���ʱ�����û�д�����û����Ҳû��try��������ʧ�ܡ�
		���쳣����ʶ����������Ա�������
	����ʱ�쳣������ʱ����⣩
		�ڱ���ʱ������Ҫ����������������顣
		���쳣�ķ��������鲻�������ó���ֹͣ����Ҫ�Դ������������
��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������  		
�쳣��������䣺
try
{
	��Ҫ�����Ĵ��룻
}
catch()
{
	�����쳣�Ĵ��룻
}
finally
{
	һ����ִ�еĴ��룻
}

��������ϸ�ʽ��
1��	try
	{
	}
	catch()
	{
	}
	
2��	try
	{
	}
	finally
	{
	}
	
3��	try
	{
	}
	catch()
	{
	}
	finally
	{
	}
	
ע�⣺
1��finally�ж����ͨ���ǣ��ر���Դ���롣��Ϊ��Դ�����ͷš�
2��finallyֻ��һ���������ִ�У���ִ�е�System.exit(0);(ϵͳ�˳���jvm����)
	finally����ִ�С�
��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������  
�Զ����쳣��
	������̳�Exception����RuntimeException
	1���ø��Զ�����߱������ԡ�
	2���ø���߱������쳣�Ĺ��Է�����
	
	��Ҫ�����Զ����쳣����Ϣʱ������ʹ�ø����Ѿ�����õĹ��ܡ�
	�쳣��Ϣ���ݸ�����Ĺ��캯����
	class MyException extends Exception
	{
		MyException(Srring message)
		{
			super(message);
		}
	}
	
�Զ����쳣������java���������˼�룬�������г��ֵ�����������з�װ��
��������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������������  	
�쳣�ĺô���
	1����������з�װ��
	2�����������̴�������⴦����������룬�������Ķ���
	
�쳣�Ĵ���ԭ��
	1��������ʽ�����֣�try ���� throws
	2�����õ��׳��쳣�Ĺ���ʱ���׳��������ʹ���������
		һ��try��Ӧ���catch
	3�����catch�������catch�ŵ������档
	4��catch�ڣ���Ҫ��������ԵĴ�����ʽ����Ҫ�򵥵Ķ���printStackTrace�������䡣
		Ҳ��Ҫ��д��
		�����񵽵��쳣�������ܴ�������ʱ�����Լ�����catch���׳���
		try
		{
			throw new AException();
		}
		catch(AException a)
		{
			throw e;
		}
		
		������쳣�������ˣ����������ڸù��ܳ��ֵ��쳣��
		���Խ��쳣ת�������׳��͸ù�����ص��쳣��
		
		�����쳣���Դ���������Ҫ���쳣�����ĺͱ�������ص������ṩ��ȥ��
		�õ�����֪������������Ҳ���Խ������쳣������ת���µ��쳣��
		try
		{
			throw new AException();
		}
		catch(AException e)
		{
			//��AException������
			throw new BException();
		}

�쳣��ע�����
	���Ӹ��า��ʱ��
	1�������׳����쳣�����Ǹ����쳣����������Ӽ���
	2�����������߽ӿ�û���쳣�׳�ʱ�����า�ǳ����쳣��ֻ��try�����ס�

����
ExceptionTest.java ��ʦ�õ����Ͽ�
ExceptionTest2.java ͼ�����
 */

public class ExceptionSummary 
{

	public static void main(String[] args) 
	{
		

	}

}