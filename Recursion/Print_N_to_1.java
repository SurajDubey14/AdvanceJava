//Performing the print from N to 10

package Recursion;
import java.util.*;

public class Print_N_to_1 {
    // PrintDec Method is for print number in decreasing number
    static void PrintDec(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        PrintDec(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        PrintDec(num);
    }
}
