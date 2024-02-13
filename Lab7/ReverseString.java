package Lab7;

public class ReverseString {
    // Creating a method StringReverse for reversing a String
    public static  void StringReverse(String str){
        String revstr="";
        for(int i=str.length()-1;i>=0;i--){
            revstr+=str.charAt(i);
        }
        System.out.println(revstr);
    }
    public static void main(String[] args) {
        String s="abcdef";
        StringReverse(s);
    }
}
