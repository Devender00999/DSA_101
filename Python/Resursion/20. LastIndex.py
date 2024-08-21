# to find last index of a number

# i/p: 2, 3, 7, 8 ,4, 9, 0, 8, 3 num: 3
# o/p: 8

# Recurrence Relation: T(n) = T(n - 1) + θ(1)
# T(n): O(n)
# S(n): O(n)
def lastIndex(arr, idx, d):
    if idx == len(arr): return -1
    fiisa = lastIndex(arr, idx + 1, d)
    if (fiisa == -1 and arr[idx] == d): return idx
    return fiisa

print(lastIndex([2, 3, 7, 8 ,4, 9, 0, 8, 3], 0, 3))

li = []
