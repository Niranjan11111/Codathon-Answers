import java.util.Scanner;

public class discount {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        float item1_price = sc.nextFloat();
        float item2_price = sc.nextFloat();
        int discount = sc.nextInt();

        float total_amount = item1_price+item2_price;
        float amount_saved = (total_amount/100)*discount;
        float discounted_price = total_amount-amount_saved;

        System.out.printf("%.2f%n", total_amount);
        System.out.printf("%.2f%n", discounted_price);
        System.out.printf("%.2f%n", amount_saved);
        
         
    }
    
}
