import java.util.Scanner;

public class DiscipleTraining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the target score
        int targetScore = scanner.nextInt();

        // Initialize the current score and the number of turns
        int currentScore = 0;
        int turns = 0;

        // Read the scores and keep adding them until we reach or exceed the target score
        while (scanner.hasNextInt()) {
            int score = scanner.nextInt();
            currentScore += score;
            turns++;
            if (currentScore >= targetScore) {
                break;
            }
        }

        // Print the result
        System.out.println("The number of turns is " + turns);

        scanner.close();
    }
}
