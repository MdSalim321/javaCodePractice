package SeleniumAutomation.SeleniumMaven;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		System.out.println("Enter a number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		if(n%2 ==0)
			System.out.println(n+" is a Even number");
		else
			System.out.println(n+" is a Odd number");
	
	}

}
