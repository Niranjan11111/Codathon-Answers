import java.util.*;
public class arrangingBenches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area = sc.nextInt();
        int typeX = sc.nextInt();
        int typeY = sc.nextInt();

        if(area>0 && area <=100 && typeX>0 && typeX<=100 && typeY>0 && typeY<=100){
            int Area1 = area%typeX;
            int Area2 = area%typeY;
            int remainingArea1 = area/typeX;
            int remainingArea2 = area/typeY;
            System.out.println(remainingArea1);
            System.out.println(remainingArea2);
            
            if(remainingArea1>remainingArea2){
                int differnce = remainingArea1-remainingArea2;
                
            }
            else{
                int differnce = remainingArea2-remainingArea1;
            }

        }

    }
    
}
