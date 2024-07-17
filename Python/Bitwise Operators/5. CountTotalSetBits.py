# You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).
# i/p: N = 4
# o/p: 5
# 0001
# 0010
# 0011
# 0100
li = []
li.append(0)
for i in range(1, 256):
   li.append(li[i & i - 1] + 1)

def countSetBits(num):
   return li[num & 255]  + li[(num >> 8) & 255] + li[(num >> 16) & 255] + li[(num >> 24) & 255]

# T(n): O(n) with some precalculation
# S(n): O(1)
def countTotalSetBits(num):
   sum = 0
   for i in range(1, num + 1):
      sum += countSetBits(i)
   return sum
   
import math
# T(n): O(log(n)) with some precalculation
# S(n): O(log(n))
def countTotalSetBitsV2(num):
   if num == 0: return num
   x = math.floor(math.log2(num))
   powerOf2x = int(math.pow(2, x))
   return (powerOf2x >> 1) * x + (num - powerOf2x + 1) + countTotalSetBitsV2(num - powerOf2x)

print(countTotalSetBitsV2(10))
print(countTotalSetBits(10))