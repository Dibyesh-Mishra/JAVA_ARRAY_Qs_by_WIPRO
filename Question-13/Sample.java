/*Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line ar argaments.
Example1)
C:\>java Sample 1 2 3
O/P: Please enter 4 integer numbers
Example2)
Two
C:\>java Sample 1 2 3 4
Dimensional Array
O/P:
The given array is :
12
34
The reverse of the array is :
4 3
21
 */

public class Sample{
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Please enter 4 integer numbers in command line arguments");
            return;
        }

        int[][] array = new int[2][2];

        // Populate the 2x2 array from the command line arguments
        int argIndex = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                array[i][j] = Integer.parseInt(args[argIndex]);
                argIndex++;
            }
        }

        // Print the original array
        System.out.println("The given array is:");
        printArray(array);

        // Reverse the array
        int[][] reverseArray = reverse(array);

        // Print the reversed array
        System.out.println("The reverse of the array is:");
        printArray(reverseArray);
    }

    public static void printArray(int[][] array) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] reverse(int[][] array) {
        int[][] reverseArray = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                reverseArray[i][j] = array[1 - i][1 - j];
            }
        }
        return reverseArray;
    }
}
