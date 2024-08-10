# to find factorial of a number using recursion

# i/p: 5
# o/p: 120

# Recurrence Relation: T(n) = T(n - 1) + 1
# T(n): O(n)
# S(n): O(n)
def factorial(n):
    if n < 1: return
    if (n == 1): return 1
    return n * factorial(n - 1)

print(factorial(-1))