import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first line as a single string
        String firstLine = scanner.next();

        // Parse N and K from the first line
        int N = Integer.parseInt(firstLine.substring(0, firstLine.length() - 1));
        int K = Integer.parseInt(firstLine.substring(firstLine.length() - 1));

        // Read the array elements
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        // Find and print the Kth smallest element
        int kthSmallest = quickSelect(array, 0, N - 1, K - 1);
        System.out.println(kthSmallest);
    }

    private static int quickSelect(int[] array, int left, int right, int k) {
        if (left == right) {
            return array[left];
        }

        int pivotIndex = partition(array, left, right);
        if (k == pivotIndex) {
            return array[k];
        } else if (k < pivotIndex) {
            return quickSelect(array, left, pivotIndex - 1, k);
        } else {
            return quickSelect(array, pivotIndex + 1, right, k);
        }
    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (array[j] < pivot) {
                swap(array, i, j);
                i++;
            }
        }

        swap(array, i, right);
        return i;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
