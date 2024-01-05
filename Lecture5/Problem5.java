package Lecture5;
import java.util.*;
// Selection Construct :- if(ex-Unit Conversion(km-m)) , if-else(ex:- Voting)
//  Nested if-else ,ladder if-else, Switch

class TimeConversion{
    public static void TimeConverted(int sec){
        int hour=0, min=0;
        if(sec>=3600){
            hour=sec/3600;
            min=(sec%3600)/60;
            sec=(sec%3600)%60;
            System.out.println(hour+"hour "+min+"minute "+sec+"second");
        }
        if(sec>=60 && sec<3600){
            min=sec/60;
            sec=sec%60;
            System.out.println(hour+"hour "+min+"minute "+sec+"second");
        }
        if(sec<60){
            System.out.println(hour+"hour "+min+"minute "+sec+"second");
        }
    }

}

public class Problem5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // User Input
        int sec=sc.nextInt();
        if(sec>=0) {
            new TimeConversion().TimeConverted(sec);
        }else{
            System.out.println("Second should not be negative");
        }
    }
}

