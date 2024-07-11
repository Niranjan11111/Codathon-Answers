import java.util.Scanner;

public class TicketNumberProcessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str1 = scanner.nextLine();
        
        System.out.println(processTicketNumber(str1));
        
        scanner.close();
    }

    public static String processTicketNumber(String str) {
        str = str.replace("G", "");
        str = str.replace("EF", "");
        return str;
    }
}
