/*Write a program to remove the duplicate elements in an array and print the
same.
Example)
I/P: (12,34,12,45,67,89}
O/P: {12,34,45,67,89}
 */

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        int[] numbers = { 12, 34, 12, 45, 67, 89 }; // Input array with duplicate elements

        int size = numbers.length;

        // Sort the array to bring duplicate elements together
        Arrays.sort(numbers);

        int[] result = new int[size]; // Array to store the unique elements
        int j = 0; // Index for the unique elements array

        // Iterate over the sorted array and skip duplicates
        for (int i = 0; i < size - 1; i++) {
            if (numbers[i] != numbers[i + 1]) {
                result[j] = numbers[i];
                j++;
            }
        }

        result[j] = numbers[size - 1]; // Copy the last element

        // Print the array without duplicates
        System.out.print("Output: {");
        for (int i = 0; i <= j; i++) {
            System.out.print(result[i]);
            if (i != j) {
                System.out.print(",");
            }
        }
        System.out.println("}");
    }
}
