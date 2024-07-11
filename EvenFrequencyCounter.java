import java.util.Scanner;

public class EvenFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        System.out.println(sumOfEvenFrequencies(input));
        
        scanner.close();
    }

    public static int sumOfEvenFrequencies(String str) {
        int sum = 0;
        int n = str.length();
        int i = 0;
        
        while (i < n) {
            char currentChar = str.charAt(i);
            int count = 0;
            
            while (i < n && str.charAt(i) == currentChar) {
                count++;
                i++;
            }
            
            if (count % 2 == 0) {
                sum += count;
            }
        }
        
        return sum;
    }
}
