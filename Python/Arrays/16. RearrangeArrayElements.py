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

# Idea is to store current number and resulting number by encoding so we don't loose the number when we are replacing number
# arr[i] = arr[i] + (arr[arr[i]] % n) % n
# T(n): O(n)
# S(n): O(n)
def rearrangeArrayV2(arr):
    n = len(arr)
    for i in range(n):
        currentElem = arr[i]
        newElem = arr[currentElem]
        arr[i] = currentElem + (newElem % n) * n

    for i in range(n):
        arr[i] //= n

arr = [4, 0, 2, 1, 3]
print(rearrangeArrayV2(arr))
print(arr)