# to left rotate an array by one
# i/p: 1, 2, 3, 4, 5
# o/p: 2, 3, 4, 5, 1

# Idea is to store the first element in a temporary variable and move arr[i - 1] to arr[i]
# T(n): O(n)
# S(n): O(1)
def leftRotateByOne(arr):
    n = len(arr)
    firstItem = arr[0]
    for i in range(1, n):
        arr[i - 1] = arr[i]
    arr[n - 1] = firstItem
    return arr

print(leftRotateByOne([1, 2, 3, 4, 5]))