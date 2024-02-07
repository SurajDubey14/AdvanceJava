package Lab2;

import java.util.Scanner;
class checkLeapYear{
    public void checkingLeapYear(int year){
        // Condition to check year is leap or not.
        if(((year%4==0)&&(year%100 !=0)) || (year%400 == 0)){
            System.out.println("The "+year+" is leap year.");
        }else{
            System.out.print("The "+year+" is not leap year.");
        }
    }
}

public class leapYear {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the year : ");
        int year= sc.nextInt();
        checkLeapYear ly = new checkLeapYear();
        ly.checkingLeapYear(year);
    }
}
