package stringPrograms;
import java.util.Scanner; 


public class AllPrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("Enter a number, in which u want to display all prime number");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Entered number is: "+num);
	
		for(int i = 2; i <= num; i++)
		{
			boolean isPrime = true;
			for(int j =2; j<i; j++)
			{
				if(i%j == 0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(i+", ");
			}
		}
	
	}

}
