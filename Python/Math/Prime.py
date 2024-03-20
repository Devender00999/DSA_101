# T(n): O(n)
# S(n): O(1)
def isPrime(num):
   if num <= 1: return False
   for i in range(2, num):
      if num % i == 0:
         return False
   return True


# T(n): O(sqrt(n))
# S(n): O(1)
import math
def isPrime2(num):
  if num <= 1: return False
  for i in range(2, int(math.sqrt(num))):
    if (num % i == 0):
      return False
  return True


print(isPrime(7000))
print(isPrime2(7000))