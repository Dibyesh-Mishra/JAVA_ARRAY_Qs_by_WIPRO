//Write a program to initialize an integer array and find the maximum and minimum value of the array.
public class Sample {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25 }; // Initialize the integer array

        int max = numbers[0]; // Assume the first element as maximum
        int min = numbers[0]; // Assume the first element as minimum

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update maximum if a larger element is found
            }

            if (numbers[i] < min) {
                min = numbers[i]; // Update minimum if a smaller element is found
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
