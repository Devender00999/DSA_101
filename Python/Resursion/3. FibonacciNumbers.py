# to find nth fibonacci number
# i/p: 1
# o/p: 1

# i/p: 20
# o/p: 6765

# recurrence relation: T(n) = T(n-1) + T(n - 2) + 1 
# T(n): O(2^n)
# 
def findNthFibonacci(n):
    if (n == 0): return 0
    if (n == 1 ): return 1
    else: 
        return findNthFibonacci(n - 1) + findNthFibonacci(n - 2)

print(findNthFibonacci(4))


