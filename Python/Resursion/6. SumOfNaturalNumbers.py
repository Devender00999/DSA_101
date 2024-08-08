# to find the sum of natural numbers until n

# i/p: 3
# o/p: 6 => 1 + 2 + 3

# Recurrence Relation = T(n) = T(n - 1) + 1
# T(n): O(n)
# S(n): O(n)
def sumOfNaturalNumber(n):
    if (n == 1): return 1
    return n + sumOfNaturalNumber(n - 1)

print(sumOfNaturalNumber(10))