def spiral_traversal(matrix):
    top, bottom = 0, len(matrix) - 1
    left, right = 0, len(matrix[0]) - 1

    while top <= bottom and left <= right:
        # Traverse top row
        for i in range(left, right + 1):
            print(matrix[top][i], end=" ")
        top += 1

        # Traverse right column
        for i in range(top, bottom + 1):
            print(matrix[i][right], end=" ")
        right -= 1

        # Traverse bottom row
        if top <= bottom:
            for i in range(right, left - 1, -1):
                print(matrix[bottom][i], end=" ")
            bottom -= 1

        # Traverse left column
        if left <= right:
            for i in range(bottom, top - 1, -1):
                print(matrix[i][left], end=" ")
            left += 1

if __name__ == "__main__":
    N = int(input())

    matrix = []
    for i in range(N):
        row = []
        for j in range(N):
            element = int(input())
            row.append(element)
        matrix.append(row)

    spiral_traversal(matrix)
