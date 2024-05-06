
# calculate sum of two numbers, if sum is too big then mod it by 10^9 + 7
# T(n): O(1)
# S(n): O(1)
def sumUnderModulo(self,a,b):
   m = 1000000007
   return ((a % m) + (b % m)) % m


# find the multiplication of a and b under modulo M (M as 109+7).
# T(n): O(1)
# S(n): O(1)
def multiplicationUnderModulo(self,a,b):
   m = 1000000007
   return ((a % m) * (b % m)) % m

# find the smallest modular multiplicative inverse of ‘a’ under modulo ‘m’. if it does not exist then return -1.
# T(n): O(m)
# S(n): O(1)
def modInverse(self,a,m):
   ##Your code here
   for i in range(1, m + 1):
      if ((a % m) * (i % m) % m) == 1:
            return i
   return -1