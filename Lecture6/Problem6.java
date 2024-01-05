package Lecture6;
import java.util.*;
class NumericalCalculator{
    public static void choice(char choice,int num1 , int num2){
        switch (choice){
            case '+' :
                System.out.println("Addition of "+num1+ " and "+num2+" is "+(num1+num2));
                break;
            case '-' :
                System.out.println("Subtraction of "+num1+ " and "+num2+" is "+(num1-num2));
                break;
            case '*' :
                System.out.println("Multiplication of "+num1+ " and "+num2+" is "+(num1-num2));
                break;
            case '/' :
                System.out.println("Division of "+num1+ " and "+num2+" is "+(num1*num2));
                break;
            case '%' :
                System.out.println("Modulus of "+num1+ " and "+num2+" is "+(num1%num2));
                break;
            default:
                System.out.println("Default Symbol");
        }
    }

}

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number :- ");
        int num1=sc.nextInt();
        System.out.println("Enter second number :- ");
        int num2=sc.nextInt();
        System.out.println("Enter a choice of operation you want to perform ");
        char ch = sc.next().charAt(0);
        NumericalCalculator nc = new NumericalCalculator();
        nc.choice(ch,num1,num2);
    }
}
