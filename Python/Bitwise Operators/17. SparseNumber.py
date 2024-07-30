# to check if a number is sparse(does not contains consecutive set bits) or not
# i/p: 2 => 10
# o/p: 1

# i/p: 3 => 11
# o/p: 0

# Idea is to count consecutive 1 bit by the logic we use to convert it to binary increment counter everytime a bit is set, if not reset the counter
# if counter is >= 2 return 0 else return 1
# T(n): O(log(n))
# S(n): O(1)
def isSparseV1(n):
    count = 0
    while (n > 0):
        if n % 2 == 1:
            count += 1
        else:
            count = 0
        if count >= 2:
            return 0
        n >>= 1
    return 1

# Idea is whenever we AND n with (n >> 1) it results in 0 if it does not contain consecutive 1.
# T(n): O(log(n))
# S(n): O(1)
def isSparseV2(n):
    return (n & (n >> 1)) == 0 if 1 else 0

for i in range(1, 10000):
    if isSparseV1(i) != isSparseV2(i):
        print('Failed')
print('Succeed')