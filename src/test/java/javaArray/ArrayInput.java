package javaArray;

import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		
		System.out.println("Enter size of the array: ");		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter value to the array: ");
		
		int [] arr = new int[size];
		
		for (int i = 0; i < size; i++) 
		{	
			arr[i] = sc.nextInt();
		}
	
		System.out.println("You have entered: ");
		
	
		for (int num : arr) {
			System.out.print(num+ ", ");
		}
		
	}

}
