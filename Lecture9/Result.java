package Lecture9;

public class Result extends PersonalDetails{
public void CalculatePercentage(){
    float percentage;
    float total;
    total= super.sub1+super.sub2+super.sub3+super.sub4+super.sub5;
    System.out.println("The total marks of 5 :- "+ total);
    percentage=(total/500)*100;
    System.out.println("The Percentage of"+super.name+" is "+percentage+"%");
}

}
