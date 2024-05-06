# task is to find nth GP(Geometric Progression) Term
# i.e. A = 2, B = 3, N = 1 o/p = 2

import math

def nthGPTerm(A, B, N):
   cratio = B/A
   return math.floor(A * math.pow(cratio, N - 1))

print(nthGPTerm(-27, -78, 3))
