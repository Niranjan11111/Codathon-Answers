import sys
from collections import defaultdict

MOD = 1000000007

# Function to perform depth-first search and count good sequences
def dfs(node, parent, color, k, dp):
    if dp[node][color] is not None:
        return dp[node][color]
    
    total_sequences = pow(len(tree), k, MOD)
    invalid_sequences = 1

    for neighbor, edge_color in tree[node]:
        if neighbor != parent:
            sub_result = dfs(neighbor, node, edge_color, k - 1, dp)
            invalid_sequences = (invalid_sequences * sub_result) % MOD

    good_sequences = (total_sequences - invalid_sequences + MOD) % MOD
    dp[node][color] = good_sequences
    return good_sequences

# Input handling
def main():
    input = sys.stdin.read
    data = input().split()
    
    idx = 0
    n = int(data[idx])
    k = int(data[idx + 1])
    idx += 2

    global tree
    tree = defaultdict(list)
    
    for _ in range(n - 1):
        u = int(data[idx])
        v = int(data[idx + 1])
        x = int(data[idx + 2])
        tree[u].append((v, x))
        tree[v].append((u, x))
        idx += 3

    # Initialize dp table
    dp = [[None for _ in range(2)] for _ in range(n + 1)]

    total_good_sequences = 0
    for node in range(1, n + 1):
        total_good_sequences = (total_good_sequences + dfs(node, -1, 0, k, dp)) % MOD

    print(total_good_sequences)

if __name__ == "__main__":
    main()
