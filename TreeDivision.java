import java.util.*;

public class TreeDivision {
    static List<List<Integer>> adjList;
    static int[] nodeValues;
    static int k;
    static boolean canDivide;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read n and k
        int n = scanner.nextInt();
        k = scanner.nextInt();

        // Read node values
        nodeValues = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nodeValues[i] = scanner.nextInt();
        }

        // Initialize adjacency list
        adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Read edges
        for (int i = 0; i < n - 1; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        canDivide = false;
        dfs(1, -1);

        System.out.println(canDivide ? "YES" : "NO");
    }

    private static int dfs(int node, int parent) {
        int subtreeSum = nodeValues[node];

        for (int neighbor : adjList.get(node)) {
            if (neighbor != parent) {
                subtreeSum += dfs(neighbor, node);
            }
        }

        if (subtreeSum == k) {
            canDivide = true;
        }

        return subtreeSum;
    }
}