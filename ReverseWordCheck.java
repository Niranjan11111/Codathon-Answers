import java.util.Scanner;

public class ReverseWordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the two input strings
        String word1 = scanner.nextLine();
        String word2 = scanner.nextLine();
        
        // Check if word2 is the reverse of word1
        if (isReverse(word1, word2)) {
            System.out.println("It is same");
        } else {
            System.out.println("It is not same");
        }
        
        scanner.close();
    }

    public static boolean isReverse(String word1, String word2) {
        // Check if the lengths are different
        if (word1.length() != word2.length()) {
            return false;
        }

        int n = word1.length();

        // Compare characters from start to end in word1 and from end to start in word2
        for (int i = 0; i < n; i++) {
            if (word1.charAt(i) != word2.charAt(n - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
