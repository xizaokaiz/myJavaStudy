package f_Generic;

//���Ͷ����ڽӿ��ϡ�
interface Inter<T>
{
	void show(T t);
}

//��ȷ�������͡�
/*
class InterImpl implements Inter<String>
{
	public void show(String s)
	{
		System.out.println("show:"+s);
	}
}
*/

//����ȷ�������͡�
class InterImpl<T> implements Inter<T>
{
	public void show(T t)
	{
		System.out.println("show:"+t);
	}
}


public class GenericDemo5 
{

	public static void main(String[] args) 
	{
		InterImpl<Integer> i = new InterImpl<Integer>();
		i.show(4);
		
		/*
		InterImpl i = new InterImpl();
		i.show("haha");
		*/

	}

}
