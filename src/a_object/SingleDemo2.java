package a_object;
/*
������ȳ�ʼ������
��Ϊ������ʽ��

Single��һ���ڴ棬���Ѿ��������˶���
class Single
{
	private static final Single s = new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}
*/

//�����Ƿ����������ǣ��ų�ʼ����Ҳ���������<��ʱ����>����Ϊ������ʽ��
//Single����ڴ棬����û�д��ڣ�ֻ�е�����getInstance����ʱ���Ž�������
class Single2
{
	private static Single2 s = null;
	private Single2() {}
	public static synchronized Single2 getInstance() //synchronized��ͬ��
	{
		if(s==null)
		{
			synchronized(Single.class)//��
			{
				if(s==null)
					s = new Single2();
			}
		}
		return s;
	}
}
//��¼ԭ�򣺶��嵥��������ʹ�ö���ʽ��
public class SingleDemo2 
{
	
	
	public static void main(String[] args) 
	{
		

	}

}
