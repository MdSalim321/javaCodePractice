package arrayPractice;

public class MoveAllZeroes {

	public static void main(String[] args) {

		int [] arr = {1,8,0,1,7,4,0,5,0,9};
		int size = arr.length;
		int count =0;
		
		System.out.println("Array size is: "+size);
		
		for(int i =0; i<size; i++)
		{
			if(arr[i]!= 0)
			{
				arr[count++]= arr[i];
			
			}
		}

		while(size>count)
		{
			arr[count++]=0;
		}
		for(int i=0; i<size; i++)
		{
		System.out.print(arr[i]+", ");
		}
	
	}

}
