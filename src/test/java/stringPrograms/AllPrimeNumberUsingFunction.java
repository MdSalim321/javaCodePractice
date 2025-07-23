package stringPrograms;
import java.util.Scanner;

public class AllPrimeNumberUsingFunction {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int count = 0;
		
		for(int i = 2; i<= n; i++)
		{
			if(isPrime(i))
			{
				System.out.print(i+", ");
				count ++;
			}
		}
		System.out.println("\nTotal prime number is: "+count);
	}
	
	private static boolean isPrime(int num)
	{ 
		if(num<= 1)
			return false;
		
		  for (int j = 2; j <= num/2; j++) 
		  {
	            if (num % j == 0) 
	            {
	                return false;
	            }
	        }
		return true;
	}

}
