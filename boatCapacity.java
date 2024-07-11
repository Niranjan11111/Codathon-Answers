import java.util.Scanner;

public class boatCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int boat_capacity = sc.nextInt();
        int adults = sc.nextInt();
        int children = sc.nextInt();
        adults *= 75;
        children *= 30;
        if (boat_capacity>=adults+children){
            System.out.println("Boat is stable");
        }
        else{
            System.out.println("Boat will sink");
        }
    }
    
}
