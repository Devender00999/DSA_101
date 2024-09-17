def fun(n):
    if n <= 1:
        return 1
    if n % 2 == 0:
        return fun(n//2)
    return fun(n//2) + fun(n//2 + 1)


def foo(n, r):
    if n > 0: return n % r + foo(n // r, r)
    return 0

def printVal(n):
    if (n > 4000):
        return
    print(n)
    printVal(2 * n)
    print(n)

printVal(1000)

