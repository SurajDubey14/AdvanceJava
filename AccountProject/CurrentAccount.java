package AccountProject;

import java.util.Scanner;

public class CurrentAccount extends BankAccount{
    float balance;
    CurrentAccount(){
        balance=0;
        System.out.println("Your Account is created Successfully!");
    }
    //  Method for Balance Information
    public void BalanceInformation(){
        super.display();
        System.out.println("your account type is Saving Account");
    }
    //  Method for Balance Enquiry
    public void BalanceEnquiry(){
        super.display();
        System.out.println("your account balance is: "+balance);
    }
    // deposit Amount method
    public void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit : ");
        float depositAmount = sc.nextFloat();
        balance+=depositAmount;
        System.out.println("Your amount is deposited successfully!");
        System.out.println("Current Balance :"+balance);
    }
    // Withdraw Amount method
    public void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to withdraw");
        float WithdrawAmount = sc.nextFloat();
        if(WithdrawAmount > balance){
            System.out.println("You have minimum balance");
            System.out.println("Current Balance :"+balance);
        }
        else{
            balance-=WithdrawAmount;
            System.out.println("Successfully! Withdrawal ");
            System.out.println("Current Balance :"+balance);
        }
    }
}
