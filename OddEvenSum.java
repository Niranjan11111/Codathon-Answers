import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int num = scanner.nextInt();

        // Calculate and print the result
        System.out.println(oddEvenSum(num));

        scanner.close();
    }

    public static int oddEvenSum(int num) {
        int sumOdd = 0;
        int sumEven = 0;

        // Iterate through each digit of the number
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                sumEven += digit;
            } else {
                sumOdd += digit;
            }
            num /= 10;
        }

        // Return the greater sum
        return Math.max(sumOdd, sumEven);
    }
}
