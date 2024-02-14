package Recursion;

import java.util.Scanner;

public class FactorialProblem {
    public static int fact(int num){
        if(num==0){
            return 1;
        }
        int f=1;
        f = num * fact(num-1);
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        System.out.println(fact(n));
    }
}
