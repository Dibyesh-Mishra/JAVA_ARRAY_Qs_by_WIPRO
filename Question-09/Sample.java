/*Print a version of the given array where all the 10's have been removed. The remaining elements should shift left towards the start of the array as needed, and the empty spaces at the end of the array should be 0. So (1, 10, 10, 2) yields (1, 2, 0, 0). You may modify and display the given array or make a new array.

without Ten ([1, 10, 10, 2]) [1, 2, 0, 0] withoutTen ([10, 2, 10]) [2, 0, 0] withoutTen([1, 99, 10]) [1, 99, 0]

 */


public class Sample{
    public static void main(String[] args) {
        int[] numbers = { 1, 10, 10, 2 }; // Input array

        int[] result = new int[numbers.length]; // Result array

        int index = 0; // Index for the result array

        for (int number : numbers) {
            if (number != 10) {
                result[index] = number; // Copy the element to the result array if it's not 10
                index++;
            }
        }

        while (index < numbers.length) {
            result[index] = 0; // Fill the remaining elements of the result array with 0
            index++;
        }

        System.out.print("withoutTen (");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print(") [");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i != result.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");
    }
}
