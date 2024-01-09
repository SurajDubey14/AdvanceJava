package AccountProject;

import java.util.Scanner;

public class BankAccount {
/*    Member Variable
AcNumber:- Account Number
AcHolderName :- Account Holder Name */
String AcHolderName , IfscCode , User_Address;
protected long AcNumber,Mob_no;
    BankAccount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------Account Entry Details----------------");
        System.out.println("Enter your account Number : ");
        AcNumber=sc.nextInt();
        System.out.println("Enter your account ifsc code : ");
        IfscCode = sc.next();
        System.out.println("Enter your name : ");
        AcHolderName = sc.next();
        System.out.println("Enter your Address : ");
        User_Address= sc.next();
        System.out.println("Enter your mobile number : ");
        Mob_no=sc.nextInt();
    }
    public void display(){
        System.out.println("Account Holder Name : "+AcHolderName);
        System.out.println(AcHolderName+" AccountNumber : "+AcNumber);
        System.out.println(AcHolderName+" Ifsc Code : "+IfscCode);
        System.out.println(AcHolderName+" Address : "+User_Address);
        System.out.println(AcHolderName+" Mobile number : "+Mob_no);
    }
}
