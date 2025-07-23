package stringPrograms;
import java.util.Scanner;

public class FactorialNumber {
	
	public static int  factorial(int n) {
		
		if(n == 0 || n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
			
	}

	public static void main(String[] args) {
		
		
		System.out.println("enter a number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int result = factorial(num);
		{
			System.out.println("The factotrial of number "+num+" is "+result);
		}
		 
	}

}
