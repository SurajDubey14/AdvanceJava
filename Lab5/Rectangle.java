package Lab5;

import java.io.IOException;
import java.util.Scanner;

public class Rectangle {
    static void CalArea(int length , int breadth){
        System.out.println("----------Area----------");
        System.out.println("Area of rectangle is "+length*breadth);
    }
    static void CalPerimeter(int length , int breadth) throws IOException{
        System.out.println("---------Perimeter-----------");
        System.out.println("Perimeter of rectangle is "+(2*(length+breadth)));
    }
    public static void main(String[] args) throws IOException{
        try{
            // Creating Scanner Object For Taking Inputs
            Scanner sc = new Scanner(System.in);
            System.out.print("Length of rectangle : ");
            int l=sc.nextInt(); // l is length
            if(l <= 0) {
                throw new IOException("The length should not be equal or less then 0");
            }
            System.out.print("Breadth of rectangle : ");
            int b= sc.nextInt(); // b is breadth
            if(b <= 0) {
                throw new IOException("The breadth should not be equal or less then 0");
            }
            CalArea(l,b);
            CalPerimeter(l,b);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
