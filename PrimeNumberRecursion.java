import java.util.Scanner;

public class PrimeNumberRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        if (isPrime(num, 2)){
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    static boolean isPrime(int number, int i){
        if (i != 1) {
            if (number % i != 0){
                return isPrime(number, i - 1);
            }
            return false;
        }
        return true;
    }
}
