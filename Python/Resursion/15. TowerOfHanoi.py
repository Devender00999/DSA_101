# to print the instructions to solve tower of hanoi

# i/p: 3
# o/p:
#      Move Disk 1 From A to B
#      Move Disk 2 From A to C
#      Move Disk 1 From B to C
#      Move Disk 3 From A to B
#      Move Disk 1 From C to A
#      Move Disk 2 From C to B
#      Move Disk 1 From A to B

# Recurrence Relation: T(n) = 2T(n - 1) + θ(1)
# T(n): O(2^n)
# S(n): (n)
def towerOfHanoi(n, a, b, c):
    if n == 0:
        return
    towerOfHanoi(n - 1, a, c, b)
    print("Move Disk", n, "From", a, "to", b)
    towerOfHanoi(n - 1, c, b, a)

towerOfHanoi(3, 'A', "B", "C")