import java.util.Scanner;

public class GCDUsingNoRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int firstNum = sc.nextInt();
        System.out.print("Enter the second number: ");
        int secondNum = sc.nextInt();

        int gcdResult = gcd(firstNum, secondNum);
        System.out.println("GCD of the given two numbers is: " + gcdResult);
    }

    public static int gcd(int num1, int num2) {
        if (num2 != 0) {
            return gcd(num2, num1 % num2);
        } else {
            return num1;
        }
    }
}
