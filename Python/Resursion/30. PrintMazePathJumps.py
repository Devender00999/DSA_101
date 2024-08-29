# to print path to go from 1,1 to m,n in a m x n maze with any jumps until m or n


# T(n): O(3^(max(m, n))
# S(n): O(max(m , n))
def printMazePath(sr, sc,dr, dc, ans):
    if (sr == dr and sc == dc):
        print(ans)
        return
    if (sr > dr or sc > dc): return

    # moving to vertical direction
    for ms in range(1, dr - sr + 1):
        printMazePath(sr + ms, sc, dr, dc, ans + "v"+str(ms))

    # moving to horizontal direction
    for ms in range(1, dc - sc + 1):
        printMazePath(sr, sc + ms, dr, dc, ans + "h" + str(ms))

    # moving to diagonal direction
    for ms in range(1, dr - sr + 1 and dc - sc + 1):
        printMazePath(sr + ms, sc + ms, dr, dc, ans + "d" + str(ms))

printMazePath(1,1,2,2, "")