package Lecture13;

public class ExceptionHandling {
    public static void main(String[] args) {
        try{
            int a=5;
            int b=0;
            System.out.println(a/b);
       }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Ram Ram Bhai Saryane");
        }
    }
}
