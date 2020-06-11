package array;

public class ArrayTest7 {

	public static void main(String[] args) {
		toBin(5);

	}
	//十进制转二进制
	public static void toBin(int num)
	{
		trans(num,1,1);
	}
	//十进制转8进制
	public static void toBa(int num)
	{
		trans(num,7,3);
	}
	//十进制转十六进制
	public static void toHex(int num)
	{
		trans(num,15,4);
	}
	
	
	//进制转换优化
	public static void trans(int num,int base,int offset)
	{
		if(num==0)
		{
			System.out.print(0);
			return;
		}
		
		
		char[] chs = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		char[] arr = new char[32];
		int pos = arr.length;
		while(num!=0)
		{
			int temp = num & base; //位数
			arr[--pos] = chs[temp];
			num = num >>> offset; //移位
			
		}
		for(int x=pos;x<arr.length;x++)
		{
			System.out.print(arr[x]);
		}
	}

}
