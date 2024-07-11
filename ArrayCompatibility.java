import java.util.Scanner;

public class ArrayCompatibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Enter the size of the first array: ");
        int size = scanner.nextInt();
        
        // Read the first array
        int[] array1 = new int[size];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size; i++) {
            array1[i] = scanner.nextInt();
        }
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }
        
        // Check compatibility
        boolean compatible = true;
        for (int i = 0; i < size; i++) {
            if (array1[i] < array2[i]) {
                compatible = false;
                break;
            }
        }
        
        // Print result
        if (compatible) {
            System.out.println("The arrays are compatible.");
        } else {
            System.out.println("The arrays are not compatible.");
        }
        
        scanner.close();
    }
}
