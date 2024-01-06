package Lecture7;
import java.util.*;
class fact{
    public static void FindFact(long num){
        long fac = 1;
        if(num==1 || num==0){
            System.out.println("The factorial of "+num+" is 1");
        }
        else if(num < 0){
            System.out.println("Factorial is not possible ");
        }
        else{
            for(long i=num;i>=2;i--){
                fac = fac * i;
            }
            System.out.println("The Factorial of "+ num +" is "+ fac);
        }

    }

}

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long num = sc.nextInt();
        fact factorial = new fact();
        factorial.FindFact(num);
    }
}
