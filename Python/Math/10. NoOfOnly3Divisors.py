# finding how many numbers less than or equal to N have numbers of divisors exactly equal to 3
# ex: i/p = 6, o/p = 1 which is 4: (1,2,4); i/p = 10, o/p = 2 which are 4, 9 


# T(n): O(n)
# S(n): O(1)
def countDivisors(N):
   count = 1
   for i in range(2, N + 1):
      if (N % i == 0):
         count += 1
   return count

# T(n): O(n^2)
# S(n): O(1)
def noOfOnly3Divisors(N):
   count = 0
   for i in range(1, N+1):
      if (countDivisors(i) == 3):
         count+= 1
   return count

import math

def isPrime(N): 
   if (N <= 1): return False
   if (N == 2 or N == 3): return True
   if (N % 2 == 0 or N % 3 == 0): return False
   for i in range(5, int(math.sqrt(N)) + 1, 6):
      if ((N % i == 0) or N % (i + 2) == 0):
         return False
   return True


# No. of divisors in (4: 1, 2, 4), 9: 1, 3, 9
# T(n): O(n^2 * n^4)
# S(n): O(1)

def noOfOnly3DivisorsV2(N):
   count = 0
   for i in range(2, int(math.sqrt(N)) + 1): 
      if (isPrime(i)):
         count += 1
   return count

print(noOfOnly3DivisorsV2(454))