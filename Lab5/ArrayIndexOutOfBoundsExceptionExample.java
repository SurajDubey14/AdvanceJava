package Lab5;

class AccessingArray {
    private int[] arr;

    // Constructor to initialize the array
    public AccessingArray(int size) {
        arr = new int[size];
        // Populate the array with values
        for (int i = 0; i < size; i++) {
            arr[i] = i + 1;
        }
    }

    // Method to access array elements
    public void accessArrayElements(int index) {
        try {
            // Accessing the array element at the given index
            System.out.println("Element at index " + index + ": " + arr[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catching the ArrayIndexOutOfBoundsException
            System.out.println("Array index out of bounds!");
            e.printStackTrace();
        }
    }
}

public class ArrayIndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        // Creating an instance of ArrayAccessor with an array size of 5
        AccessingArray arrayAccessor = new AccessingArray(5);

        // Accessing elements at different indices
        arrayAccessor.accessArrayElements(2); // Accessing a valid index
        arrayAccessor.accessArrayElements(5); // Accessing an invalid index
    }
}

