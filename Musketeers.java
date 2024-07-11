import java.util.Scanner;

public class Musketeers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int a2 = sc.nextInt();
        int b2 = sc.nextInt();
        int a3 = sc.nextInt();
        int b3 = sc.nextInt();

        int a4 = (a1 + a2 + a3) / 3;
        int b4 = (b1 + b2 + b3) / 3;

        System.out.println(a4);
        System.out.println(b4);

    }

}