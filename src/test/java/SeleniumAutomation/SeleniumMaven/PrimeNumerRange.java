package SeleniumAutomation.SeleniumMaven;

import java.util.Scanner;

public class PrimeNumerRange {

	public static void main(String[] args) {

		System.out.println("Enter a number, within which you want all prime Number list:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count=0;
		
		for (int i = 2; i <=n; i++) {
			
			boolean isPrime = true;
			
			for (int j = 2; j <= Math.sqrt(i); j++) {
				if(i%j ==0)
				{isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				System.out.print(i+" ,");
			}
		}
			
		System.out.println("\nTotal prime number in the list is: "+count);
	}

}

