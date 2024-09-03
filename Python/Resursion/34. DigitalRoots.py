# You are given a number n. You need to find the digital root of n. DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.

# i/p: 99999
# o/p: 9 
# explaination 9 + 9 + 9 + 9 = 45 => 9

# Recurrence Relation: T(n) = T(n / 10) + log(n)
# T(n): O(log^2(n))
# S(n): O(log(n))
def findDigitalRoot(n):
    if (n < 10): return n
    digitalRoot = 0
    while n > 0:
        digitalRoot += n % 10
        n //= 10
    print(digitalRoot)
    if (digitalRoot >= 10):
       return findDigitalRoot(digitalRoot)
    return digitalRoot

print(findDigitalRoot(9999999999))