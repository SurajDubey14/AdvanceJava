package Day5;

import java.util.InputMismatchException;


public class ExceptionHandling {
    public static void agevalidate(int age) throws RuntimeException{
        if(age <18){
            throw new InputMismatchException("BKL Autaat mai");
        }
        System.out.println("Age is good you are ready to ride");
    }

    public static void main(String[] args) {
        try{
            int age=15;
            agevalidate(age);
        } catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Namaskar");
        }
    }
}
