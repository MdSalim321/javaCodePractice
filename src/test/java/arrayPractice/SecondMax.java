package arrayPractice;

import java.util.Arrays;

public class SecondMax {

	public static void main(String[] args) {
		
		int [] arr = {20, 90, 45, 90, 80, 70, 90, 80};
		
		Arrays.sort(arr);
		
		int size = arr.length;
		System.out.println("Size of the array is: "+size);
		
		for(int num: arr)
		{
			System.out.print(num+", ");
		}
		
		for(int i = size -2; i >= 0; i--)
		{
			if(arr[i] != arr[size-1])
			{
				System.out.println("\nthe 2nd element is: "+arr[i]);
				break;
			}
		}
		
	
	}

}
