import java.util.*;

public class NaryTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the size of the parent array
        int n = scanner.nextInt();
        int[] parent = new int[n];
        
        // Read the parent array
        for (int i = 0; i < n; i++) {
            parent[i] = scanner.nextInt();
        }
        
        // Read the node x
        int x = scanner.nextInt();
        
        // Build the tree
        Map<Integer, List<Integer>> tree = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            int parentNode = parent[i];
            if (parentNode == -1) {
                // Skip if the parent is -1 (root node)
                continue;
            }
            if (!tree.containsKey(parentNode)) {
                tree.put(parentNode, new ArrayList<>());
            }
            tree.get(parentNode).add(i);
        }
        
        // Find the number of children of node x
        if (tree.containsKey(x)) {
            List<Integer> children = tree.get(x);
            System.out.println(children.size());
        } else {
            System.out.println(0);
        }
        
        scanner.close();
    }
}
