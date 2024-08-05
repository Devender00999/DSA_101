# given a number and reverse of a number, we have to find number raise to the power until reverse (have to result module with 10^9 + 7)

# i/p: n: 2, r: 2
# o/p: 4

# i/p: n: 12, r: 21
# o/p: 864354781

# idea is to multiply n, r times
# T(n): O(r)
# S(n): O(1)
def powerOfNReverseV1(n, r):
    pow = 1
    for i in range(1, r + 1):
        pow *= n
    return pow % 1000000007


# idea is to multiply n, r times using recursion
# T(n): O(r)
# T(n): O(r)
def powerOfNReverseV2(n,r):
    mod = int(1e9 + 7)
    if r == 0:
        return 1
    ans = powerOfNReverseV2(n, r - 1)
    return ((ans % mod) * (n % mod)) % mod

def powerOfNReverseV2(n,r):
    mod = int(1e9 + 7)
    if r == 0:
        return 1
    ans = powerOfNReverseV2(n, r - 1)
    return ((ans % mod) * (n % mod)) % mod


# idea is n^2 = n^1 & n^1 and n^3 = n * n^1 * n^1
# T(n): O(log(r))
# S(n): log(r)
def powerOfNReverseV3(n, r):
    if r == 0: return 1
    if (r == 1):
        return n
    power = powerOfNReverseV3(n, r // 2)
    if (r % 2 == 0):
        return (power * power) % 1000000007
    else: return (power * power * n) % 1000000007

    


print(powerOfNReverseV1(12, 21))
print(powerOfNReverseV2(12, 21))
print(powerOfNReverseV2(12, 21))