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

# Idea is to create a visited array where each element which is 1 <= N and present in array will be stored
# T(n): O(n)
# S(n): O(n)
def findSmallestPositiveNumberV2(arr: list):
    n = len(arr)
    visited = [False] * (n + 1)
    
    # checking if elements from 1 to N is present in array
    for i in range(n):
        if (arr[i] > 0 and arr[i] <= n):
            visited[arr[i]] = True
    
    # checking if any element is missing from the visited array
    for i in range(1, n + 1):
        if not visited[i]:
            return i
        
    return n + 1


# idea is to move each element in its correct position based on its value, such that 1 <= x <= n is placed at (x - 1)th index
# T(n): O(n)
# T(n): S(1)
def findSmallestPositiveNumberV3(arr: list):
    n = len(arr)
    for i in range(n):
        while 1 <= arr[i] <= n and arr[i] != arr[arr[i] - 1]:
            temp = arr[i]
            arr[i] = arr[arr[i] - 1]
            arr[temp - 1] = temp
    
    for i in range(1, n + 1):
        if (i != arr[i - 1]):
            return i
    return n + 1
    

arr = [1, 2, 3, 4, 5]
arr = [0, -10, 1, 10, -20]
arr = [2, -3, 4, 1, 1, 7]

print(findSmallestPositiveNumber(arr))
print(findSmallestPositiveNumberV2(arr))
print(findSmallestPositiveNumberV3(arr))