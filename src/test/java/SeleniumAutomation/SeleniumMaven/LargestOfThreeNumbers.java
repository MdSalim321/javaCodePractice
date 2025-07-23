package SeleniumAutomation.SeleniumMaven;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int a=10, b= 20, c= 30, largest;
		if (a> b && a>c) {
			largest = a;
			
		}else if (b>c && b>a) {
			largest =b;
		}
		else {
			largest = c;
		}
		System.out.println("Largest of three numbers is "+largest);
	}
}
