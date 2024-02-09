package Lab1;
import java.util.Scanner;
// to check whether the nth bit of the given number is set (1) or not (0).
public class SetBit {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Input number and bit position
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        System.out.print("Enter the bit position (0-indexed): ");
        int n = scanner.nextInt();

        // Check if the nth bit is set or not
        if (((num >> n) & 1) == 1) {
            System.out.println("The " + n + "th bit of " + num + " is set (1)");
        } else {
            System.out.println("The " + n + "th bit of " + num + " is not set (0)");
        }
    }
}
