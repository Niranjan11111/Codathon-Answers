import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int size = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after reading int

        // Create an array to store the strings
        String[] names = new String[size];

        // Read the strings into the array
        for (int i = 0; i < size; i++) {
            names[i] = scanner.nextLine();
        }

        // Sort the array in alphabetical order
        Arrays.sort(names);

        // Print the sorted array
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
