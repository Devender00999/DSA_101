# to use recursion to print values from N to 1

# i/p: 10
# o/p: 10, 9, 8, 7, 6, 5, 4, 3, 2, 1

# Recurrence Relation: T(n) = T(n - 1) + 1
# T(n): O(n)
# S(n): O(n)
def printNTo1(n):
    if (n == 0): return
    print(n)
    printNTo1(n - 1)

printNTo1(10)