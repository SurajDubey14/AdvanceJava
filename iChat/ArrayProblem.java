package iChat;

import java.util.Scanner;

class arrayMax {
    /*-----Method to find max element in array---*/
    public int findMax(int array[]) {
        int max = array[0]; // Assume the first element as the maximum initially
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}

public class ArrayProblem {
    public static void main(String[] args) {
        /*---Creating scanner object for taking input-----*/
        Scanner sc = new Scanner(System.in);
        /*----Taking size of array from user----*/
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        /*---Taking element from the user---*/
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        /*-------creating object of arrayMax to find max element in array----------*/
        arrayMax arraySum = new arrayMax();
        int maxElement = arraySum.findMax(array);
        /*----Displaying max element in array------*/
        System.out.println("The Max elements in the array is: " + maxElement);

        sc.close();
    }
}
