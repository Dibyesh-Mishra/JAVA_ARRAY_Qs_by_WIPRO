
//Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array.
public class Sample {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 25, 15, 30 }; // Initialize the integer array

        int smallest1 = Integer.MAX_VALUE; // First smallest number (initialize to maximum value)
        int smallest2 = Integer.MAX_VALUE; // Second smallest number (initialize to maximum value)

        int largest1 = Integer.MIN_VALUE; // First largest number (initialize to minimum value)
        int largest2 = Integer.MIN_VALUE; // Second largest number (initialize to minimum value)

        for (int number : numbers) {
            if (number < smallest1) {
                smallest2 = smallest1; // Shift the previous smallest number
                smallest1 = number; // Update the first smallest number
            } else if (number < smallest2) {
                smallest2 = number; // Update the second smallest number
            }

            if (number > largest1) {
                largest2 = largest1; // Shift the previous largest number
                largest1 = number; // Update the first largest number
            } else if (number > largest2) {
                largest2 = number; // Update the second largest number
            }
        }

        System.out.println("Smallest numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest numbers: " + largest1 + ", " + largest2);
    }
}

/* using library Function
import java.util.Arrays;

public class ArrayMinMax2 {
    public static void main(String[] args) {
        int[] numbers = { 10, 5, 25, 15, 30 }; // Initialize the integer array

        Arrays.sort(numbers); // Sort the array in ascending order

        int smallest1 = numbers[0]; // First smallest number
        int smallest2 = numbers[1]; // Second smallest number

        int largest1 = numbers[numbers.length - 1]; // First largest number
        int largest2 = numbers[numbers.length - 2]; // Second largest number

        System.out.println("Smallest numbers: " + smallest1 + ", " + smallest2);
        System.out.println("Largest numbers: " + largest1 + ", " + largest2);
    }
}

 */