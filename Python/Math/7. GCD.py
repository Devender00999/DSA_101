# GCD or HCF of two number is biggest number that divides both numbers
# ex. 15, 12 GCD is 3


# T(n): O(min(num1, num2))
# S(n): O(1)
def findGCDv1(num1, num2):
   minimum = min(num1, num2)
   for i in range(minimum, 0, -1):
      if (num1 % i == 0 and num2 % i == 0):
         break
   return i

# T(n): O(min(num1, num2))
# S(n): O(min(num1, num2))
def findGCDv2(num1, num2):
   if num1 == num2: 
      return num1
   elif num1 > num2:
      return findGCDv2(num1 - num2, num2)
   else:
      return findGCDv2(num2 - num1, num1)


print(findGCDv1(12, 150))
print(findGCDv2(12, 150))