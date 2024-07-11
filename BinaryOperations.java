import java.util.Scanner;

public class BinaryOperations {
    public static int OperationsBinaryString(String str) {
        if (str == null) {
            return -1;
        }

        int result = 0;
        boolean isAnd = false; // Flag to track AND operation

        for (char ch : str.toCharArray()) {
            if (ch == 'A') {
                isAnd = true;
            } else if (ch == 'B') {
                isAnd = false;
            } else if (ch == 'C') {
                // XOR operation
                result ^= 1;
            } else {
                // Binary digit
                int digit = ch - '0';
                if (isAnd) {
                    // AND operation
                    result &= digit;
                } else {
                    // OR operation
                    result |= digit;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the binary string: ");
        String input = scanner.nextLine();
        scanner.close();

        int output = OperationsBinaryString(input);
        System.out.println("Output: " + output);
    }
}
