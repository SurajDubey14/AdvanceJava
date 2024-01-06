// Menu Driven Program => SwitchCase , Do-While.

package Lecture7;

public class IterationConstruct {
    public static void main(String[] args) {
//        int x=5;
//        while(x<=201);   // It will not show any error if we put semicolon at the end of while loop
//        {
//            System.out.println(x + " , ");
//            x=x+4;
//        }
        int num = 5 ;
        for(int i=1;i<=40;i++) //It will not show any error if we put semicolon at the end of while loop
        {
            System.out.print(num + ", ");
            num = num +4;
        }
    }
}
