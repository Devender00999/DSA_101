# to find the first occurrence of a number in a list

# i/p: 2, 3, 7, 8 ,4, 9, 0, 8, 3 num: 8
# o/p: 3

# Recurrence Relation: T(n) = T(n - 1) + θ(1)
# T(n): O(n)
# S(n): O(n)
def firstIndex(arr, idx, d):
    if (idx == len(arr)): return -1

    fiisa = firstIndex(arr, idx + 1, d)

    if (arr[idx] == d):
        return idx
    else:
        return fiisa


# Recurrence Relation: T(n) = T(n - 1) + θ(1)
# T(n): O(n)
# S(n): O(n)    
def firstIndexV2(arr, idx, d):
    if (idx == len(arr)): return -1
    if (arr[idx] == d): return idx
    fiisa = firstIndexV2(arr, idx + 1, d)
    return fiisa


print(firstIndexV2([2, 3, 7, 8 ,4, 9, 0, 8, 0], 0, 0))