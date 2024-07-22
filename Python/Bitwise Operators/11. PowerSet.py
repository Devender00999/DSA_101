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
   strLen = len(string)
   power = 1 << strLen
   for i in range(power):
      for j in range(0, strLen):
         if (i & (1 << j) != 0):
            print(string[j], end="")
      print()


printPowerSet('ab')