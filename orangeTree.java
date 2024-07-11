import java.util.Scanner;

public class orangeTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int treeNumber = scanner.nextInt();
       
        int secondRowStart = columns + 1;
        int secondRowEnd = 2 * columns;

        int secondLastRowStart = (rows - 2) * columns + 1;
        int secondLastRowEnd = (rows - 1) * columns;


        if ((treeNumber >= secondRowStart && treeNumber <= secondRowEnd) ||
            (treeNumber >= secondLastRowStart && treeNumber <= secondLastRowEnd)) {
            System.out.println("It is an orange tree");
        } else {
            System.out.println("It is not an orange tree");
        }
    }
    
}
