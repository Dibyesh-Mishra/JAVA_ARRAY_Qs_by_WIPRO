/*Initialize an integer array with ascii values and print the corresponding character values in a single row.

 */
public class Sample
{
    public static void main(String[] args) {
        int[] asciiValues = { 65, 66, 67, 97, 98, 99 }; // Initialize the integer array with ASCII values

        for (int ascii : asciiValues) {
            char character = (char) ascii; // Convert the ASCII value to character
            System.out.print(character + " "); // Print the character value
        }
    }
}

