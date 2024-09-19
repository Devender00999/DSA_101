# You are given an array arr(0-based index). The size of the array is given by sizeOfArray.
# You need to insert an element at given index.

# T(n): O(n)
# S(n): O(1)
def insertAtIndex(arr, sizeofArray, index, elem):
    for i in range(sizeofArray - 1, index, -1):
        arr[i] = arr[i - 1]
    arr[index] = elem
    return arr

# T(n): O(1)
# S(n): O(1)
def insertAtIndexV2(arr: list, index, elem):
    arr.insert(index, elem)
    return arr

print(insertAtIndex([1,2,3,4,5, -1], 6, 2, 34))
print(insertAtIndexV2([1,2,3,4,5], 2, 34))