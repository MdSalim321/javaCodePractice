package javaArray;

public class ParameterisedConstructor {
	
	String name;
	int rollNo;
	int marks;
	
	public ParameterisedConstructor(String name, int rollNo) 
	{
		System.out.println("name is: "+name+" rollNo is: "+rollNo);
	}
	
	public ParameterisedConstructor(String name, int rollNo, int marks) {
		System.out.println("name is: "+name+" rollNo is: "+rollNo+" Marks is: "+marks);

	}
	
	public static void main(String[] args) {

		ParameterisedConstructor obj = new ParameterisedConstructor("John", 10);
		ParameterisedConstructor objt = new ParameterisedConstructor("John", 10, 90);


	}
}
