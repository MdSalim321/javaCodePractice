package SeleniumAutomation.SeleniumMaven;

import java.util.Scanner;

public class SwapingNumbersThirdVariable {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the 2nd number: ");
		int b = sc.nextInt();
		
		int t = a;
		a=b;
		b=t;
		
		System.out.println("After swaping a= "+a +"  and b= "+b);
		
	}
}
