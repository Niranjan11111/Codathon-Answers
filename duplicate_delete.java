import java.util.Scanner;

public class duplicate_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int k=0;k<n;k++)
        {
            arr[k] = sc.nextInt();
        }
        System.out.println("\n\n");
        for(int i = 0; i < n; i++) 
        {  
            for(int j = i + 1; j < n; j++) 
            {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  

    }
    
}
