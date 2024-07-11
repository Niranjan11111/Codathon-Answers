import java.util.Scanner;

public class HouseRobber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();
        
        // Read the array elements
        int[] houses = new int[n];
        for (int i = 0; i < n; i++) {
            houses[i] = scanner.nextInt();
        }
        
        System.out.println(rob(houses));
        
        scanner.close();
    }

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        
        int n = nums.length;
        
        if (n == 1) {
            return nums[0];
        }
        
        // Dynamic programming array to store the maximum amount robbed up to each house
        int[] dp = new int[n];
        
        // Base cases
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        
        // Fill the dp array
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        
        // The maximum amount robbed will be in the last element of dp array
        return dp[n - 1];
    }
}
