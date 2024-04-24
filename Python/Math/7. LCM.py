#LCM of two number is the smallest number that divides both numbers
# ex LCM of 4, 6 is 12; LCM of 12, 15 is 60

# naive solution
# T(n): O(a * b)
# S(n): O(1)
def findLCM(a, b):
   res = max(a, b)
   while (True):
      if (res % a == 0 and res % b == 0):
         return res
      res += 1

# gcd of two numbers
def findGCD(a, b):
   if (b == 0):
      return a
   return findGCD(b, a % b)

# efficient solution
# based on a * b - gcd(a, b) * lcm(a, b)
def findLCMV2(a, b): 
   return (a*b) // findGCD(a, b)

print(findLCMV2(40, 15))