package Lab7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseListOfStrings {
    public static void main(String[] args) {
        // Sample list of strings
        List<String> myList = new ArrayList<>();
        myList.add("Suraj");
        myList.add("Ruzul");
        myList.add("Shivam");
        myList.add("Aman");

        // Print original list
        System.out.println("Original list: " + myList);

        // Reverse the list using collections.reverse
        Collections.reverse(myList);

        // Print reversed list
        System.out.println("Reversed list: " + myList);
    }
}
