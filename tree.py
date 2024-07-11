def find_number_of_children(parent_array, x):
    # Create a dictionary to store children for each node
    tree = {}
    
    n = len(parent_array)
    for i in range(n):
        parent = parent_array[i]
        if parent not in tree:
            tree[parent] = []
        tree[parent].append(i)
    
    # If x is not in the tree or has no children, return 0
    if x not in tree:
        return 0
    
    return len(tree[x])

# Read input
import sys
input = sys.stdin.read
data = input().split()

n = int(data[0])
parent_array = list(map(int, data[1:n+1]))
x = int(data[n+1])

# Find and print the number of children of node x
result = find_number_of_children(parent_array, x)
print(result)