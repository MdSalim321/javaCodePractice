package SeleniumAutomation.SeleniumMaven;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number: ");
		int b = sc.nextInt();
		
		System.out.println("a = "+a+ "b "+b);
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("Afrer swaping: a= "+a +" & b = "+b);
		
	}
}
