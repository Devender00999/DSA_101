# to remove duplicate elements from a sorted array

# i/p: 10, 20, 20, 30, 30, 30, 30
# o/p: 10, 20, 30

# T(n): O(n)
# S(n): O(n)
def removeDuplicatesFromSortedArray(arr):
    uniqueArr = []
    n = len(arr)
    res = 1
    uniqueArr.append(arr[0])
    for i in range(1, len(arr)):
        if (uniqueArr[res - 1] != arr[i]):
            uniqueArr.append(arr[i])
            res += 1
    for i in range(0, res):
        arr[i] = uniqueArr[i]
    return res

# T(n): O(n)
# S(n): O(1)
def removeDuplicatesFromSortedArrayV2(arr):
    res = 1
    arr
    for i in range(1, len(arr)):
        if (arr[i] != arr[res - 1]):
            arr[res] = arr[i]
            res += 1
    return res
arr =  [10, 10, 10]
arr =  [10, 20, 20, 20, 30, 30, 30, 30, 30, 40]
print(removeDuplicatesFromSortedArrayV2(arr))
print(arr)