import java.util.*; 
public class carMileage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float mileage = sc.nextFloat();
        int petrol = sc.nextInt();
        int distance = sc.nextInt();

        if (distance<=mileage*petrol){
            System.out.println("Can reach");
        }
        else{
            System.out.println("Cannot reach");
        }
    }
    
}
