package arrayPractice;
import java.util.Scanner; 
public class ArraySum {

	public static void main(String[] args) {
		System.out.println("Enter size of the array: ");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		float [] arr = new float[size];
		double sum = 0, avg, sumOdd=0, sumEven=0;
		
		
		// input element are 
		System.out.println("Enter element to the array: ");
		for(int i= 0; i< size; i++)
		{
			arr[i] = sc.nextFloat();
		}
		
		// outPut Element are 
		System.out.println("The element are: ");
		for(int i=0; i<size; i++)
		{
			System.out.println(arr[i]+", ");
		}

		
		// Sum of the array 
		for (float f: arr)
		{
			sum+=f;
		}
		System.out.println("Sum is: "+sum);
		
		// Average 
		avg =sum/size;
		System.out.println("average is: "+avg);	
		
		// Odd sum 
		for(int i=0; i< size; i++)
		{
			if(arr[i]%2 == 0)
			{
				sumEven = sumEven +arr[i];
			}
			else {
				sumOdd =sumOdd +arr[i];
			}
		
	}
		System.out.println("Even sum is: "+sumEven+" Odd  sum is:"+sumOdd);
	}
}
