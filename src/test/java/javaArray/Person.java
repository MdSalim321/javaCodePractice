package javaArray;

public class Person {
	
	private String name;
	private int sal;
	
	void setName(String name)
	{
		this.name =name;
	}
	
	String getName()
	{
		return name;
		
	}
	
	void setSalary(int sal)
	{
		this.sal =sal;
	}
	int getSalary()
	{
		return sal;
	}
		
	public static void main(String[] args) 
	{
		Person p = new Person();
		
		p.setName("John");
		p.setSalary(100);
		System.out.println("entered name is: "+p.getName());
		System.out.println("Entered salary is: "+p.getSalary());
		
	}

}
