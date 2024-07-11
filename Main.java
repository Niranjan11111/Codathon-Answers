import java.util.*;
import java.io.*;

public class Main {
    static int n, k;
    static int[] values;
    static List<Integer>[] tree;
    static int totalXor;
    static int foundXorCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        n = Integer.parseInt(nk[0]);
        k = Integer.parseInt(nk[1]);

        values = new int[n];
        String[] valueStrings = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            values[i] = Integer.parseInt(valueStrings[i]);
        }

        tree = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 0; i < n - 1; i++) {
            String[] edge = br.readLine().split(" ");
            int u = Integer.parseInt(edge[0]) - 1;
            int v = Integer.parseInt(edge[1]) - 1;
            tree[u].add(v);
            tree[v].add(u);
        }

        if (k == 1) {
            System.out.println("NO");
            return;
        }

        totalXor = 0;
        for (int value : values) {
            totalXor ^= value;
        }

        if (totalXor == 0) {
            System.out.println("YES");
            return;
        }

        foundXorCount = 0;
        dfs(0, -1);

        if (foundXorCount >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static int dfs(int node, int parent) {
        int xorSum = values[node];
        for (int neighbor : tree[node]) {
            if (neighbor != parent) {
                xorSum ^= dfs(neighbor, node);
            }
        }

        if (xorSum == totalXor) {
            foundXorCount++;
            xorSum = 0;  // Reset to 0 to prevent double counting in other parts of the tree
        }

        return xorSum;
    }
}
