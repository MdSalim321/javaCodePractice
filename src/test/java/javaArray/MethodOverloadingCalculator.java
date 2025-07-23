package javaArray;

public class MethodOverloadingCalculator {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public double add(double a, double b)
	{
		return a+b;
		
	}
	public int add(int a, int b, int c)
	{
		
		return a+b+c;
		
	}

	public static void main(String[] args) {

		MethodOverloadingCalculator cal = new MethodOverloadingCalculator();
		int sum =cal.add(10, 20);
		System.out.println("Sum is: "+sum);
		
		double dsum = cal.add(10.5, 20.5);
		System.out.println("Sum is: "+dsum);
		
		System.out.println("Sum is: "+cal.add(10, 20, 30));
			
	}

}
