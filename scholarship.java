import java.util.*;
public class scholarship {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int year = sc.nextInt();
        int fincome = sc.nextInt();
        int arrears = sc.nextInt();
        float markpercent=sc.nextFloat();
        float attendance=sc.nextFloat();
        
        if((year >= 2021) && (age>=18&&age<21) && (markpercent>=60) && (attendance>=80))
        {
            if(arrears<=2 && fincome<=200000){
              System.out.println("Eligible");
            }
            else if((fincome>=200000 &&  fincome<250000) && (markpercent>=80) && (attendance>=90)){
              System.out.println("Partially Eligible");
            }
            else{
              System.out.println("Not Eligible");
            }
        }
        else{
            System.out.println("Not Eligible");  
        }

    }
}
