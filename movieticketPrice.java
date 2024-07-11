import java.util.Scanner;

public class movieticketPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the age
        int age = sc.nextInt();
        
        // Read the show timing
        double showTime = sc.nextDouble();

        // Define the matinee show time
        double matineeShow = 13.30;

        // Define the ticket prices
        double adultNormalPrice = 8.00;
        double adultMatineePrice = 5.00;
        double childNormalPrice = 4.00;
        double childMatineePrice = 2.00;

        // Determine if the show is a matinee show
        boolean isMatinee = (showTime == matineeShow);

        // Determine the ticket price
        double ticketPrice;
        if (age > 13) { // Adult
            ticketPrice = isMatinee ? adultMatineePrice : adultNormalPrice;
        } else { // Child
            ticketPrice = isMatinee ? childMatineePrice : childNormalPrice;
        }

        // Print the ticket price formatted to 2 decimal places
        System.out.printf("$%.2f\n", ticketPrice);
        
        sc.close();
    }
}
