def quick_select(arr, left, right, k):
    if left == right:
        return arr[left]

    pivot_index = partition(arr, left, right)
    if k == pivot_index:
        return arr[k]
    elif k < pivot_index:
        return quick_select(arr, left, pivot_index - 1, k)
    else:
        return quick_select(arr, pivot_index + 1, right, k)

def partition(arr, left, right):
    pivot = arr[right]
    i = left
    for j in range(left, right):
        if arr[j] < pivot:
            arr[i], arr[j] = arr[j], arr[i]
            i += 1
    arr[i], arr[right] = arr[right], arr[i]
    return i

def kth_smallest_element(arr, k):
    return quick_select(arr, 0, len(arr) - 1, k - 1)

if __name__ == "__main__":
    import sys
    input = sys.stdin.read
    
    data = input().split()
    N = int(data[0])
    K = int(data[1])
    arr = list(map(int, data[2:2+N]))

    print(kth_smallest_element(arr, K))
