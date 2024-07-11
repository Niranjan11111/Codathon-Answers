import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
        int n=sc.nextInt();  
         
        int[] array = new int[n];  
        
        for(int i=0; i<n; i++)  
        {  
         array[i]=sc.nextInt();  
        }  
        moveZeroes(array);
        System.out.println(n);
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
