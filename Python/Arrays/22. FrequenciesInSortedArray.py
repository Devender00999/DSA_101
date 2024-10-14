# to print frequencies of all the elements present in a sorted array
# i/p: 10, 10, 10, 25, 30, 30
# o/p: 10 3
#      25 1
#      30 2 


# Idea is to traverse array from 1 to N and keeping track of frequency starting from 1. 
# if arr[i] != arr[i - 1] then printing frequency and reseting frequency 
# at last printing the frequncy of the last element.

# T(n): O(n)
# S(n): O(1)
def printFrequencies(arr):
    n = len(arr)
    if (n == 0): return
    freq = 1
    for i in range(1, n):
        if (arr[i] == arr[i - 1]):
            freq += 1
        else:
            print(arr[i - 1], freq)
            freq = 1
    # if (arr[n - 2] == arr[n - 1]):
    #     freq += 1
    print(arr[n - 1], freq)

# T(n): O(n)
# S(n): O(1)
def printFrequencies(arr):
    n = len(arr)
    i = 1
    freq = 1
    if n == 0: return
    while i < n:
        while (i < n and arr[i] == arr[i - 1]):
            freq += 1
            i += 1
        print(arr[i - 1], freq)
        i+= 1
        freq = 1
    if n == 1 or arr[n - 1] != arr[n - 2]:
        print(arr[n - 1], freq)




# arr = [10, 10, 10, 25, 30, 30]
arr = [10, 10, 10, 10, 20, 20, 30]
# arr = [10, 20, 30, 40]
# arr= [1, 1, 1, 2, 2, 3]
# arr =  [1, 1, 1, 2, 2, 2] 

printFrequencies(arr)