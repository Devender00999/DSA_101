# to count digits of a number
# i/p: 9843, o/p: 4
# i/p: 38, o/p: 2


# T(n): Θ(d)
# S(n): O(1)
# d = no. of digits
def count_digits(num):
   count = 0
   while (num > 0):
      num = num // 10
      count += 1
   return count

# T(n): Θ(1)
# S(n): O(1)
import math
def count_digits2(num):
   return math.floor(math.log10(num) + 1)

print(count_digits(1134534534592))
print(count_digits2(1134534534592))