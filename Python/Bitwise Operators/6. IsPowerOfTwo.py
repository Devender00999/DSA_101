# to check if given number is a power of 2
# i/p: n = 4
# o/p: Yes

# i/p: n = 7
# o/p: No

# 4 100
# 7 111
# 2 010
# 10 1010
# 15 1111

# T(n): O(log(n))
# S(n): O(1)
def isPowerOfTwoV1(n):
   if n == 0: return False
   while (n != 1): 
      if n % 2 != 0:
         return False
      n /= 2
   return True

# a number is power of two than it has only 1 bit set
# T(n): O(log(n))
# S(n): O(1)
def isPowerOfTwoV2(n):
   if n == 0: return False
   noOfSetBits = 0
   while (n > 0):
      if (n & 1 != 0):
         noOfSetBits += 1
      n = n >> 1
   return noOfSetBits == 1


# 14:   1110
# 13: & 1101
#      -----
#       1100

# 16:   10000
# 15: & 01111
#      ------
#       00000

# Here we use brian kerningam algorithm 
# T(n): O(1)
# S(n): O(1)
def isPowerOfTwoV3(n):
   if n == 0: return False
   return (n & n - 1) == 0

print(isPowerOfTwoV1(0))
print(isPowerOfTwoV2(0))
print(isPowerOfTwoV3(0))

