# to find maximum element of the array using recursion

# i/p: 10, 20, 30, 40, 50
# o/p: 50

# Recurrence Relation: T(n): T(n + 1) + θ(1)
# T(n): O(n)
# S(n): O(n)
def maxOfArr(arr, idx = 0):
    if (idx == len(arr) - 1): return arr[idx]
    maxofElements = maxOfArr(arr, idx + 1)
    if maxofElements > arr[idx]:
        return maxofElements
    else:
        return arr[idx]

print(maxOfArr([400, 20, 30, 40, 50]))