# to convert a number in gray code equavalent binary
# i/p: 7  => 111
# o/p: 4  => 100

# idea is to make a list of all binary digits of the number then convert that to gray by using xor logic.

# T(n): O(log(n))
# S(n): O(1)
def convertBinaryToGrayV1(n):
    binLi = []
    while (n > 0): 
        binLi.insert(0, n % 2)
        n >>= 1
    
    grayLi = []

    for i in range(len(binLi)):
        if (i == 0):
            grayLi.insert(0, binLi[i])
        else:
            grayLi.insert(0, binLi[i] ^ binLi[i - 1])
    
    grayNum = 0
    for i in range(len(grayLi)):
        # print(i)
        if (i > 0):
            grayNum += grayLi[i] * (2 << (i - 1))
        else:
            grayNum += grayLi[i] * 1
    return grayNum

# idea is: right shifting a number and xor with number will convert it to gray equivalentwesw
# T(n): O(1)
# S(n): O(1)
def convertBinaryToGrayV2(n):
    return n ^ (n >> 1)
