package stringPrograms;
import java.util.Scanner;

public class NumberRevserse {

	public static void main(String[] args) {
		
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int origin = num, rev= 0, r;
		while (num>0) 
		{
			 r = num%10;
			 rev= 10*rev + r;
			 num = num/10;
			
		}
		System.out.println("Reverse string is: "+rev);
		if(origin==rev)
		{
			System.out.println(origin+" is a Palindrome number");
		}
		else {
			System.out.println(origin+" is not a Palindrome number");
		}
		
	}

}
