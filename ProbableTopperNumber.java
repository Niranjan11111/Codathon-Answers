import java.util.Scanner;

public class ProbableTopperNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        sc.close();

        int oddSum = 0;
        int evenSum = 0;

        while (number != 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }
            number /= 10;
        }

        if (oddSum == evenSum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
