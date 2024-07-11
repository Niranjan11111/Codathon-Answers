import java.util.Scanner;

public class codeEncyption {
    // Constant for modulo operation
    private static final int MOD = 1000000007;

    // Method to perform modular exponentiation
    public static long modExp(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the input values
        long S = sc.nextLong();
        long N = sc.nextLong();
        long M = sc.nextLong();
        
        // Calculate S^N % 10
        long firstPart = modExp(S, N, 10);

        // Calculate (firstPart)^M % 1000000007
        long result = modExp(firstPart, M, MOD);

        // Print the encrypted code
        System.out.println(result);

        sc.close();
    }
}
