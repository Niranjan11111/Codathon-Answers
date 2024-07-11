import java.util.Scanner;

public class mangoTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int column = sc.nextInt();
        int treeNumber = sc.nextInt();

        if(treeNumber>=1 && treeNumber<=column || treeNumber%column==1 || treeNumber%column==0 ){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
    
}
 