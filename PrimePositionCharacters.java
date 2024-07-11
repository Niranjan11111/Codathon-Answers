import java.util.Scanner;

public class PrimePositionCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Calculate the length of the input string
        int length = input.length();

        // Print characters at prime positions
        for (int i = 2; i <= length; i++) {
            if (isPrime(i)) {
                System.out.print(input.charAt(i - 1) + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
