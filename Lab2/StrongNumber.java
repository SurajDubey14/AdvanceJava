package Lab2;

import java.util.*;
class SN{
    int temp=0 , r;
    SN(int num){
        int checknum = num;
        while(num != 0){
            r = num % 10;
            temp = temp + fact(r);
            num = num/10;
        }
        if(checknum == temp){
            System.out.println("The number is strong number");
        }else{
            System.out.println("the number is not a strong number");
        }
    }

    public int fact(int num){
        int fact=1;
        for(int i=2;i<=num;i++){
            fact = fact * i;
        }
        return fact;
    }
}
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sno = sc.nextInt();
        SN sn = new SN(Sno);
    }
}
