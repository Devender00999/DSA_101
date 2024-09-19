# Description : We are given an Array of n integers, We are given q queries having indices l and r . We have to find out sum between the given range of indices.
# Input 
# [4, 5, 3, 2, 5]
# 3
# 0 3
# 2 4
# 1 3
# Output
# 14 (4+5+3+2)
# 10 (3+2+5)
# 10 (5+3+2)


# T(n): O(n)
# S(n): O(1)
def calculateSum(arr, l, r):
    sum = 0
    for i in range(l, r + 1):
        sum += arr[i]
    return sum

# T(n): O(q*n)
# S(n): O(1)
def rangeSum(arr, q, queries):
    for i in range(q):
        print(calculateSum(arr, queries[i][0], queries[i][1]))


# T(n): Max(O(n), O(q))
# S(n): O(n)
def rangeSumV2(arr, q, queries):
    sumArr = []
    sumArr.append(arr[0])
    for i in range(1, len(arr)):
        sumArr.append(arr[i] + sumArr[i - 1])
    
    for query in queries:
        l, r = query
        if l == 0:
            print(sumArr[r])
        else:
            print(sumArr[r] - sumArr[l - 1])

rangeSumV2([4, 5, 3, 2, 5], 3, [[0, 3], [2, 4], [1, 3]])