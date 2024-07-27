# to find maximum and values from given list
# i/p: 4, 8, 16, 2
# o/p: 0

# i/p: 16, 12, 8, 4
# o/p: 8 

# T(n): O(n^2)
# S(n): O(1)
def maximumANDValue(li):
    maxValue = 0
    for i in range(len(li)):
        for j in range(len(li)):
            if j != i:
                andRes = li[i] & li[j]
                if (andRes > maxValue):
                    maxValue = andRes
    return maxValue


print(maximumANDValue([4, 8, 16, 2]))
