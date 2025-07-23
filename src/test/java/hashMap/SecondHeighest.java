package hashMap;
public class SecondHeighest {
    public static void main(String[] args) {
    	
        int[] arr = {10, 50, 20, 50, 30, 50};

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        System.out.println(first+", "+second);
        
        for (int num : arr)
        {
            if (num > first) {
                second = first;
                first = num;
            }
            else if (num > second && num != first) {
                second = num;
            }
        }
        
        if (second == Integer.MIN_VALUE) {
            System.out.println("No second highest found.");
        } else {
            System.out.println("Second highest: " + second);
        }
    }
}
