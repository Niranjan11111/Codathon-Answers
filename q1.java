import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q1 {
    private static final int MOD = 1000000007;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        List<List<Edge>> tree = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            tree.add(new ArrayList<>());
        }
        
        // Read the tree edges and colors
        for (int i = 1; i < n; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int x = scanner.nextInt();
            tree.get(u).add(new Edge(v, x));
            tree.get(v).add(new Edge(u, x));
        }
        
        // Initialize dp array
        long[][] dp = new long[n + 1][k + 1];
        
        // DFS to fill dp array
        dfs(1, -1, tree, dp, k);
        
        // Calculate total number of good sequences
        long totalGoodSequences = 0;
        for (int v = 1; v <= n; v++) {
            totalGoodSequences = (totalGoodSequences + dp[v][k]) % MOD;
        }
        
        // Print the result
        System.out.println(totalGoodSequences);
    }
    
    private static void dfs(int v, int parent, List<List<Edge>> tree, long[][] dp, int k) {
        dp[v][0] = 1; // Base case: one way to have a sequence of length 0 (empty sequence)
        
        for (Edge edge : tree.get(v)) {
            int u = edge.to;
            if (u == parent) continue; // Skip the parent node
            
            dfs(u, v, tree, dp, k);
            
            // Update dp[v][j] for j = 1 to k
            for (int j = 1; j <= k; j++) {
                dp[v][j] = (dp[v][j] + dp[u][j - 1]) % MOD;
                if (edge.color == 1) {
                    dp[v][j] = (dp[v][j] + dp[u][j - 1]) % MOD;
                }
            }
        }
    }
    
    static class Edge {
        int to;
        int color;
        
        Edge(int to, int color) {
            this.to = to;
            this.color = color;
        }
    }
}
