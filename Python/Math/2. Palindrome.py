# palindrome number 
# i/p: 797, output: "YES"
# i/p: 34543, output: "YES"
# i/p: 34542, output: "NO"

# T(n)
# S(n)

import math
def isPalindrome(num):
   tempNum = num
   reverseNum = 0
   length = math.floor(math.log10(num) + 1)
   while (length > 0):
      lastDigit = tempNum % 10
      reverseNum += lastDigit * (10 ** (length - 1))
      tempNum //= 10 
      length -= 1

   return True if reverseNum == num else False


print(isPalindrome(34343))
print(isPalindrome(101))