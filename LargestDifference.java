import java.util.Scanner;

public class LargestDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Getting array elements from the user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Finding the largest difference
        int largestDiff = Integer.MIN_VALUE;
        int element1 = 0, element2 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                int diff = Math.abs(array[i] - array[j]);
                if (diff > largestDiff) {
                    largestDiff = diff;
                    element1 = array[i];
                    element2 = array[j];
                }
            }
        }

        // Printing the result
        System.out.println("The largest difference is: " + largestDiff);
        System.out.println("Between elements: " + element1 + " and " + element2);
    }
}
