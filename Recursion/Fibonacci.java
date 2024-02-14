package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        int f= fibo(n-1)+fibo(n-2);
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(fibo(num));
    }
}
