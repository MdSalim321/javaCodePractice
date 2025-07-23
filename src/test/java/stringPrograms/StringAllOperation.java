package stringPrograms;
import java.util.Scanner;

public class StringAllOperation {

	public static void main(String[] args) {
		
		System.out.println("Enter a sentence: ");
		Scanner sc = new Scanner(System.in);
		
		String st = sc.nextLine();
		int count = 0;
		
		System.out.println("Enter a charecter, to be searche: ");
		char c =sc.next().charAt(0);
		
		for(int i = 0; i< st.length(); i++)
		{
			if(c == st.charAt(i))
			{
				count ++;
				System.out.println(c+"present in the index number: "+i);
			}
			
		}
		System.out.println(c+" is present in the given sentences"+count+ " no. of times");

	}

}
