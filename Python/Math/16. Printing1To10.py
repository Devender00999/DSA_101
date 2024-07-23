# to print numbers from 1 to n and n to 1
# i/p: no input
# o/p: 1 to n or n to 1

def print1To10(num):
   # base case
   if (num == 0):
      return
      
   # recursive case to subtract number each time until it is 0
   print1To10(num - 1)

   # printing number
   print(num)

def print10To1(num):
   # base case
   if (num == 0):
      return
   
   # printing number
   print(num)

   # recursive case to subtract number each time until it is 0
   print1To10(num - 1)

# to print 1 to 10
print1To10(10)
print('\n')

# to print 10 to 1
print10To1(10)