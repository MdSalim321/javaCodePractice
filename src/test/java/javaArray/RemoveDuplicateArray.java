package javaArray;
import java.util.HashSet;

public class RemoveDuplicateArray {
	
	public static void main(String[] args) 
	{
			int [] arr = {1,2,3,1,2,3};
		
			for (int a : arr) {
				System.out.println(a);			
			}
			HashSet<Integer> set = new HashSet<Integer>();
			
			for (int x : arr) {
				set.add(x);
			}	
		System.out.println("array after removing the duplicate: "+set);
		}	
	}

