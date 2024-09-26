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

print(reverseArray([10, 2, 30, 40]))