import java.util.Scanner;

public class tankFilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int h = sc.nextInt();
        int waterRecieved = sc.nextInt();
        int hours = sc.nextInt();

        int volume = (2*(22/7)*r*h)+2*(22/7)*r*r;
        int waterTotalamount = waterRecieved*hours;

        if(volume<=waterTotalamount){
            System.out.println("The tank can be filled within "+ hours +" hours");
        }
        else{
            System.out.println("The tank cannot be filled within "+ hours +" hours");
        }
    }    
}
