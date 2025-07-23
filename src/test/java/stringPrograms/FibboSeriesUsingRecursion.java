package stringPrograms;

import java.util.Scanner;

public class FibboSeriesUsingRecursion {

	public static void main(String[] args) {
		System.out.println("enter the size of the fibbonacci series: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("fibbo series is: ");
		
		for(int i=0; i<n; i++)
		{
			System.out.println(fibbo(i)+" ");
		}
	
	}
	public static int fibbo(int m)
	{
		if (m<=1) 
		{
			return m;	
		}
		return fibbo(m-1)+ fibbo(m-2);		
	}
}
