package f_Generic;

//泛型定义在接口上。
interface Inter<T>
{
	void show(T t);
}

//明确参数类型。
/*
class InterImpl implements Inter<String>
{
	public void show(String s)
	{
		System.out.println("show:"+s);
	}
}
*/

//不明确参数类型。
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
