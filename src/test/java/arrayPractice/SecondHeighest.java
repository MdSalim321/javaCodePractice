package arrayPractice;

import java.util.Arrays;

public class SecondHeighest {

	public static void main(String[] args) {
		int arr [] = {12,90,65, 90,68, 80};
		
		int max = arr[0];
		int size = arr.length;
		System.out.println(size);
		
		
		Arrays.sort(arr);
		for(int n: arr)
		{
			System.out.println(n);
		}
		
		System.out.println();
		
		for(int i =1; i< size; i++)
		{
			if(arr[i]> max)
			{
				max = arr[i];
			}
		}
		System.out.println("Heighest is: "+max);
		
		
		
		int[] ary = new int[6];
		
		
		for(int i = 0; i< 6; i++)
		{
			if(arr[i] != max)
			{
				ary[i] = arr[i];
			}
		}
		
		for(int i = 0; i < 6; i++)
		{
			System.out.println(ary[i]);
		}
		
		
		


	}

}
