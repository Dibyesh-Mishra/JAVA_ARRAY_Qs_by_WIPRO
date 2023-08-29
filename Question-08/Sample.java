/*Write a program to print the sum of the elements of an array following the given below condition.
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum.

Eg1) Array Elements 10,3,6,1,2,7,9

O/P: 22

[i.e 10+3+9]

Eg2) Array Elements 7,1,2,3,6

O/P:19

Eg3) Array Elements 1,6,4,7,9

O/P:10
 */

public class Sample {
    public static void main(String[] args) {
        int[] numbers = { 10, 3, 6, 1, 2, 7, 9 }; // Input array

        int sum = 0; // Variable to store the sum

        boolean ignoreRange = false; // Flag to indicate if the range should be ignored

        for (int number : numbers) {
            if (number == 6) {
                ignoreRange = true; // Set the flag to true if 6 is encountered
            } else if (number == 7) {
                ignoreRange = false; // Set the flag to false if 7 is encountered
            } else if (!ignoreRange) {
                sum += number; // Add the number to the sum if the range should not be ignored
            }
        }

        System.out.println("Sum: " + sum);
    }
}
