# to print zig zag pattern
# i/p: 1
# o/p: 1 1 1

# i/p: 2 
# o/p: 2 1 1 1 2 1 1 1 2

# Recurrence Relation: T(n) = 2T(n - 1) + θ(1)
# T(n): O(2^n)
# S(n): O(n)
def printZigZag(n):
    if (n == 0): return
    print(n, end=" ") # pre order
    printZigZag(n - 1)
    print(n, end=" ") # in order
    printZigZag(n - 1)
    print(n, end=" ") # post post order

printZigZag(10)
print()
