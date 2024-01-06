package Lecture7;
import java.util.*;
class Prime{
    int num;
    public  void isPrime(int n){
        int flag=2;
        this.num=n;
        if(n==1 || n==0){
            System.out.println("The number is not prime");
            flag+=1;
        }
        else if(n > 1){
            for(long i=2;i<=n-1;i++){
                if(n%2==0){
                    flag += 1;
                }
            }
            if(flag != 2){
                System.out.println( n+" is not Prime Number");
            }else{
                System.out.println( n+" is Prime Number");
            }
        }
        else{
            System.out.println("Negative number are not prime");
        }
    }

}
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check prime or not");
        int num = sc.nextInt();
        Prime p = new Prime();
        p.isPrime(num);
    }
}
