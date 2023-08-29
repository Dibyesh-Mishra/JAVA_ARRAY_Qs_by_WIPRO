/*Write a program to find the biggest number in a 3*3 array. The program is supposed to receive 9 integer numbers as command line arguments.

Example1:
C:\>java Sample 1 2 3
O/P: Please enter 9 integer numbers

Example2:
C:\>java Sample 1 23 45 55 121 222 56 77 89
O/P:
The given array is :
1 23 45
55 121 222
56 77 89
The biggest number in the given array is 222
 */

public class Sample {
    public static void main(String[] args) {
        if (args.length != 9) {
            System.out.println("Please enter 9 integer numbers in commandLine Argument");
            return;
        }

        int[][] array = new int[3][3];

        // Populate the 3x3 array from the command line arguments
        int argIndex = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = Integer.parseInt(args[argIndex]);
                argIndex++;
            }
        }

        // Find the biggest number in the array
        int maxNumber = array[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (array[i][j] > maxNumber) {
                    maxNumber = array[i][j];
                }
            }
        }

        // Print the array
        System.out.println("The given array is:");
        printArray(array);

        // Print the biggest number
        System.out.println("The biggest number in the given array is " + maxNumber);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
