package Integer;

/*
基本数据类型对象包装类。

byte 	Byte
short 	Short
int		Integer
long	Long
boolean Boolean
float	Float
double	Double
char	Character

基本数据类型对象包装类的最常见作用，
就是用于基本数据类型和字符串类型之间做转换。

基本数据类型转成字符串。
	
	基本数据类型+""
	
	基本数据类型.toString(基本数据类型值);
	
	如：Integer.toString(34);//将整数34变成字符串"34";
	
字符串转成基本数据类型。

	xxx a = Xxx.parseXxx(String);
	
	int a = Integer.parseInt("123");//将字符串"123"转换成int型
	
	double d = Double.parseDouble("12.23");//将字符串"12.23"转换成double型
	
	boolean b = Boolean.parseBoolean("true");//将字符串"true"转换成boolean型
	
	Integer i = new Integer("123");//非静态转换:将字符串"123"转换为int型
	int num = i.intValue();
	
十进制转成其他进制。
	toBinaryString();//十进制转二进制
	toHexString();//十进制转十六进制
	toOctalString();//十进制转八进制

其他进制转成十进制。
	parseInt(String,radix);//String:要转换的进制数，radix:进制所属进制数

*/

public class IntegerDemo 
{
	public static void main(String[] args) 
	{
		//整数类型的最大值。
//		sop("int max:"+Integer.MAX_VALUE);
		
		//将一个字符串转成整数
		int num = Integer.parseInt("123");//必须传入数字格式的字符串。
//		long x = Long.parseLong("123");
//		boolean b = Boolean.parseBoolean("trues");
		
//		sop("num="+(num+3));
//		sop(Integer.toBinaryString(6));//十进制转二进制
//		sop(Integer.toHexString(60));//十进制转十六进制
		
		int x = Integer.parseInt("3c",16);//将十六进制3c转换为十进制
		sop("x="+x);
		
		


	}
	
	public static void sop(String str)
	{
		System.out.println(str);
	}
	

}
