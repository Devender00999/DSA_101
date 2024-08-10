# to find sum of digits using recursion

# i/p: 1234
# o/p: 10

# i/p: 9987
# o/p: 33

# d: number of digits in n
# Recurrence Relation = T(n) = T(n / 10) + θ(1)
# T(n): θ(d)
# S(n): θ(d)
def sumOfDigits(n):
    if (n <= 0):
        return 0
    lastDigit = n % 10
    return lastDigit + sumOfDigits(n // 10)

print(sumOfDigits(9987))