# to check if two numbers are bitwize complement of each other or not
# i/p: 5, 2: 101, 010
# o/p: True

# i/p: 8, 9: 1000, 1001
# o/p: False

# T(n): O(1)
# S(n): O(1)
def isBitwizeComplement(a, b):
    return True if a & b == 0 else False


print(isBitwizeComplement(7, 8))