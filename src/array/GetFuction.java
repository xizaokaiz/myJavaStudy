package array;

public class GetFuction {
	public static void main(String[] args) {
	int sum = getSum(7,7);
	System.out.println("sum="+sum);
	int Max = getMax(6,7);
	System.out.println("Max="+Max);
		
	}
	public static int getSum(int x,int y) 
	{
	
		return x+y;
		
	}
	public static boolean compare(int a,int b) 
	{
		/*if(a==b)
			return ture;
		//else
			return false;*/
		
		//return (a==b)?true:false; 三元
		
		return a==b;
		
	}
	public static int getMax(int a,int b) //比大小
	{
		/*if(a>b)
			return a;
		else
			return b;*/
		return (a>b)?a:b;	
	}
}
