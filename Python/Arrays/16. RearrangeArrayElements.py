# to rearrange an array so that arr[i] becomes arr[arr[i]]

# i/p: 4, 0, 2, 1, 3
# o/p: 3, 4, 2, 0, 1

# T(n): O(n)
# S(n): O(n)
def rearrangeArray(arr):
    tempArr = []
    for i in range(len(arr)):
        tempArr.append(arr[arr[i]])
    return tempArr

arr = [1, 0, 4, 2, 3]
print(rearrangeArray(arr))