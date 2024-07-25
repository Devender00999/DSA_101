# to swap all even bits of a number with odd bits
# i/p n = 23 => 00010111

# o/p 43 =>     00101011

# i/p n = 2 => 10
# i/p 1 => 01


import math
# T(n): O(no. of bits)
# S(n): O(1)
# idea is to make a list using all bits of a number then swaping all odd even bits


def swapBitsV1(n):
    li = []
    while (n > 0):
        li.append(n % 2)
        n //= 2
    if (len(li) % 2 != 0):
        li.append(0)
    newLi = []
    for i in range(0, len(li), 2):
        newLi.append(li[i+1])
        newLi.append(li[i])
    swaped = 0
    for i in range(len(newLi)):
        swaped += int(math.pow(2, i) * newLi[i])
    return swaped


# T(n): O(1)
# S(n): O(1)


def swapBitsV2(n):
    oddBits = 0x55555555
    evenBits = 0xAAAAAAAA
    return ((n & evenBits) >> 1) | ((n & oddBits) << 1)
