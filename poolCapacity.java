import java.util.Scanner;

public class poolCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int liters = sc.nextInt();
        int volume = length*length*length;
        volume *= 1000;

        if (volume>=liters){
            System.out.println("Can store");
        }
        else{
            System.out.println("Cannot store");
        }



    }
    
}
