# to count all set bit of a numbers
# i/p 12 => 1100
# o/p 2

# T(n): O(log(n))
# S(n): O(1)
def getCountOfSetBits(num):
   count = 0
   while(num > 0):
      # if (num & 1 != 0):
      #    count += 1
      count = count + (num & 1)
      num >>= 1
   return count

# Brian Kernighan's algorithm n & n - 1 = last set bit becomes zero
# T(n): O(no. set bits)
# S(n): O(1)
def getCountOfSetBitsV2(num):
   count = 0
   while(num > 0):
      num = num & (num - 1)
      count = count + 1
   return count


lookupTable = []
lookupTable.append(0)
for i in range(1, 255 + 1):
   lookupTable.append(lookupTable[i & (i - 1)] + 1)

# T(n): O(1) with some precalculations
# S(n): O(1)
def getCountOfSetBitsV3(num):
   lookupTable[(num & 255)] + lookupTable[(num >> 8) & 255] + lookupTable[(num >> 16) & 255] + lookupTable[(num >> 24) & 255]

print(getCountOfSetBits(567567))
print(getCountOfSetBitsV2(567567))
print(getCountOfSetBitsV3(567567))