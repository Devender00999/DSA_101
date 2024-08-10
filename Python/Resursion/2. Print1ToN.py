# to use recursion to print values from 1 to N

# i/p: 10
# o/p: 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

# Recurrence Relation: T(n) = T(n - 1) + 1
# T(n): O(n)
# S(n): O(n)
def print1ToN(n):
    if (n == 0): return
    print1ToN(n - 1)
    print(n)
    

print1ToN(10)