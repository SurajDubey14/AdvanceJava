package AccountProject;

import java.util.Scanner;

public class SavingAccount extends BankAccount{
    float balance;
    SavingAccount(){
        balance=0;
        System.out.println("Your Account is created Successfully!");
    }

//  Method for enquiry the account balance
    public void BalanceInformation(){
        super.display();
        System.out.println("your account type is Saving Account");
    }
    //  Method for Balance Enquiry
    public void BalanceEnquiry(){
        System.out.println("your account balance is: "+balance);
    }
    // Deposit Amount method
    public void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit : ");
        float depositAmount = sc.nextFloat();
        balance+=depositAmount;
        System.out.println("Your amount is deposited successfully!");
        System.out.println("Current Balance :"+balance);
    }
    // Amount Withdraw Method
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
