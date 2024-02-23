package Lab10;

import java.util.HashMap;

public class PhoneDirectory {
    public static void main(String[] args) {
        HashMap<String , String> phoneDirectory = new HashMap<>();
        // Adding data in the hash map
        phoneDirectory.put("Rahul" , "+91-9345XXXXXX");
        phoneDirectory.put("Rohit" , "+91-9654XXXXXX");
        phoneDirectory.put("Suraj" , "+91-9784XXXXXX");
        phoneDirectory.put("Bhupendra" , "+91-9185XXXXXX");
        phoneDirectory.put("Ruzul" , "+91-9385XXXXXX");
        // Printing out the LinkedHashMap of books
        System.out.println(/*---------------*/);
        System.out.println("Data in phone directory : "+phoneDirectory);
    }
}
