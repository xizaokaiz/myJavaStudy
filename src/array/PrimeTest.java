package array;

public class PrimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int N = 50;
		final int NL = 10;
		int count = 0;
		int number = 2;
		System.out.println("The first 50 prime numbers are \n");
		while (count<N) {
			boolean isPrime = true;									
			for(int divisor = 2;divisor<= number/2;divisor++) {//d=2,d<=2/2,d+1=3
				if(number%divisor==0)//2%3=0
					isPrime = false;
					
			}
		
		
		if(isPrime) {
			count++;
			if(count%NL==0) {
				System.out.println(number);
			}
			else 
				System.out.print(number+" ");
			
		}
		
		number++;
		}

	}

}
