# to find the longest consecutive 1's Sequence

# i/p: 14: 1110
# o/p: 3

# idea is to right shift number until it becomes zero and check if remainder is 1 if it then increase the counter if it is 0 then set max as counter and reset counter to counter next set of bits.
# T(n): O(log(n))
# S(n): O(1)
def longestConsicutive1(n):
    counter = 0
    max = 0
    while (n > 0):
        rem = n % 2
        if (rem == 1):
            counter += 1
        else:
            if (counter > max):
                max = counter
            counter = 0
        n >>= 1
    if counter > max:
        max = counter
    return max

# idea is to use right shift operator to shift number perform & with n until it becomes 0
# T(n): O(log(n))
# S(1): O(1)
def longestConsecutiveOne(n):
    count = 0
    while (n > 0):
        n = n & n << 1
        count += 1
    return count

# example
# 1011110
# 0111100 => n << 1
# 0011100 =>  &n n << 1
# 0111000 => n << 1
# 0011000 => n & n << 1
# 0110000 => n << 1
# 0010000 => n & n << 1
# 0100000 => n << 1
# 0000000 => n & n << 1


print(longestConsecutiveOne(0b111011111))
