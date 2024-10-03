# Given a sorted array, the task is to remove the duplicate elements from the array.

# i/p: 8, 5, 0, 10, 0, 20
# o/p: 8, 5, 10, 20, 0, 0

# T(n): O(n^2)
# S(n): O(1)
def moveZeroIndexToEnd(arr):
    for i in range(len(arr)):
        if arr[i] == 0:
            for j in range(i + 1, len(arr)):
                if (arr[j] != 0):
                    arr[i], arr[j] = arr[j], arr[i]
                    break
    return arr

# T(n): O(n)
# S(n): O(1)
def moveZeroToEnd(arr):
    n = len(arr)
    count = 0
    for i in range(n):
        if (arr[i] != 0):
            arr[i], arr[count] = arr[count], arr[i]
            count += 1
    return arr
arr = [8, 0, 0, 10, 0, 20]
print(moveZeroToEnd(arr)) 