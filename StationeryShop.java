import java.util.Scanner;

public class StationeryShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int M = sc.nextInt();
        int P = sc.nextInt(); 
        int E = sc.nextInt(); 

        if (N < P || M < E) {
            System.out.println("0"); 
        } else {
            int waysToChoosePencils = combination(N, P);
            int waysToChooseErasers = combination(M, E);
            int totalWays = waysToChoosePencils * waysToChooseErasers;
            System.out.println(totalWays);
        }
    }


    public static int combination(int n, int k) {
        if (k > n) return 0;
        if (k == 0 || k == n) return 1;
        k = Math.min(k, n - k); 
        int c = 1;
        for (int i = 0; i < k; i++) {
            c = c * (n - i) / (i + 1);
        }
        return c;
    }
}
