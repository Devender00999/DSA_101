# Equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes. We are given an Array of integers, 
# We have to find out the first index i from left such that -
# A[0] + A[1] + ... A[i-1] = A[i+1] + A[i+2] ... A[n-1]

# i/p: -7, 1, 5, 2, -4, 3, 0
# o/p: 3
# T(n): O(n^2)
# S(n): O(1)
def findEquilibriumIndex(arr):
    for i in range(len(arr)):
        lsum = 0
        for j in range(0, i):
            lsum += arr[j]
        rsum = 0
        for j in range(i + 1, len(arr)):
            rsum += arr[j]

        if lsum == rsum:
            return i
    return -1

# T(n): O(n)
# S(n): O(1)
def findEquilibriumIndexV2(arr):
    sum = 0
    for i in range(len(arr)):
        sum += arr[i]
    lsum = 0
    for i in range(len(arr)):
        sum -= arr[i]
        if (lsum == sum):
            return i
        lsum += arr[i]
        
    return -1
        


print(findEquilibriumIndexV2([-7, 1, 5, 2, -4, 3, 0]))