import java.util.Scanner;

public class BusTransport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Number of groups
        int m = scanner.nextInt(); // Maximum capacity of a bus
        int[] groupSizes = new int[n]; // Array to store group sizes

        // Read group sizes
        for (int i = 0; i < n; i++) {
            groupSizes[i] = scanner.nextInt();
        }

        // Initialize variables
        int busesNeeded = 0;
        int currentCapacity = 0;

        // Process each group
        for (int i = 0; i < n; i++) {
            // If the current group can fit in the current bus, add them
            if (currentCapacity + groupSizes[i] <= m) {
                currentCapacity += groupSizes[i];
            } else {
                // Otherwise, start a new bus
                busesNeeded++;
                currentCapacity = groupSizes[i];
            }
        }

        // Account for the last bus
        if (currentCapacity > 0) {
            busesNeeded++;
        }

        System.out.println(busesNeeded);
    }
}
