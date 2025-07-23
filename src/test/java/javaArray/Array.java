package javaArray;
import java.util.Scanner;

import org.testng.annotations.Test;

public class Array {
	
	@Test
	void arrayPrint()
	{
		System.out.println("Enter the size of the array");
		
		Scanner sc = new Scanner(System.in);
		int  size = sc.nextInt();
		int [] arr = new int [size];
		int sum = 0;
		
		System.out.println("enter element to the array");
		
		for (int i = 0; i < arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
	
		System.out.println("The array output element");
		
		for (int n : arr) 
		{
			System.out.println(n);
		}
		
		System.out.println("The sum of the element is: ");
		
		for (int m : arr) 
		{
			sum +=m;
		}
		System.out.println("The sum "+sum);	
		
}
}
