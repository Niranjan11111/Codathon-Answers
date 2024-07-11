import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String input = scanner.nextLine();
        scanner.close();

        // Call the compressString method and print the result
        System.out.println(compressString(input));
    }

    public static String compressString(String input) {
        // If the input string is empty, return an empty string
        if (input.length() == 0) {
            return "";
        }

        // Use a StringBuilder to build the compressed string
        StringBuilder compressed = new StringBuilder();

        // Initialize the count for the first character
        int count = 1;

        // Loop through the string, starting from the second character
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                // If the current character is the same as the previous one, increment the count
                count++;
            } else {
                // If the current character is different, append the previous character and its count if greater than 1
                compressed.append(input.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                // Reset the count for the new character
                count = 1;
            }
        }

        // Append the last character and its count if greater than 1
        compressed.append(input.charAt(input.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }

        // Return the compressed string
        return compressed.toString();
    }
}
