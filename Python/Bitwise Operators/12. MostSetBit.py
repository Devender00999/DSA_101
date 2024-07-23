# to print position of most set bit of a given number

# 1010 
# 0101
# 0010
# 0001

# 111
# 011
# 001

# idea is to use right shift operator until number becomes 0 and count all numbers

# T(n): O(log(n))
# S(n): O(1)
def mostSetBitPositionV1(n):
   pos = 0
   while (n > 0):
      pos += 1
      n = n >> 1
   return pos


# T(n): O(1)
# S(n): O(1)
import math
def mostSetBitPositionV2(n):
   if n == 0:
      return 0
   return int(math.log2(n)) + 1

print(mostSetBitPositionV2(1023343434))
print(mostSetBitPositionV1(1023343434))