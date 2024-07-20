# to find two numbers that occurs odd times
# i/p: 3,4,3,4,5,4,4,6,7,7
# o/p: 5, 6


# Idea is to count each occurence of a number if it is odd then it is odd occuring number.
# T(n): θ(n) n = length of list
# S(n): θ(1)
def countNumbers(li, num):
   count = 0
   for i in li:
      if i == num:
         count += 1
   return count

# T(n): O(n^2)
# S(n): θ(1)
def twoOddOccuringV1(numList = []): 
   for i in numList:
      if (countNumbers(numList, i) % 2 != 0):
         print(i)
   return -1
# 1, 1, 2, 3
# 001

# 8, 10, 5, 5, 3, 3
# Idea is to finding xor of all number 
# now this number can divide entire array into two section by getting only last set bit of xor of all numbers    
# T(n): O(n)
# S(n): O(1)
def twoOddOccuringV2(numList = []):
   xorOfList = numList[0]
   for i in numList[1:]:
      xorOfList ^= i
   k = (xorOfList & -xorOfList)
   res1 = 0; res2 = 0
   for i in numList:
      if ((k & i) != 0):
         res1 ^= i
      else:
         res2 ^= i
   print(res1, res2)
   
twoOddOccuringV2([3,4,3,4,5,4,4,6,7,7])
twoOddOccuringV2([5, 6, 10, 6, 10, 6, 3, 3])
twoOddOccuringV2([1, 1, 2, 3])
twoOddOccuringV2([2, 1, 2, 1, 2, 10])


