# You are given an integer array arr[]. Your task is to find the smallest positive number missing from the array.

# i/p: 1, 2, 3, 4, 5
# o/p: 6

# i/p: -10, 0, -20, 1, 3
# o/p: 2

# Idea is to find the missing number from 1 to n + 2 in the array and returning it
# T(n): O(n^2)
# S(n): O(1)
def findSmallestPositiveNumber(arr: list):
    n = len(arr)
    i = 1
    while(i <= n + 1):
        try:
            arr.index(i)
        except ValueError:
            return i
        i += 1


arr = [0, -10, 1, 3, -20]

print(findSmallestPositiveNumber(arr))