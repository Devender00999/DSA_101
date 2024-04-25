# prime factors are factors of a number that are prime
# ex: 12: 2, 2, 3; 315: 3,3,5,7

# T(n): O(sqrt(n))
# S(n): 1
import math
def isPrime(N): 
   if (N <= 1): return False
   if (N == 2 or N == 3): return True
   if (N % 2 == 0 or N % 3 == 0): return False
   for i in range(5, int(math.sqrt(N))+1,6):
      if ((N % i == 0) or N % (i + 2) == 0):
         return False
   return True


# T(n): O(sqrt(n))
# S(n): 1
def primeFactors(N): 
   while (N != 1):
      if (isPrime(i)):
         if (N % i == 0):
            print(i, end=' ')
            N //= i
         else: 
            i += 1
   print()

# T(n): O(n*sqrt(n))
# S(n): 1
def primeFactorsV2(N):
   li = []
   for i in range(2, N + 1):
      if (isPrime(i)):
         x = i
         while(N % x == 0):
            li.append(i)
            x = x * i
   return li

# idea is every number > 1 can be represented as multiple of prime numbers
# ex: 12: 2x2x3; 40: 2 * 2 * 2 * 5;
# T(n): O(sqrt(n))
# S(n): 1
def primeFactorsV3(N): 
   if (N <= 1): return
   li = []
   for i in range(2, int(math.sqrt(N)) + 1):
      while (N % i == 0):
         li.append(i)
         N //= i
   if (N > 1):
      li.append(N)
   return li
   
def primeFactorsV4(N): 
   li = []
   if (N <= 1): return []
   while (N % 2 ==0):
      if 2 not in li: li.append(2)
      N //= 2

   while (N % 3 ==0):
      if 3 not in li: li.append(3)
      N //= 3
   
   for i in range(5, int(math.sqrt(N)) + 1, 6):
      while (N % i == 0):
            if i not in li: li.append(i)
            N //= i
      while (N % (i + 2) == 0):
            if i + 2 not in li: li.append(i + 2)
            N //= i + 2
   if (N > 1):
      if N not in li: li.append(N)
   return li

        

print(primeFactorsV4(1000000000007))
# primeFactors(100)
# primeFactorsV2(315)