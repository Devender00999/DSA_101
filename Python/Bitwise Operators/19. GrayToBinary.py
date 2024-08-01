# to convert a number from gray code to equavalent binary decimal
# i/p: 7  => 100
# o/p: 4  => 111

# idea is to make a list of all gray digits of the number then convert that to binary by using xor logic.
# T(n): O(log(n))
# S(n): O(log(n))
def convertGrayToBinary(n):
    binLi = []
    while (n > 0): 
        binLi.insert(0, n % 2)
        n >>= 1
    
    grayLi = []
    for i in range(len(binLi)):
        if (i == 0):
            grayLi.append(binLi[i])
            # pass
        else:
            grayLi.append(grayLi[i - 1] ^ binLi[i])
    grayNum = 0
    idx = 0
    for i in range(len(grayLi) - 1, -1, -1):
        if (i > 0):
            grayNum += grayLi[idx] * (2 << (i - 1))
        else:
            grayNum += grayLi[idx] * 1
        idx += 1
    return grayNum

print(convertGrayToBinary(4))
