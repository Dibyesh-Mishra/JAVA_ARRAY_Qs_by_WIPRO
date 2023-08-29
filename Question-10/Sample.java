/*Print an array that contains the exact same numbers as the given array, but rearranged so that all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and print the given array, or make a new array.

evenOdd ([1, 0, 1, 0, 0, 1, 1]) -> [theta, theta, theta, 1, 1, 1, 1, 1] evenOdd ([3, 3, 2]) -> [2, 3, 3]

evenOdd ([2, 2, 2]) -> [2, 2, 2]

 */
import java.util.*;

import java.util.*;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int[] result = new int[size];

        int evenIndex = 0; // Index for even numbers
        int oddIndex = size - 1; // Index for odd numbers

        for (int number : numbers) {
            if (number % 2 == 0) {
                result[evenIndex] = number; // Copy even number to the beginning of the result array
                evenIndex++;
            } else {
                result[oddIndex] = number; // Copy odd number to the end of the result array
                oddIndex--;
            }
        }

        System.out.print("evenOdd (");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(") -> [");

        for (int i = 0; i < size; i++) {
            System.out.print(result[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        scanner.close();
    }
}

