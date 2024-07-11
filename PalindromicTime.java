import java.util.Scanner;

public class PalindromicTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the input time in HH:MM format
        String inputTime = scanner.nextLine();
        scanner.close();

        // Split the input time into hours and minutes
        String[] timeParts = inputTime.split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);

        // Initialize the count of minutes passed
        int minutesPassed = 0;

        // Loop until we find a palindromic time
        while (true) {
            // Increment the time by one minute
            minutes++;
            minutesPassed++;

            // If minutes reach 60, increment the hour and reset minutes
            if (minutes == 60) {
                minutes = 0;
                hours++;
                // If hours reach 24, reset hours
                if (hours == 24) {
                    hours = 0;
                }
            }

            // Format the current time as a string
            String currentTime = String.format("%02d:%02d", hours, minutes);

            // Check if the current time is a palindrome
            if (isPalindrome(currentTime)) {
                break;
            }
        }

        // Output the number of minutes passed to reach the palindromic time
        System.out.println(minutesPassed);
    }

    // Function to check if a given time string is a palindrome
    public static boolean isPalindrome(String time) {
        int length = time.length();
        for (int i = 0; i < length / 2; i++) {
            if (time.charAt(i) != time.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
