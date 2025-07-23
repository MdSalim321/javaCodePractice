package javaArray;

import org.testng.annotations.Test;

public class ArraySearch {
	
	@Test
	void arraySearchElement()
	{
	float arr [] = {12, 13, 14, 15, 12, 16, 12};
	float num = 12;
	boolean bn =false;
	int count= 0; 
	int totalSum= 0;
	
	System.out.println("Array element are:");
	
	for (double ft : arr) {
		
		System.out.print(ft+ " " );
	}
	for (int i = 0; i < arr.length; i++) {
		if (arr[i] == num) {
		count++;
		}
	}
	
	//System.out.println(bn ? "\n Number matched" : "\n Number not Matched");
	totalSum = (int) (num * count);
	System.out.println(totalSum);

	}
	

}
