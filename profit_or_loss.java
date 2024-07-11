import java.util.Scanner;

public class profit_or_loss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int buyPrice = sc.nextInt();
        int sellPrice = sc.nextInt();
        sellPrice *= 12;


        if(sellPrice>buyPrice){
            int profit = sellPrice-buyPrice;
            System.out.println("Profit : Rs."+profit);
        }
        else if(buyPrice>sellPrice){
            int loss = buyPrice-sellPrice;
            System.out.println("Loss : Rs."+loss);
        }
        else{
            System.out.println("No profit nor loss");
        }
    }
    
}
