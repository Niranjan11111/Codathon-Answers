import java.util.Scanner;

public class DiagonalPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Get the length of the input string
        int length = input.length();

        // Loop through each row
        for (int i = 0; i < length; i++) {
            // Loop through each column
            for (int j = 0; j < length; j++) {
                // Print characters at the diagonal positions
                if (j == i) {
                    System.out.print(input.charAt(i));
                } else if (j == length - i - 1) {
                    System.out.print(input.charAt(length - i - 1));
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
