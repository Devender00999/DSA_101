# to reverse given array

# i/p: 10, 2, 30, 40
# o/p: 40, 30, 2, 10

# T(n): O(n)
# S(n): O(n)
def reverseArray(arr):
    tempArr = []
    for i in range(len(arr) - 1, -1, -1):
        tempArr.append(arr[i])
    return tempArr

# T(n): O(n)
# S(n): O(1)
def reverseArrayV2(arr):
    high = len(arr) - 1
    low = 0
    while (low < high):
        temp = arr[low]
        arr[low] = arr[high]
        arr[high] = temp
        high -= 1
        low += 1
    return arr

print(reverseArrayV2([10, 2, 30, 40]))