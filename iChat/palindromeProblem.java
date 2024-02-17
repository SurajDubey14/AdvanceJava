package iChat;
import java.util.Scanner;

class palindromeChecker {

    public boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters at left and right positions are not equal, it's not a palindrome
            }
            left++;
            right--;
        }
        return true; // If the loop completes without returning false, it's a palindrome
    }
}

public class palindromeProblem {
    public static void main(String[] args) {
        /*--Creating Object of Scanner to taking input----*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        /*---Creating object of palindromeChecker for checking a string is palindrome or not---*/
        palindromeChecker checker = new palindromeChecker();
        boolean isPalindrome = checker.isPalindrome(inputString);

        if (isPalindrome) {
            System.out.println("The string \"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + inputString + "\" is not a palindrome.");
        }

        scanner.close();
    }
}


