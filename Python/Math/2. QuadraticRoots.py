import math

# T(n): O(1)
# S(n): O(1)
def quadraticRoots(a, b, c):
   d = b * b - (4 * a * c)
   if (d < 0):
      print('Imaginary roots')
   else: 
      root1 = math.floor(-b + math.sqrt(d))// (2 * a)
      root2 = math.floor(-b - math.sqrt(d))// (2 * a)
      print(root1, root2)

# T(n): O(1)
# S(n): O(1)
def quadraticRootsV2(self, a : int, b : int , c:int ) -> List[int]:
   # code here
   li = []
   d = b * b - (4 * a * c)
   if (d < 0):
      li.append(-1)
   else: 
      root1 = math.floor((-b + math.sqrt(d))/ (2 * a))
      root2 = math.floor((-b - math.sqrt(d)) / (2 * a))
      li.append(root1)
      li.append(root2)
      li.sort(reverse=True)
   return li
quadraticRoots(1,-7, 12)