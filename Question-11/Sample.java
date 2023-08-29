/*Given an array of type int, print true if every element is 1 or 4.

only14([1, 4, 1, 4]) → true

only14([1, 4, 2, 4]) → false

only14([1, 1]) → true  by

 */


import java.util.Scanner;

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

        boolean onlyOneFour = true;

        for (int number : numbers) {
            if (number != 1 && number != 4) {
                onlyOneFour = false;
                break;
            }
        }

        System.out.println("only14(");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]);
            if (i != size - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(") -> " + onlyOneFour);

        scanner.close();
    }
}
