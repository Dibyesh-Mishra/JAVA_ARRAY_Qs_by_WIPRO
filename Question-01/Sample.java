//Write a program to initialize an integer array and print the sum and average of the array

public class Sample {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20, 25 }; // Initialize the integer array

        int sum = 0;
        for (int number : numbers) {
            sum += number; // Calculate the sum of array elements
        }

        double average = (double) sum / numbers.length; // Calculate the average

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
