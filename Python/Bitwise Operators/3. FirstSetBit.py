# to return position of first set bit
# i/p 12 => 1100
# o/p 3

import math

# T(n): O(log(n))
# S(n): O(1)
def getFirstSetBit(num):
   x = 0
   while(num):
      if (num & 1 != 0):
         break
      num //= 2
      x += 1
   return x + 1 if num != 0 else 0


# T(n): O(log(n))
# S(n): O(1)
def getFirstSetBitV2(num):
   x = 0
   while(num):
      if (num & 1 != 0):
         break
      num >>= 1
      x += 1
   return x + 1 if num != 0 else 0

# n & ~(n - 1) will result in last bit set
# T(n): O(log(n))
# S(n): O(1)
def getFirstSetBitV3(num):
   if (num == 0): return 0
   result = math.ceil(math.log2(num& ~(num - 1))) + 1
   return result

