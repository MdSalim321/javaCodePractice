package SeleniumAutomation.SeleniumMaven;

import java.util.Scanner;

public class AmstrongNumbers {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int digit = 0, original, sum=0;
		original = n;
		
		while (n> 0) {
			digit =n%10;
			sum = sum+ (digit * digit *digit);
			n=n/10;
		}
	
		System.out.println("Sum = "+sum);
		if (original == sum) {
			System.out.println(original+" is a Amstrong Number");
			
		} else {
			System.out.println(original+" is not a Amstrong Number");
		}
	}
}

