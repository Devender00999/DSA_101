# to find the maxium number of pieces we can cut a rope with using given length

# i/p: n = 23, a = 12, b = 9, c = 11
# o/p: 2

# i/p: n  = 5, a = 2, b = 5, c = 1
# o/p: 5

# Recurrence Relation T(n): max(T(n - a) + T(n - b) + T(n - c)) +  θ(1)
# T(n): O(3^n)
# S(n): O(n)
def getMaxPieces(n, a, b, c):
    if (n == 0): return 0
    if n < 0: return -1
    res = max(getMaxPieces(n - a, a, b, c), getMaxPieces(n - b, a, b, c), getMaxPieces(n - c, a, b, c))
    if (res == -1):return -1
    return res + 1

print(getMaxPieces(23, 11, 12, 9))
print(getMaxPieces(9, 2, 2, 2))