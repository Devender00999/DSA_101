# computing power of a number
# ex. 2, 2 = 4; 4,2 = 16

# T(n): O(power of number)
# S(n): O(1)
def computePower(x, n):
   if (x == 0): return 0
   if (n == 1): return 1
   res = 1
   for i in range(0, n):
      res *= x
   return res

# idea: x^2 = x * x
# x^3 = x^2 * x
# x^5 = x^2 * x^2 * x

# T(n): θ(log(n))
# S(n): θ(log(n))
def computePowerV2(x, n):
   if (x == 0): return 0
   if (n == 0): return 1
   res = computePowerV2(x, n//2)
   if (n % 2 == 0): return res * res
   else: return res * res * x

# T(n): θ(log(n))
# S(n): θ(1)
def computePowerV3(x, n):
   res = 1
   while n > 0:
      if (n % 2 != 0):
         res = res * x

      n //= 2
      x = x * x
   return res
print(computePowerV3(10, 2))