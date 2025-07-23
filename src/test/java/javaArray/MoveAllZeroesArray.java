package javaArray;

public class MoveAllZeroesArray {

	public static void main(String[] args) {
		
		int arr [] = {1,2,0,3,0,4,5,0,6};
		int count =0;
		int n = arr.length;
	
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
			{
				arr[count++] =arr[i];
			}
		}
		while( n> count)
		{
			arr[count++] =0;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+", ");
		}
	}
}
