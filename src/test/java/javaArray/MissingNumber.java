package javaArray;

public class MissingNumber {

	public static void main(String[] args) {
		int total = 7;
		
		int num [] = new int [] {1,2,3,4,5,7};
		
		int exSum = (total*(total+1)/2);
		int acSum = 0;
		System.out.println(exSum);
		
		for (int i : num) {
			acSum +=i;
		}
		System.out.println(acSum);
		System.out.println("missing number is: "+(exSum-acSum));

	}

}
