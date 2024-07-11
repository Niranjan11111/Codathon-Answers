import java.util.Scanner;

public class arrayInsertion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Read the elements of the array
        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Read the position and the new element to be inserted
        System.out.print("Enter the position to insert the new element: ");
        int position = scanner.nextInt();
        System.out.print("Enter the new element to be inserted: ");
        int newElement = scanner.nextInt();

        // Check if the position is valid
        if (position < 0 || position > size) {
            System.out.println("Invalid position. The game is over.");
            return;
        }

        // Create a new array with size + 1
        int[] newArray = new int[size + 1];

        // Insert elements into the new array with the new element at the specified position
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == position) {
                newArray[i] = newElement;
            } else {
                newArray[i] = array[j];
                j++;
            }
        }

        // Print the new array
        System.out.println("Array after insertion:");
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}
