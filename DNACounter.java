import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DNACounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string s
        String s = scanner.nextLine();
        
        // Print the result
        System.out.println(countRepeatedSequences(s));
        
        scanner.close();
    }

    public static int countRepeatedSequences(String s) {
        if (s == null || s.length() < 10) {
            return 0;
        }

        Map<String, Integer> sequenceCount = new HashMap<>();
        int count = 0;

        // Traverse the string with a sliding window of length 10
        for (int i = 0; i <= s.length() - 10; i++) {
            String sequence = s.substring(i, i + 10);
            sequenceCount.put(sequence, sequenceCount.getOrDefault(sequence, 0) + 1);
        }

        // Count sequences that occur more than once
        for (int occurrences : sequenceCount.values()) {
            if (occurrences > 1) {
                count++;
            }
        }

        return count;
    }
}
