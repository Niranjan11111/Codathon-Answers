import java.util.Scanner;

public class labCapacity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l1_capacity = sc.nextInt();
        int l2_capacity = sc.nextInt();
        int l3_capacity = sc.nextInt();
        sc.nextLine();
        String lab = sc.nextLine();
        if(lab.equals("L1")){
            if(l2_capacity>l3_capacity){
                System.out.println("L3");
            }
            else{
                System.out.println("L2");
            }
        }
        else if(lab.equals("L2")){
            if(l1_capacity>l3_capacity){
                System.out.println("L3");
            }
            else{
                System.out.println("L1");
            }
        }
        else{
            if(l1_capacity>l2_capacity){
                System.out.println("L2");
            }
            else{
                System.out.println("L1");
            }
        }

    }
    
}
