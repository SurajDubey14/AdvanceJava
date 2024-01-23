package Lecture13;

import java.util.Scanner;

class circle{
    float r;
    final float pi=3.14f;
    circle(float radius){
        r = radius;
    }

    public void perimeter(){
        System.out.println("--------Perimeter--------");
        System.out.println("The perimeter of circle is : "+ 2*pi*r+ " cm");
    }
    public void area(){
        System.out.println("--------Area--------");
        System.out.println("The Area of circle is : "+ pi*r*r +" sq cm");

    }
}
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        float radius=sc.nextFloat();
        circle cir = new circle(radius);
        cir.perimeter();
        cir.area();
    }
}
