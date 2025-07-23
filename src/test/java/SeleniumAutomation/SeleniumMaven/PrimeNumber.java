package SeleniumAutomation.SeleniumMaven;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
			
		System.out.println("Enter  a number ");	
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		if (n==0 || n ==1) {
			System.out.println(n+" is not a prime number");
		}
		else if (n==2) {
			System.out.println(n+" is a prime number");	
		}
		int flag = 0;

		for (int i = 2; i < n/2; i++) 
		{ 
			if (n %i ==0) {
				flag ++;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(n+ " is a prime number");
		}
		else {
			System.out.println(n+ " is not a prime number");
		}
			
		
	}

}
