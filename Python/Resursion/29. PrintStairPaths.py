# to print stair paths to go from nth steps to 1 step using only 1, 2, 3 step at a time

# Recurrence Relation: T(n) = T(n - 1) + T(n - 2) + T(n - 3) + θ(1)
# T(n): O(3^n)
# S(n): O(n)
def printStairsPath(n, ans):
    if (n == 0): 
        print(ans)
        return
    if (n - 1 >= 0):
        printStairsPath(n - 1, ans + "1")
    if (n - 2 >= 0):
        printStairsPath(n - 2, ans + "2")
    if (n - 3 >= 0):
        printStairsPath(n - 3, ans + "3")

printStairsPath(4, "")