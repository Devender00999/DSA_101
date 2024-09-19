# Given an array arr of size N, the task is to find the largest element in the given array. 

# i/p: 10, 20, 4
# o/p: 20

# i/p: 20, 10, 20, 4, 100
# o/p: 100

# T(n): O(n^2)
# S(n): O(1)
def getLargestElement(arr):
    for i in range(len(arr)):
        isLargest = True
        for j in range(len(arr)):
            if (arr[j] > arr[i]):
                isLargest = False
                break
        if (isLargest):
            return arr[i]
    return -1

import math
# T(n): O(n)
# S(n): O(1)
def getLargestElementV2(arr):
    max = -math.inf
    for i in range(len(arr)):
        if (arr[i] > max):
            max = arr[i]
    return max

print(getLargestElement([20, 10, 34, 4, 23]))
print(getLargestElementV2([34, 10, 20, 4, 23]))