# to print path to go from 1,1 to m,n in a mxn maze

# Recurrence Relation: T(n): T(m - 1, n) + T(m, n - 1) 
# T(n): O(2^(m + n))
# S(n): O(m + n)

def printMazePath(s, d,m, n, ans):
    if (s == m and d == n):
        print(ans)
        return
    # if (s > m or d > n): return
    # moving to vertical direction
    if (s <=m ):
        printMazePath(s + 1, d, m, n, ans + "v")

    # moving to horizontal direction
    if (d <= n):
        printMazePath(s, d + 1, m, n, ans + "h")

printMazePath(1,1,8,0, "")