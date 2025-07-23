package SeleniumAutomation.SeleniumMaven;

import java.util.Scanner;

public class PalindromeNumbers {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int reverse= 0;
		int orignal = n;
		int digit;
		while (n> 0) {
			digit = n%10;
			reverse = 10*reverse + digit;
			n=n/10;	
		}
		System.out.println("Reverse number is: "+reverse);
		if (orignal == reverse)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
	}
}
