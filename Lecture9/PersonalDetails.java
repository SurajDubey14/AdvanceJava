package Lecture9;
import java.util.*;
public class PersonalDetails {
 float sub1,sub2,sub3,sub4,sub5;
 int age;
 String name;
    public  PersonalDetails(){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter your name :- ");
     name=sc.nextLine();
     System.out.print("Enter age of "+name+":- ");
     age=sc.nextInt();
//     System.out.print("Enter address of "+name+":- ");
//     address=sc.nextLine();
     System.out.print("Enter marks of subject1:- ");
     sub1=sc.nextFloat();
     System.out.print("Enter marks of subject2:- ");
     sub2=sc.nextFloat();
     System.out.print("Enter marks of subject3:- ");
     sub3=sc.nextFloat();
     System.out.print("Enter marks of subject4:- ");
     sub4=sc.nextFloat();
     System.out.print("Enter marks of subject5:- ");
     sub5=sc.nextFloat();
    }

}
