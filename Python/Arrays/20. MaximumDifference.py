# Given an array arr[] of integers, find out the maximum difference between any two elements such that the larger element appears after the smaller number. 

# i/p: 2, 3, 10, 6, 4, 8, 1
# o/p: 8

# i/p: 7, 9, 5, 6, 3, 2
# o/p: 2

# idea is to run a outer loop from i = 0 to n - 1 and an inner loop from j = i + 1 to n - 1. and storing maximum value where j > i
# T(n): O(n^2)
# S(n): O(1)
import math
def maximumDifference(arr: list):
    n = len(arr)
    maxDiff = -math.inf
    for i in range(0, n):
        for j in range(i + 1, n - 1):
                maxDiff = max(arr[j] - arr[i], maxDiff)
    return maxDiff

# Idea is to keep track of calculate maximumRight values in an array and comparing arr[i] with maxRightArr[i + 1] and finding maximum difference
# T(n): O(n)
# S(n): O(n)
def maximumDifferenceV2(arr: list):
    n = len(arr)
    maxFromRight = arr.copy()
    for i in range(n - 2, -1, -1):
        maxFromRight[i] = max(maxFromRight[i], maxFromRight[i + 1])
        
    maxElem = maxFromRight[1] - arr[0]
    for i in range(1, n - 1):
         maxElem = max(maxFromRight[i + 1] - arr[i], maxElem)
    return maxElem

# Idea is to keep track of minimum value so far and subtracting it from arr[i] and calculating maximum difference.
# T(n): O(n)
# S(n): O(1)    
def maximumDifferenceV2(arr: list):
    n = len(arr)

    maxDiff = arr[0] - arr[1]
    minElem = arr[0]

    for i in range(1, n):
         maxDiff = max(maxDiff, arr[i] - minElem)
         minElem = min(arr[i], minElem)
    return maxDiff

arr = [2, 3, 10, 6, 4, 8, 1]
# arr = [7, 9, 5, 6, 3, 2]


print(maximumDifference(arr))
print(maximumDifferenceV2(arr))