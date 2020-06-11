package array;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] arr = {3,25,6,23,12};
		//System.out.println("length:"+arr.length);
		//int sum=0;
		/*for(int x=0;x<arr.length;x++) 
		{
		
		sum = sum+ arr[x];
		System.out.println("arr["+x+"]="+arr[x]+";"+"\n");
		}
		System.out.print(sum);*/
		//printArray(arr);
		
	}
	public static void printArray(int[] arr)
	{
		for(int x=0;x<arr.length;x++)
		{	
			if(x!=arr.length-1)
				System.out.print(arr[x]+",");
			else
				System.out.print(arr[x]);
		}		
	}

}
