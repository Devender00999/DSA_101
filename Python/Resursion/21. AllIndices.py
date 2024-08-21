# to find and return all indices of a number

# i/p: 2, 3, 7, 8 ,4, 9, 0, 8, 3 num: 3
# o/p: [1, 8]

# i/p: 2, 3, 7, 8 ,4, 9, 0, 8, 3 num: 8
# o/p: [3, 7]

# Recurrence Relation: T(n) = T(n - 1) + θ(1)
# T(n): O(n)
# S(n): O(n)
def  allIndices(arr, idx, d, fsf):
    if idx == len(arr): 
        if (fsf == 0): return []
        return [None] * fsf
    if (arr[idx] == d): fsf += 1
    farr =  allIndices(arr, idx + 1, d, fsf)
    if arr[idx] == d:
        farr[fsf - 1] = idx
        fsf = fsf - 1
        return farr
    else: return farr

# Recurrence Relation: T(n) = T(n - 1) + θ(1)
# T(n): O(n)
# S(n): O(n)
def allIndicesV2(arr, idx,d, fsf):
    if idx == len(arr):
        return [None] * fsf
    if arr[idx] == d: 
        iarr = allIndicesV2(arr, idx + 1, d, fsf + 1)
        iarr[fsf] = idx
        return iarr
    else:
        iarr = allIndicesV2(arr, idx + 1, d, fsf)
        return iarr