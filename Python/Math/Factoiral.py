# to calculate factorial of a number usomg recursion

#T(n): O(n)
# S(n): O(1)
def factorial(num):
  fact = 1
  for n in range(2, num + 1):
    fact *= n
  return fact

# Recurrence Relation = T(n) = T(n-1) + θ(1)
# T(n) = θ(n)
# S(n) = θ(n)
def factorialRec(num):
  if num == 1: return 1
  return num * factorialRec(num - 1)

print(factorial(999))
print(factorialRec(999))