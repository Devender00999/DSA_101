# to count the numbers of trailing zero in factorial of a number
# ex. 5! => 1 x 2 x 3 x 4 x 5 => 120 = 1

# T(n): Θ(log(n))
# S(n): Θ(1)
def countTrailingZeroOfFactiorial(num):
   i = 5
   count = 0
   while( i <= num):
      count += num//i
      i *= 5
   return count

print (countTrailingZeroOfFactiorial(75))
