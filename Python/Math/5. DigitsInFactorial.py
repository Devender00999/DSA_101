import math

# To count digits in a factorial of a number
#T(n): O(n)
# S(n): O(1)
def digitsInFactorial(num):
  digits = 0
  for i in range(1, num + 1):
     digits += math.log10(i)
  return  math.floor(digits + 1)

print(digitsInFactorial(10))