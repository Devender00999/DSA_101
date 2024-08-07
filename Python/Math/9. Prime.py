# a prime number is a number which has only two divisors 
# ex. 13, has 1 and 13 as divisor; 101, has only 1 and 101 as divisor

# naive solution
# T(n): O(n)
# S(n): O(1)
def isPrime(num):
   if num <= 1: return False
   for i in range(2, num):
      if num % i == 0:
         return False
   return True

# efficient solution
# idea: divisors always apears in pairs
# ex. 30: (1,30), (2, 15), (3, 10), (5, 6); 25: (1,25), (5, 5)
# T(n): O(sqrt(n))
# S(n): O(1)
import math
def isPrimeV2(num):
  if num <= 1: return False
  for i in range(2, int(math.sqrt(num) + 1)):
    if (num % i == 0):
      return False
  return True


# more efficient solution
# idea: we can save many iterations for n by checking if n % 2 == 0 and n % 3 == 0
# T(n): O(sqrt(n))
# S(n): O(1)
import math
def isPrimeV3(N): 
   if (N <= 1): return False
   if (N == 2 or N == 3): return True
   if (N % 2 == 0 or N % 3 == 0): return False
   for i in range(5, int(math.sqrt(N)) + 1, 6):
      if ((N % i == 0) or N % (i + 2) == 0):
         return False
   return True


# print(isPrime(1000007))
# print(isPrimeV2(1000007))
# print(isPrimeV3(1000007))