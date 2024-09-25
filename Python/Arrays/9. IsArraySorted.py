# Given an array of size n, write a program to check if it is sorted in ascending order or not. 
# Equal values are allowed in an array and two consecutive equal values are considered sorted.


# i/p: 1, 2, 19, 28
# o/p: Yes

# T(n): O(n)
# S(n): O(1)
def isArraySorted(arr):
    for i in range(len(arr) - 1):
        if arr[i] > arr[i + 1]:
            return False
    return True

print(isArraySorted([20, 20, 78, 98, 99, 97]))
