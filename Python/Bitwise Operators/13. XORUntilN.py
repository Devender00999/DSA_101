# to find xor of numbers from 1 to n
# i/p: 6
# o/p: 7
# explaination: 1 ^ 2 ^ 3 ^ 4 ^ 5 ^ 6  = 7

# idea is to run a loop from 1 to n and xor each number
def findXORUntilNV1(n):
    xor = 0
    for i in range(1, n + 1):
        xor ^= i
    return xor
# num  ^ before num
# 0000   0000 => 0
# 0001 ^ 0000 => 1
# 0010 ^ 0001 => 3
# 0011 ^ 0011 => 0
# 0100 ^ 0000 => 4
# 0101 ^ 0100 => 1
# 0110 ^ 0001 => 7
# 0111 ^ 0111 => 0
# 1000 ^ 0000 => 8
# 1001 ^ 1000 => 1
# 1010 ^ 0001 => 11
# 1011 ^ 1011 => 0
# 1100 ^ 0000 => 12
# 1101 ^ 1100 => 1
# 1110 ^ 0001 => 15
# 1111 ^ 1111 => 0
# 10000 ^ 00000 => 16
# 10001 ^ 10000 => 1
# 10010 ^ 00001 => 19
# 10011 ^ 10011 => 0
# 10101 ^ 00000 => 20

# T(n): O(1)
# S(n): O(1)


def findXORUntilNV2(n):
    if (n % 4 == 0):
        return n
    elif ((n-1) % 4 == 0):
        return 1
    elif (n + 1) % 4 == 0:
        return 0
    return n + 1

# T(n): O(1)
# S(n): O(1)


def finXORUntilNV3(n):
    if n % 4 == 0:
        return
    elif n % 4 == 1:
        return 1
    elif n % 4 == 2:
        return n
    else:
        return 0

# print(findXORUntilNV2(15))
