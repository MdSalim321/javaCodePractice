package SeleniumAutomation.SeleniumMaven;

import java.util.Scanner;

public class FibbonacciSeries {

	public static void main(String[] args) {
		int a = 0;
		int b= 1;
		int c = 1;
		System.out.println("Enter count value for the fibbonacci series: ");
		Scanner sc = new Scanner(System.in);
	
		int count = sc.nextInt();
		for (int i = 1; i <=count; i++) {
			System.out.print(a+", ");
			a= b;
			b= c;
			c= a+b;		
		}	
	}
}
