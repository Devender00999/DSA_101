# Given an array arr of positive integers. Reverse every sub-array group of size k.

# i/p: arr = 1, 2, 3, 4, 5; k = 3
# o/p: 3, 2, 1, 5, 4

# i/p: arr = 5, 6, 8, 9; k = 5
# o/p: 9, 8, 6, 5

# T(n): O(n)
# S(n): O(1)
def reverseArrayInGroup(arr, k):
    n = len(arr)
    startIdx = 0
    while(startIdx < n):
        low = startIdx 
        high = min(startIdx + k - 1, n - 1)
        while(low < high):
            arr[low], arr[high] = arr[high], arr[low]
            high -= 1
            low += 1
        startIdx += k
    return arr
arr = [1, 2, 3, 4, 5]
reverseArrayInGroup(arr, 3)
print(arr)