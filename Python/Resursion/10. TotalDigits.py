# to count total digits of a number using recursion

# i/p: 1234
# o/p: 4

# i/p: 99999
# o/p: 5

# d: number of digits in n
# Recurrence Relation = T(n) = T(n / 10) + θ(1)
# T(n): O(log(n))
# S(n): O(log(n))
def countTotalDigits(n):
    if (n <= 0):  return 0
    return 1 + countTotalDigits(n // 10)

print(countTotalDigits(12345))