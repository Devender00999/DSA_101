# The task is to find the median and mean of the array elements. 
# Mean is average of the numbers and median is the element which is smaller than half of the elements and greater than remaining half.

# i/p: 1, 2, 19, 28, 5
# o/p: 11, 5

import math

# T(n): O(n)
# S(n): O(1)
def mean(arr):
    sum = 0
    for i in arr:
        sum += i
    return math.floor(sum / len(arr))


# T(n): O(1)
# S(n): O(1)
def median(A,N):
    A.sort()
    mid = math.floor((N - 1)/2)
    if N % 2 == 0:
        return math.floor((A[mid] + A[mid + 1]) / 2)
    return A[mid]

print(median([1, 3, 3, 6, 7 ,8 , 9], 7))
print(median([1, 2, 3, 4, 5, 6 ,8 , 9], 8))
print(median([2, 8, 3, 4], 4))