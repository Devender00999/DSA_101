# to print all divisors in increasing order

import math

# T(n): O(n)
# S(n): O(1)
def allDivisors(n):
   for i in range(1, n + 1): 
      if (n % i == 0):
         print(i, end=" ")
   print()

# T(n): O(sqrt(n))
# S(n): O(1)
def allDivisorsV2(n):
   sqrtN = int(math.sqrt(n))
   for i in range(1, int(math.sqrt(n)) + 1): 
      if (n % i == 0):
         print(i, end=" ")
   for i in range(int(math.sqrt(n)) + 1, n + 1): 
      if (n % i == 0):
         print(i, end=" ")
   print()

allDivisorsV2(67)
allDivisors(67)