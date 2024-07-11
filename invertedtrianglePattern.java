import java.util.Scanner;

public class invertedtrianglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numRows = sc.nextInt();

        for (int i = numRows; i > 0; i--) {
            int count = 2 * i - 1;
            for (int j = 1; j <= count; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
