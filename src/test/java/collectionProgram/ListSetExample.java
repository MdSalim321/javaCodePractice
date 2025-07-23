package collectionProgram;

import java.util.*;

public class ListSetExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        
        list.add("Java");
        list.add("Python");
        list.add("Java"); // Allowed

        Set<String> set = new HashSet<>();
        
        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicate ignored

        System.out.println("List: " + list);  // [Java, Python, Java]
        System.out.println("Set: " + set);    // [Java, Python] or [Python, Java]
    }
}

