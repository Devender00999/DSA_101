# Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e
# first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.

# i/p: 1,2,3,4,5,6
# o/p: 6,1,5,2,4,3

# i/p: 10,20,30,40,50,60,70,80,90,100,110
# o/p: 110,10,100,20,90,30,80,40,70,50,60

# Idea is to traverse array from start and end together and insert arr[end] then arr[start] in a new array until start < end.
# T(n): O(n)
# S(n): O(n)
def reArrangeArrayAlternatively(arr):
    n = len(arr)
    if n <= 1:
        return
    i = 0
    j = n - 1
    li = []
    while (i < j):
        li.append(arr[j])
        li.append(arr[i])
        i += 1
        j -= 1
    if (n % 2 != 0):
        li.append(arr[i])
    for i in range(n):
        arr[i] = li[i]
    return li

# Idea is to store original value and new value in the same place by encoding it.
# to encode it we can use arr[i] = arr[i] + (arr[maxIdx] % maxElem) * maxElem
# maxElem will be maximum element + 1
# T(n): O(n)
# S(n): O(1)
def reArrangeArrayAlternatively(arr):
    n = len(arr)
    maxIdx = n - 1
    minIdx = 0
    maxElem = arr[maxIdx] + 1
    for i in range(n):
        if i % 2 == 0:
            arr[i] = arr[i] + (arr[maxIdx] % maxElem) * maxElem
            maxIdx -= 1
        else: 
            arr[i] = arr[i] + (arr[minIdx] % maxElem) * maxElem
            minIdx += 1
    for i in range(n):
        arr[i] //= maxElem


# arr = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110]
arr = [1, 2, 3, 4, 5, 6]
# arr= [350,863,1902,2328,2854,3915,6800,8955,9877]
print(reArrangeArrayAlternatively(arr))
print(arr)