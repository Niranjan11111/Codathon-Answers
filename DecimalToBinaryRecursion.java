import java.util.Scanner;

public class DecimalToBinaryRecursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int decimalNumber = in.nextInt();

        String binaryRepresentation = decimalToBinary(decimalNumber);
        System.out.println("Binary representation: " + binaryRepresentation);
    }

    static String decimalToBinary(int num) {
        if (num == 0) {
            return ""; // Base case: decimal 0 corresponds to binary 0
        } else {
            return decimalToBinary(num / 2) + (num % 2); // Recursive step
        }
    }
}
