# to create a power set of a given set by using bitwise operators
# i/p: abc
# o/p: a, b, ab, c, ac, bc, abc

# idea is to use bitwise combination to print all powerset
#   cba
# 0 000 
# 1 001 
# 2 010
# 3 011
# 4 100
# 5 101
# 6 110
# 7 111

# T(n): O(n*2^n)
# S(n): O(1)
def printPowerSet(string: str):
   """
   str: input string
   return: void
   function prints all the combination of the input string
   """
   strLen = len(string)
   power = 1 << strLen

   # iterating for each combination
   for i in range(power):

      # printing the required combination
      for j in range(0, strLen):

         if (i & (1 << j)):
            print(string[j], end="")

      print()

printPowerSet('abc')