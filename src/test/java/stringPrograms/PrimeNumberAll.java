package stringPrograms;
import java.util.*;
public class PrimeNumberAll {

	public static void main(String[] args) {
		
		System.out.println("enter the number,upto where you want to print all the prime number: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int count =0;
		
		for(int i = 2; i<n;i++)
		{
			boolean isPrime = true;
			for(int j =2; j<i;j++)
			{
				if(i%j ==0)
				{
					isPrime = false;
					break;
				}
				
			}
			if(isPrime)
			{
			count++;
			System.out.println(i);
			}
		}
		System.out.println("total count is: "+count);
		
	}
}
