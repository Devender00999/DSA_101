# to print numbers from n to 1 and 1 to n

# i/p: 5
# o/p: 5 4 3 2 1 1 2 3 4 5

# recurrence relation: T(n) = 2 + T(n - 1) + 2
# T(n): O(n)
# S(n): O(n)
def pdi(n):
    if (n == 0): return
    print(n)
    pdi(n - 1)
    print(n)
    
pdi(10)