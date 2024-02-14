package Recursion;

import java.util.Scanner;

public class Print_1_to_N {
    // PrintInc is a method to print number from 1 to N
    public static void PrintInc(int n){
        if(n==0){
            return ;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        PrintInc(num);
    }
}
