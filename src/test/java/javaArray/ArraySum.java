package javaArray;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) 
	{
		System.out.println("enter the size of the array");
		
		Scanner sc = new Scanner(System.in);
		int  size = sc.nextInt();
		float sum = 0;
		
		System.out.println("Array size is:"+size);
		float arr [] = new float[size];
		
		System.out.println("enter element to the array");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextFloat();
		}
	
		System.out.println("Calculating the sum of the element");
		for (int i = 0; i < size; i++) {
			if(i%2== 0)
			{
				sum +=arr[i];
			}
		}
		System.out.println("Sum is "+sum);
	}
}
