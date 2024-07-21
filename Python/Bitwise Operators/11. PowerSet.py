# to create a power set of a given set by using bitwise operators
# i/p: abc
# o/p: a, b, ab, c, ac, bc, abc

# idea is to use bitwise combination to print all powerset

def printPowerSet(string: str):
   strLen = len(string)
   power = 2 << strLen - 1
   for i in range(0, power):
      for j in range(0, strLen):
         if i & (1 << j) != 0:
            print(string[j], end="")
      print()

printPowerSet('abc')