import java.util.Scanner;

public class ageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int birth_year = sc.nextInt();
        int current_year = sc.nextInt();

        if (current_year>birth_year){
            birth_year += 100;
            current_year += 100;
        }else{
            current_year += 100;

        }
        int age = current_year-birth_year;

        System.out.println(age);
    }
    
}
