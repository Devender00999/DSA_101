# to find maximum and values from given list
# i/p: 4, 8, 16, 2
# o/p: 0

# i/p: 16, 12, 8, 4
# o/p: 8

# T(n): O(n^2)
# S(n): O(1)
def findMaximumANDValueV1(li):
    maxValue = 0
    for i in range(len(li)):
        for j in range(i+1, len(li)):
            andRes = li[i] & li[j]
            if (andRes > maxValue):
                maxValue = andRes
    return maxValue



# 10000
# 01100
# 01000
# 00100
# idea is to iterate through maximum MSB to LSB and check if same bit is set in MSB and number then increase the counter, if two number matches then stop the counter and return MSB value

# T(n): O(n) => O(32n)
# S(n): O(1)
def findMaxANDValueV2(li):
    res = 0
    for bit in range(31, -1, -1):
        temp = res | 1 << bit
        count = 0
        for num in li:
            if (num & temp == temp): count += 1
            if (count >= 2): break
        if (count >= 2):
            res = temp
    return res


print(findMaxANDValueV2([16, 12, 8, 4]))
print(findMaximumANDValueV1([16, 12, 8, 4]))

