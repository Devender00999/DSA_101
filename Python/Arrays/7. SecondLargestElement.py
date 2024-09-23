# Given an array arr of size N, the task is to find the 2nd largest element in the given array. 

# i/p: 10, 20, 4
# o/p: 10

# i/p: 20, 10, 20, 4, 100
# o/p: 20


import math
# T(n): O(n)
# S(n): O(1)
def getSecondLargestElement(arr):
    max = -math.inf
    for i in range(len(arr)):
        if (arr[i] > max):                  
            max = arr[i]
    secondMax = 0
    for i in range(len(arr)):
        if (arr[i] > secondMax and arr[i] != max):
            secondMax = arr[i]
    return secondMax

# print(getSecondLargestElement([4, 10, 20, 4, 23, 23]))
# T(n): O(n)
# S(n): O(1)
def getSecondLargestElementV2(arr):
    res = -1
    max = 0
    for i in range(len(arr)):
        if (arr[i] > arr[max]):
            res = max
            max = i
        if res == max:
            res = -1
    return arr[res]

print(getSecondLargestElementV2([10, 20, 4, 23, 25]))