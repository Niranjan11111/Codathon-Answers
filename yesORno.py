def solve():
    import sys
    input = sys.stdin.read
    from collections import defaultdict
    
    data = input().split()
    
    n = int(data[0])
    k = int(data[1])
    
    values = list(map(int, data[2:n+2]))
    edges = []
    index = n + 2
    
    for _ in range(n-1):
        u = int(data[index])
        v = int(data[index + 1])
        edges.append((u - 1, v - 1))  # Convert to 0-based indexing
        index += 2
    
    if k == 1:
        print("NO")
        return
    
    total_xor = 0
    for value in values:
        total_xor ^= value
    
    if total_xor == 0:
        print("YES")
        return
    
    graph = defaultdict(list)
    for u, v in edges:
        graph[u].append(v)
        graph[v].append(u)
    
    subtree_xor = [0] * n
    found_xor_count = 0
    
    def dfs(node, parent):
        nonlocal found_xor_count
        xor_sum = values[node]
        for neighbor in graph[node]:
            if neighbor != parent:
                xor_sum ^= dfs(neighbor, node)
        
        subtree_xor[node] = xor_sum
        
        if xor_sum == total_xor:
            found_xor_count += 1
            xor_sum = 0  # Reset to 0 to prevent double counting in other parts of the tree
        
        return xor_sum
    
    dfs(0, -1)
    
    if found_xor_count >= k:
        print("YES")
    else:
        print("NO")

solve()