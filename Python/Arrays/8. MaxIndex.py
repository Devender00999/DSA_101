# Given an array arr of positive integers. The task is to return the maximum of j - i subjected to the constraint of arr[i] < arr[j] and i < j.

# i/p: 1, 10
# o/p: 1

# i/p: 34, 8, 10, 3, 2, 80, 30, 33, 1
# o/p: 6

# T(n): O(n^2)
# S(n): O(1)
def findMaxIndex(arr):
    max = -1
    for i in range(len(arr)):
        for j in range(len(arr) - 1, -1, -1):
            if (arr[i] <= arr[j] and i <= j):
                if j - i > max:
                    max = j - i
                break
    return max                

# T(n): O(n)
# S(n): O(n)
def findMaxIndexV2(arr:list):
    length = len(arr)
    rightMax = []
    leftMin = []
    for i in range(len(arr)):
        rightMax.append(0)
        leftMin.append(0)
    rightMax[length - 1] = arr[length - 1]   
    leftMin[0] = arr[0]

    for i in range(length - 2, -1, -1):
        rightMax[i] = max(rightMax[i + 1], arr[i]) 

    for i in range(1, length):
        leftMin[i] = min(leftMin[i - 1], arr[i]) 
    
    i = 0
    j = 0
    ans = -1
    while (i < length and j < length):
        if (leftMin[i] <= rightMax[j]):
            if j - i > ans:
                ans = j - i
            j += 1
        else:
            i += 1
    return ans
print(findMaxIndex([34, 8, 10, 3, 2, 80, 30, 33, 1]))