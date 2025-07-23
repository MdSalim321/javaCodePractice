package arrayPractice;

public class ArrayMax {

	public static void main(String[] args) {

//		float [] arr = new float[] {10.5f, 20.5f, 35.8f};
//		int [] array = new int[] {10, 20, 30, 40};
		
		int arr[] = {23,24,45,65};
		int max = arr[0];
		
		for(int i=0; i<arr.length-1; i++)
		{
			
			if(arr[i+1]> max)
			{
				max =arr[i+1];
			}
		}
		System.out.println("Max number is: "+max);
		
		
	}

}
