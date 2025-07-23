package arrayPractice;

import java.util.Arrays;

public class ArrayPractice {

	public static void main(String[] args) {
		
		int [] arr = {10, 90, 60, 37, 66};
		
		int max = arr[0];
		int min = arr[0];
		
		for(int n: arr)
		{
			System.out.println(n);
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		for(int num :arr)
		{
			if(num> max)
				max= num;
			if(num< min)
				min=num;
			
		}
		
		System.out.println("Max: "+max+" min: "+min);
	
		
	}

}
