# to check if Kth bit is set or not
# i/p num = 5, k = 3
# o/p True

# T(n): O(k)
# S(n): O(1)
def isKthBitSetV1(num, k):
   x = 1
   for i in range(k - 1) :
      x = x * 2
   result = num & x
   return True if result != 0 else False
   
   
# T(n): O(k)
# S(n): O(1)
def isKthBitSetV2(num, k):
   for i in range(k - 1) :
      num //= 2
   result = num & 1
   return True if result != 0 else False


# T(n): O(1)
# S(n): O(1)
def isKthBitSetV3(num, k):
   result = num & (1 << (k - 1))
   return True if result != 0 else False

print(isKthBitSetV1(112, 8))
print(isKthBitSetV2(112, 8))
print(isKthBitSetV3(112, 8))