package Lab6;

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        // Declare an array with 5 elements
        int[] numbers = {1, 2, 3, 4, 5};
        try {
            // Access elements beyond the array's bounds
            for (int i = 0; i <= numbers.length; i++) {
                System.out.println(numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch the ArrayIndexOutOfBoundsException
            System.out.println("Array index out of bounds!");
            e.printStackTrace();
        }
    }
}
