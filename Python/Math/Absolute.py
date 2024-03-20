# T(n): O(1)
# S(n): O(1)
def absolute(num):
  return -num if num < 0 else num

print(absolute(10000))