import java.util.Scanner;

public class clockAngle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int minute = scanner.nextInt();

        scanner.close();

        if (hour < 1 || hour > 12 || minute < 0 || minute >= 60) {
            System.out.println("Invalid Input");
            return;
        }

        double hourAngle = (hour % 12 + minute / 60.0) * 30;
        double minuteAngle = minute * 6;

        double angle = Math.abs(hourAngle - minuteAngle);

        angle = Math.min(angle, 360 - angle);

        System.out.printf("%.2f", angle);
    }
}
