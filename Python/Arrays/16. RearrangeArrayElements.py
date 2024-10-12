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

# Idea is to encode each element in array to store two values
# 1st value: original value
# 2nd value which will come in its place
# for even places: we will store maximum and what already their
# for odd places will store minimum and what's already their

# T(n): O(n)
# S(n): O(1)
def rearrangeArrayV2(arr):
    n = len(arr)
    maxIdx = n - 1
    minIdx = 0
    maxElem = arr[n - 1] + 1
    for i in range(n):
        if i % 2 == 0:
            arr[i] = arr[i] + (arr[maxIdx] % maxElem) * maxElem
            maxIdx -= 1
        else:
            arr[i] = arr[i] + (arr[minIdx] % maxElem) * maxElem
            minIdx += 1
    for i in range(n):
        arr[i] //= maxElem



arr = [4, 0, 2, 1, 3]
arr = [1, 2, 3, 4]
print(rearrangeArrayV2(arr))
print(arr)