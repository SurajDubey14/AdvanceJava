package AccountProject;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("---------------Welcome----------------------");
        System.out.println("Enter Account Type:- \n 1.SavingAccount\n 2.CurrentAccount");
        int ch=sc.nextInt();
        int AccOp =ch;
        switch (ch){
            case 1: SavingAccount SA = new SavingAccount();
                System.out.println("Enter operation:- \n 1.BalanceEnquiry \n 2.DepositAmount \n 3.WithdrawAmount");
                // op:- operation in account
                int op=sc.nextInt();
                switch (op){
                    case 1: SA.BalanceEnquiry();
                        break;
                    case 2: SA.deposit();
                        break;
                    case 3: SA.withdraw();
                    default:
                        System.out.println("you enter wrong operation value");
                }
            break;
            case 2: CurrentAccount CA = new CurrentAccount();
                System.out.println("Enter operation:- \n 1.BalanceEnquiry \n 2.DepositAmount \n 3.WithdrawAmount");
                // o:- operation in account
                int o=sc.nextInt();
                switch (o){
                    case 1: CA.BalanceEnquiry();
                        break;
                    case 2: CA.deposit();
                        break;
                    case 3: CA.withdraw();
                    default:
                        System.out.println("you enter wrong operation value");
                }
                break;
            default:
                System.out.println("you enter wrong choice");
        }
    }
}
