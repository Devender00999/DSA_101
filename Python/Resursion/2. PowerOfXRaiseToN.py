# to find power of x raise to n

# i/p: 5, 3
# o/p: 125

# Recurrence relation: T(n) = T(n - 1) + θ(1)
# T(n): O(n)
# S(n): O(n)
def powerLinear(x, n):
    if n == 0: return 1
    xnm1 = powerLinear(x, n - 1)
    xn = x * xnm1
    return xn

# Recurrence relation: T(n) = T(n/2) + θ(1)
# T(n): O(n)
# S(n): O(n)
def powerLog(x, n):
    if (n == 0): return 1
    xpnb2 = powerLinear(x, n//2)
    if (n % 2 == 0):
        return xpnb2 * xpnb2
    return xpnb2 * xpnb2 * x