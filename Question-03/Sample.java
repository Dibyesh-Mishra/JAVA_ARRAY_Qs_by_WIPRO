/*Write a program to initialize an integer array with values and check if a given number is present in the array or not.

If the number is not found, it will print -1 else it will print the index value of the given number in the array.
Example 1) If the Array elements are (1,4,34,56,7) and the search element is 90, then the output expected is -1.
Example 2) If the Array elements are (1,4,34,56, 7} and the search element is 56, then the output expected is 3.

 */

import java.util.Scanner;

public class Sample
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the number to search for: ");
        int searchElement = scanner.nextInt();

        int index = -1; // Initialize the index to -1

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchElement) {
                index = i; // Update the index if the number is found
                break; // Exit the loop since the number is found
            }
        }

        System.out.println("Search element: " + searchElement);

        if (index == -1) {
            System.out.println("Number not found: -1");
        } else {
            System.out.println("Index of the number: " + index);
        }

        scanner.close();
    }
}

