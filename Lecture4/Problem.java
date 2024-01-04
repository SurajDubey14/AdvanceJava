package Lecture4;
import Lecture3.*;
class Solution{
    int num1,num2,num3;
    public void sum(){
        System.out.println("The addition of three number is = "+(num1+num2+num3));
    }

    public Solution(){
        System.out.println("Object is created");
        num1=5;
        num2=7;
        num3=3;
    }
    public Solution(int x, int y){
        this();
        num2 = x;
        num3 = y;
    }
    public Solution(int m){
        this(); // this constructor should only be used in first line inside the constructor
        //this(45 , 95) it will show an error because it is called in second line.
    }

}

public class Problem {
    public static void main(String[] args) {
        Solution s = new Solution();
        s.sum();
    }
}
