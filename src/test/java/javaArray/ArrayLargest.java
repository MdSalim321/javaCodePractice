package javaArray;

import java.util.Scanner;

import org.testng.annotations.Test;

public class ArrayLargest {
	@Test
	void arrayMax()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of the array");	
		int n = sc.nextInt();		
	
		float [] arr = {1,23,4,5};
		float max= arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]>max) 
			{
				max= arr[i];	
			}	
		}
		System.out.println("Largest number is: "+max);
	}

}
