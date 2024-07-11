import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        scanner.close();

        int numDigits = (int) Math.floor(Math.log10(number)) + 1;

        int temp = number;
        int sum = 0;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }

        if (sum == number) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
