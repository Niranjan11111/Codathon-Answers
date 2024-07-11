import java.util.Scanner;

public class circleInsertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        int length = sc.nextInt();

        if(length>2*radius){
            System.out.println("The circle can be inside a square");
        }
        else{
            System.out.println("The circle cannot be inside a square");
        }
    }
    
}
