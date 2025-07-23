package SeleniumAutomation.SeleniumMaven;

public class SumTwoFinder {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, -1, 0, 1, 1};
        
        for (int i = 0; i < arr.length; i++) {
        	
        	for (int j = i+1; j < arr.length; j++) {
        		
				if (arr[i] + arr[j] == 2) {
					System.out.println(arr[i]+ " + "+ arr[j]+" = 2");
					
				}
			}	
		}
    }
}

