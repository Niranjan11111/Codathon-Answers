import java.util.*;
public class collatzSequence {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);

        while(n!=1){
            if(n%2==0){
                n = n/2;
                count += 1;
                System.out.println(n);
            }
            else{
                n=(3*n)+1;
                count += 1;
                System.out.println(n);
            }
        }
    System.out.println(count);    
    }
}
