package collectionProgram;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class ArrayListSort {

	public static void main(String[] args) {
		
		// ArrayList Reverse
		ArrayList<String> list = new ArrayList<> (List.of("A", "B", "C"));
		System.out.println(list);
		
		Collections.reverse(list);
		System.out.println(list);
		
		// ArrayList Sort 
		ArrayList<Integer> num = new ArrayList<>(List.of(30,10,20,31));
		System.out.println(num);
		
		Collections.sort(num);
		System.out.println(num);
		
		
		// Convert List to array 
		String arr [] = list.toArray(new String[0]);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
