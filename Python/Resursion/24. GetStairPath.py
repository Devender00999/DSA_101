# to find path from nth stair to 0 by taking either 1, 2, or 3 steps at a time

# Recurrence Relation: T(n) = T(n - 1) + T(n - 2) + T(n - 3)
# T(n):  O(3^n) 
# S(n):  O(3^n * n) 
def getStairsPath(n):
    if (n == 0): return [""]
    if (n < 0): return []

    paths1 = getStairsPath(n - 1)
    paths2 = getStairsPath(n - 2)
    paths3 = getStairsPath(n - 3)
    paths  = []

    for path in paths1:
        paths.append("1"+ path)
    for path in paths2:
        paths.append("2"+ path)
    for path in paths3:
        paths.append("3"+ path)

    return paths

print(getStairsPath(3))