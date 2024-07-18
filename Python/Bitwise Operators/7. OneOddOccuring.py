# to find the only odd occuring number in list of numbers
# there will only one odd occuring number

# i/p: 8, 7, 7, 8, 8
# o/p: 8

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
def isOneOddOccuringV1(numList = []): 
   for i in numList:
      if (countNumbers(numList, i) % 2 != 0):
         return i
   return -1


# T(n): O(n)
# S(n): θ(1)
def isOneOddOccuringV2(numList = []): 
   oddNumber = numList[0]
   for i in numList[1:]:
      oddNumber ^= i
   return oddNumber
   

print(isOneOddOccuringV1([7, 3, 4, 3, 7, 7, 7]))
print(isOneOddOccuringV2([7, 3, 4, 3, 7, 7, 7]))
