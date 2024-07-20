# to find the position of rightmost different bit in given two numbers
# i/p: 9, 11 => 1001, 1011 
# o/p: 2

# idea is to compare last bit of each numbers if it is diffrent then printing its position

# T(n): O(log(max(m, n)))
# S(n): O(1)
def rightMostDifferentBitV1(m, n):
   bitNumber = 1
   while(m != 0 or n != 0):
      if (m & 1 != n & 1):
         return bitNumber
      m = m >> 1
      n = n >> 1
      bitNumber += 1
   return -1

#   1011
#   1001
# ^ 0010

#   1011
#   0101
# ^ 1110
# idea is xor of two numbers will give a number which will have different number in each bits following property of xor.

# T(n): O(1)
# T(1): O(1)
import math
def rightMostDifferentBitV2(m, n):
   if m == n: return -1
   xor = m ^ n
   return int(math.log2(xor & -xor)) + 1

print(rightMostDifferentBitV1(11, 5))
print(rightMostDifferentBitV2(11, 5))