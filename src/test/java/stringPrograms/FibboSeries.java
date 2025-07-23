package stringPrograms;
import java.util.Scanner;

public class FibboSeries {

	public static void main(String[] args) {
		
		System.out.println("enter the size of the fibbonacci series: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int first = 0, second = 1, sum;
		
		for(int i =0; i<n; i++)
		{
			System.out.println(first);
			sum = first + second;
			first = second;
			second = sum;
		
		}
	}
}
