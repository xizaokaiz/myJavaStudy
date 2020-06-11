package a_object.static_;
/*
 * 静态代码块
 * 格式：
 * static
 * {
 * 	静态代码块中的执行语句
 * }
 * 特点：随着类的加载而执行，只执行一次,优先于主函数，
 * 用于给类进行初始化的。
 */

class StaticCode
{
	int num = 4;
	static
	{
		System.out.println("a");
	}
	public static void show()
	{
		System.out.println("show run");
	}
	StaticCode(int x)
	{
		System.out.println("b"+num);
	}
	
}
class StaticCodeDemo {

	static
	{
		//System.out.println("b");
	}
	public static void main(String[] args) 
	{
		//new StaticCode();
		//new StaticCode();
		//System.out.println("over");
		//StaticCode.show();
		//StaticCode s = null;
		new StaticCode(4);
	}
	static
	{
		//System.out.println("c");
	}

}
