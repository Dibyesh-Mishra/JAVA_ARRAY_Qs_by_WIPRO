/*Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleway([1, 2, 3], [4, 5, 6]) + [2, 5]

middleway([7, 7, 7], [3, 8, 0]) [7, 8]

middleway ([5, 2, 9], [1, 4, 5]) → [2, 4]

 */

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] a = new int[3];
        int[] b = new int[3];

        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < 3; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < 3; i++) {
            b[i] = scanner.nextInt();
        }

        int[] result = new int[2];
        result[0] = a[1]; // Middle element from array a
        result[1] = b[1]; // Middle element from array b

        System.out.print("middleway (");
        printArray(a);
        System.out.print(", ");
        printArray(b);
        System.out.print(") -> ");
        printArray(result);

        scanner.close();
    }

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
