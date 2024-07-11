import java.util.Scanner;

public class kaprekar_num{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int sqr = n*n;
        int temp = n;

        while(n!=0)
        {
            int rem=n%10;
            n = n/10;
            count+=1;
        }
        int p = (int)Math.pow(10,count);
        int a = sqr/p;
        int b = sqr%p;
        int sum = a+b;
        if(sum==temp){
            System.out.println("Kaprekar Number");
        }
        else{
            System.out.println("Not a Kaprekar Number");
        }

    }
    
}
