package Lecture8;

import java.util.Scanner;

class CalAmount{
    float p;
    float r;
    float t;

    public CalAmount(float principal , float rate , float time){
        this.p=principal;
        this.r=rate;
        this.t=time;
    }
    // CalSI is a method to calculate Simple Interest
    public  float CalSI(){
        return (p*r*t)/100;
    }
    // CalA is a method to calculate Simple Amount
    public float CalA(){
        return CalSI()+p;
    }
    public void display(){
        System.out.println("The Simple Interest is : "+CalSI());
        System.out.println("The Amount is : "+CalA());
    }

}

public class CalculateAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Principal : ");
        float principal=sc.nextFloat();
        System.out.print("Enter the Rate : ");
        float rate=sc.nextFloat();
        System.out.print("Enter the time(in year) : ");
        float time=sc.nextFloat();

        CalAmount ca = new CalAmount(principal ,rate ,time);
        ca.display();
    }
}
