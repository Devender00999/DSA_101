# to find nth fibonacci number
# i/p: 1
# o/p: 1

# i/p: 20
# o/p: 6765

# recurrence relation: T(n) = T(n-1) + T(n - 2) + 1 
# 
def findNthFibonacci(n):
    if (n == 1 or n == 2):
        return 1
    else: 
        return findNthFibonacci(n - 1) + findNthFibonacci(n - 2)

print(findNthFibonacci(8))


