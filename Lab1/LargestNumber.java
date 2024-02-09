package Lab1;

import java.util.Scanner;
// Finding The Largest number
class Maximum{
    public static void checkMax(int num1,int num2){
//        Check the equality of numbers first. if it fails then we find out the largest number.
        if (num1 == num2) {
            System.out.print("num1 is equal to num2");
        }else {
            int temp = num1 > num2 ? num1 : num2;
//        Check the greater number and print it
            System.out.println("The largest number is " + temp);
        }
    }
}
public class LargestNumber {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
//        num1 is first number of integer datatype.
        int num1=sc.nextInt();
        System.out.print("Enter the Second number : ");
//        num2 is Second number of integer datatype.
        int num2=sc.nextInt();
/*        To check maximum between two number. A class has created of Maximum
        having a method(checkMax) to find the maximum between two number */
        Maximum max= new Maximum();
        max.checkMax(num1,num2);
    }
}
