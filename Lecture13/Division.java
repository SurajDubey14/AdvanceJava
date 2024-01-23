package Lecture13;

import java.util.Scanner;

class Divide{
    int n1,n2;
    Divide(int num1, int num2){
        n1=num1;
        n2=num2;
        System.out.println("The division of "+n1+" and "+n2+" is = "+ n1/n2);
    }
}

public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2=sc.nextInt();
        Divide d=new Divide(num1,num2);
    }
}
