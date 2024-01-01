package Lecture3;

import java.util.*;
class NumericCalculation{
    public static int Addition(int num1,int num2){
        return num1+num2;
    }
    public static int Subtraction(int num1,int num2){
        return num1-num2;
    }
    public static int Multiplication(int num1,int num2){
        return num1*num2;
    }

}
public class NumericalCalculationProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
//        Object Creation
        NumericCalculation nc = new NumericCalculation();

//        Addition
        int sum = new NumericCalculation().Addition(num1 , num2);  // sum with anonymous Object creation method call
        System.out.println("The sum value of "+num1 +"+" +num2 +" =" + sum);
//        Subtraction
        int sub = nc.Subtraction(num1 , num2);
        System.out.println("The Subtraction value of "+num1 +"-" +num2 +" =" + sub);
//        Multiplication
        int mul = nc.Multiplication(num1 , num2);
        System.out.println("The multiplication value of "+num1 +"*" +num2 +" =" + mul);
//        Division
        float div = num1 / num2;
        System.out.println("The division value of "+num1 +"/" +num2 +" quotient is " + div);
//      Modulus
        int mod = num1 % num2;
        System.out.println("The modulus value of remainder is "+num1 +"%" +num2 +" remainder is " + mod);
    }
}
