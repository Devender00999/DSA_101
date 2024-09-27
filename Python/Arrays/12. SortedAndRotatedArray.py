# Given an array arr[] of N distinct integers, check if this array is Sorted (non-increasing or non-decreasing) and Rotated counter-clockwise. 
# Note that input array may be sorted in either increasing or decreasing order, then rotated.

# T(n): O(n)
# S(n): O(1)
def isSortedAndRotated(arr):
    n = len(arr)
    increasingIdx = -1
    for i in range(1, n):
        if (arr[i - 1] > arr[i]):
            increasingIdx = i
            break
    isAscend = True
    if increasingIdx != -1:
        for i in range(1, increasingIdx):
            if arr[i - 1] > arr[i]:
                isAscend = False
                break

        if isAscend:
            for i in range(increasingIdx + 1, n):
                if (arr[i - 1] > arr[i]):
                    isAscend = False
                    break
            if arr[n - 1] > arr[0]:
                isAscend = False

    descIdx = -1
    for i in range(1, n):
        if (arr[i - 1] < arr[i]):
            descIdx = i
            break
    
    isDesc = True
    if (descIdx != -1):
        for i in range(1, descIdx):
            if (arr[i - 1] < arr[i]):
                isDesc = False
                break
        if isDesc:
            for i in range(descIdx + 1, n):
                if (arr[i - 1] < arr[i]):
                    isDesc = False
                    break  
            if arr[n - 1] < arr[0]:
                isDesc = False
    
    return isAscend or isDesc

# T(n): O(n)
# S(n): O(1)
def isSortedAndRotatedV2(arr):
    n = len(arr)
    countIncToDesc = 0
    for i in range(1, n):
        if arr[i - 1] > arr[i]:
            countIncToDesc += 1
    if (arr[n - 1] > arr[0]):
        countIncToDesc += 1
    return countIncToDesc == 1
    

print(isSortedAndRotated([5, 4, 3, 2, 1, 6]))
print(isSortedAndRotatedV2([5, 4, 3, 2, 1, 6]))