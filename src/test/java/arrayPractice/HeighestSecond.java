package arrayPractice;

public class HeighestSecond {

	public static void main(String[] args) {

			int [] arr = {10, 90,60, 30, 90, 80, 90};
			
			int first = Integer.MIN_VALUE;
			int second = Integer.MIN_VALUE;
			
			
			for(int n : arr)
			{
				if(n> first)
				{
					second = first;
					first = n;
				}
				else if(n> second & n!= first)
				{
					second =n;
				}
			}
		System.out.println("Second:"+second);
		
		
		
	}

}
