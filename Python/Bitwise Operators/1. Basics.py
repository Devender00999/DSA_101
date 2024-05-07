# T(n): O(1)
# S(n): O(1)
def setNthBit(num, n):
   if n <= 0: 
      print('n cannot be less than or 0')
      return
   return num | (1 << (n - 1))

# T(n): O(1)
# S(n): O(1)
def clearNthBit(num, n):
   if n <= 0: 
      print('n cannot be less than or 0')
      return
   return num & ~(1 << (n - 1))

# T(n): O(1)
# S(n): O(1)
def toggleNthBit(num, n):
   if n <= 0: 
      print('n cannot be less than or 0')
      return
   return num ^ (1 << (n - 1))

# T(n): O(1)
# S(n): O(1)
def isNthBitSet(num, n):
   if n <= 0: 
      print('n cannot be less than or 0')
      return
   return  True if num & (1 << (n - 1)) else False

# 1011
# 0101 : right shift 
# T(n): O(1)
# S(n): O(1)
def divideBy2(num):
   return num >> 1

# 01001
# 10010 : left shift 
# T(n): O(1)
# S(n): O(1)
def multiplyBy2(num):
   return num << 1

# T(n): O(log(n))
# S(n): O(1)
def log2(num):
   res = 0
   while (num > 1):
      res += 1
      num >>= 1
   return res

# i/p 1011, o/p: 0100
# 1011
# 0100
# T(n): O(1)
# S(n): O(1)
def flipBitsOfN(num):
   return ~num

# a = 101
# b = 111
# a ^= b = 101 ^ 111 = 010
# b ^ a =  010 ^ 101 = 111 = b
# a ^ b = 010 ^ 111 = 101 = a

# T(n): O(1)
# S(n): O(1)=
def swapNumbers(a, b):
   a ^= b
   b ^= a
   a ^= b
   return a, b

# i/p: 15, o/p: No
# i/p: 16, o/o: Yes
# 1111
# 1000
# T(n): O(log(n))
# S(n): O(1)
def countSetBits(num): 
   count = 0
   while (num > 0):
      if (num & 1 == 1):
         count += 1
      num >>= 1
   return count

# T(n): O(log(n))
# S(n): O(1)
def isPowerOf2(num):
   return True if countSetBits(num) == 1 else False

# If we subtract a number which is a power of 2 with 1 then all of it's unset bits after the only set bit become set and the set bit become unset. 
# For example, consider 4 ( Binary representation: 100) and 16(Binary representation: 10000), we get 3, 15 
# T(n): O(1)
# S(n): O(1)
def isPowerOf2V2(num):
   return True if (num & num - 1) == 0 else False

# i/p: 1010, o/p: 1000
# T(n): O(log(n))
# S(n): O(1)
import math
def findMostSignSetBit(num):
   pos = -1
   index = 0
   while (num > 0):
      if (num & 1 == 1):
         pos = index
      num >>= 1
      index += 1
   if (pos == -1): return pos
   return int(math.pow(2, pos))

# T(n): O(log(n))
# S(n): O(1)
def findMostSignSetBitV2(num):
   power = int(math.log2(num))
   return int(math.pow(2, power))

# T(n): O(n)
# S(n): O(1)
def xorFrom1ToN(n):
   xor = 1
   for i in range(2, n + 1):
      xor ^= i
   return xor

# Idea:
# Find the remainder of N by moduling it with 4.
# If rem = 0, then xor will be same as N.
# If rem = 1, then xor will be 1.
# If rem = 2, then xor will be N+1.
# If rem = 3 ,then xor will be 0.
# T(n): O(1)
# S(n): O(1)
def xorFrom1ToNV2(n):
   rem = n % 4
   if (rem == 0): return n
   if (rem == 1): return 1
   if (rem == 2): return n + 1
   if (rem == 3): return 0
print(xorFrom1ToNV2(10))