# Given an array arr of size N, the task is to find the 2nd largest element in the given array. 

# i/p: 10, 20, 4
# o/p: 10

# i/p: 20, 10, 20, 4, 100
# o/p: 20

# T(n): O(n)
# S(n): O(1)
def getSecondLargestElement(arr):
    max = -1
    for i in range(len(arr)):
        if (arr[i] > max):                  
            max = arr[i]
    secondMax = -1
    for i in range(len(arr)):
        if (arr[i] > secondMax and arr[i] != max):
            secondMax = arr[i]
    
    return secondMax

# print(getSecondLargestElement([4, 10, 20, 4, 23, 23]))
# T(n): O(n)
# S(n): O(1)
def getLargestAndSecondLargestElementV2(arr):
    second = -1
    first = arr[0]
    for i in range(1, len(arr)):
        if (arr[i] > first):
            second = first
            first = arr[i]
        elif (arr[i] < first):
            if second == -1 or second < arr[i]:
                second = arr[i]
    return [first, second]

print(getLargestAndSecondLargestElementV2([10, 10]))