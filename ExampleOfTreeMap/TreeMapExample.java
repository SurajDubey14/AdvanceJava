package ExampleOfTreeMap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer , Integer> TM = new TreeMap<Integer, Integer>();
        // Adding Element in tree map
//        TM.put(3, "Ram");
//        TM.put(1, "Shyam");
//        TM.put(2, "Suraj");
//        TM.put(6, "Rudra");
//        TM.put(4, "Kanha");
//        TM.put(5, "RAhul");
//        TM.put(8, "Suraj");
//        TM.put(7, "Rudra");
//        TM.put(10, "Kanha");
//        TM.put(9, "RAhul");
        TM.put(3, 8);
        TM.put( 5 , 7);
        TM.put(1 , 5);
        TM.put(2,9);

        //Displaying data of TreeMap
        System.out.println("TreeMap Elements are : "+TM);
        System.out.println("--------------------------------------------");

        // Methods implementation
        System.out.println("-------------First Key--------------------");
        Integer FK = TM.firstKey();
        System.out.println("First Key : "+FK);
        System.out.println("------------------Last Key---------------");
        Integer LastK = TM.lastKey();
        System.out.println("Last Key : "+LastK);
        System.out.println("----------------Ceiling Key---------------");
        Integer CK = TM.ceilingKey(1);
        System.out.println("Ceiling Key : "+CK);
        System.out.println("--------------------Lower Key-------------");
        Integer LowerK = TM.lowerKey(11);
        System.out.println("lower Key : "+LowerK);
        System.out.println("----------------Higher Key------------------");
        Integer HigherK = TM.higherKey(10);
        System.out.println("Higher Key : "+HigherK);
    }
}
