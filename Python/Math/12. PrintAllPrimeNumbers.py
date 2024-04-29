import math

import math
def isPrime(N): 
   if (N <= 1): return False
   if (N == 2 or N == 3): return True
   if (N % 2 == 0 or N % 3 == 0): return False
   for i in range(5, int(math.sqrt(N)) + 1, 6):
      if ((N % i == 0) or N % (i + 2) == 0):
         return False
   return True


# T(n): O(n * sqrt(n))
# S(n): O(1)
def printAllPrimeNumbers(N):
   for i in range(2, N + 1):
      if (isPrime(i) == True):
         print(i, end=" ")
   print()

# T(n): O(n*log(log(n)))
# S(n): O(1)
def seiveOfEras(N):
   isPrime = []
   for i in range(0, N + 1):
      isPrime.append(True)

   for i in range(2, int(math.sqrt(N)) + 1):
      if (isPrime[i]):
         for j in range(2 * i, N + 1):
            if (j % i == 0):
               isPrime[j] = False
   
   for i in range(2, N + 1):
      if (isPrime[i]):
         print(i, end=" ")
   print()

# T(n): O(n*log(log(n)))
# S(n): O(1)
def seiveOfErasV2(N):
   isPrime = []
   for i in range(0, N + 1):
      isPrime.append(True)

   for i in range(2, N + 1):
      if (isPrime[i]):
         print(i, end=" ")
         for j in range(i * i, N + 1):
            if (j % i == 0):
               isPrime[j] = False

   print()
seiveOfEras(1000)
seiveOfErasV2(1000)