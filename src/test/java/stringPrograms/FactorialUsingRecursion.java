package stringPrograms;
import java.util.Scanner;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		System.out.println("enter the number, whoes factorial you want yo print");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int fact =factorial(n);
		{
			System.out.println("Factorial is num "+n+" is: "+fact);
		}
		
	}
	public static int factorial(int n)
	{
		if(n ==0 || n== 1) {
			return 1;
		}
		return n*factorial(n-1);
	}

}
