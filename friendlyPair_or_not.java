import java.util.Scanner;

public class friendlyPair_or_not  {
    public static int sumOfDivisors(int num) {
        int sum = 1; 
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == (num / i)) {
                    sum += i;
                } else {
                    sum += i + (num / i);
                }
            }
        }
        return sum + num; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int sumDiv1 = sumOfDivisors(num1);
        int sumDiv2 = sumOfDivisors(num2);

        double abundanceIndex1 = (double) sumDiv1 / num1;
        double abundanceIndex2 = (double) sumDiv2 / num2;

        if (abundanceIndex1 == abundanceIndex2) {
            System.out.println("Friendly Pair");
        } else {
            System.out.println("Not Friendly Pair");
        }

        sc.close();
    }
}
