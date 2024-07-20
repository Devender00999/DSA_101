# to count the number of bits needed to be flipped to convert A to B.

# idea is to iterate through each bit if it is not same then increament

# T(n): O(log(max(m, n)))
# S(n): O(1)
def findBitDifferenceV1(m, n):
   bitsFlipped = 0
   while(m != 0 or n != 0):
      if (m & 1 != n & 1):
         bitsFlipped += 1
      m = m >> 1
      n = n >> 1
   return bitsFlipped

# idea: instead of iterating through each number we can find xor and iterate though it's bits
def findBitDifferenceV2(m, n):
   bitsFlipped = 0
   xor = m ^ n
   while(xor != 0):
      if (xor & 1):
         bitsFlipped += 1
      xor = xor >> 1
   return bitsFlipped

print(findBitDifferenceV1(10, 12))
print(findBitDifferenceV2(10, 12))