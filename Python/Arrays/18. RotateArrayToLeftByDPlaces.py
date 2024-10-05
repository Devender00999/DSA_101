# Given an array, the task is to Left Rotate an Array by D places.
# i/p: arr = 1, 2, 3, 4, 5, d = 2
# o/p: 3, 4, 5, 1, 2

# Idea is to use rotate array by one place and keep repeating this process for d times
# T(n): O(n * d)
# S(n): O(1)
def leftRotateByDPlace(arr, d):
    n = len(arr)
    for i in range(d):
        firstItem = arr[0]
        for i in range(1, n):
            arr[i - 1] = arr[i]
        arr[n - 1] = firstItem
    return arr

# Idea is to store first d elements into a temporary array and move each elements from arr[i] to arr[i + d] and then replacing remaining elements
# T(n): O(n)
# S(n): O(d)
def leftRotateByDPlaceV2(arr, d):
    n = len(arr)
    tempD = d
    if d > n:
        tempD = d % n 
    tempArr = []
    for i in range(tempD):
        tempArr.append(arr[i])

    for i in range(0, n - tempD):
        arr[i]= arr[i + tempD] 

    tempIdx = 0
    for i in range(n - tempD, n):
        arr[i] = tempArr[tempIdx]
        tempIdx += 1
    return arr

# T(n): O(n)
# S(n): O(1)
def reverseArray(arr, low, high):
    while (low < high):
        arr[low], arr[high] = arr[high], arr[low]
        low += 1
        high -= 1

# T(n): O(n)
# S(n): O(1)
def leftRotateByDPlaceV3(arr, d):
    n = len(arr)
    tempD = d % n
    reverseArray(arr, 0, tempD - 1)
    reverseArray(arr, tempD, n - 1)
    reverseArray(arr, 0, n - 1)
    return arr

    
arr = [1, 2, 3, 4, 5]
print(leftRotateByDPlaceV2(arr, 48))
arr = [1, 2, 3, 4, 5]
print(leftRotateByDPlace(arr, 3))
arr = [1, 2, 3, 4, 5]
print(leftRotateByDPlaceV3(arr, 8))