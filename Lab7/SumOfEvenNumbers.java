package Lab7;

import java.util.ArrayList;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(7);
        numbers.add(12);

        // Calculate the sum of even numbers
        int sumOfEvenNumbers = calculateSumOfEvenNumbers(numbers);

        // Print the sum of even numbers
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }

    // Method to calculate the sum of even numbers
    public static int calculateSumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        // Iterate through the ArrayList
        for (int num : numbers) {
            // Check if the number is even
            if (num % 2 == 0) {
                // Add the even number to the sum
                sum += num;
            }
        }
        return sum;
    }
}
