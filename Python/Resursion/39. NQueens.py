# N Queens problem of chess board

# Recurrence Relation: T(n) = n * T(n - 1)
# T(n): O(n!)
# S(n): O(n ^ 2)
def printNQueens(chess, qsf, row):
    if (row == len(chess)):
        print("{qsf}.".format(qsf=qsf))
        return
    for col in range(len(chess)):
        if (isSafePlace(chess, row, col)):
            chess[row][col] = 1
            printNQueens(chess, "{qsf}{row}-{col}, ".format(qsf = qsf, row = row, col = col), row + 1)
            chess[row][col] = 0

    # return

def isSafePlace(chess, row, col):
    # to check 
    i = row - 1
    j = col
    while i >= 0:
        if chess[i][j] == 1:
            return False 
        i = i - 1

    i = row - 1
    j = col - 1
    while (i >= 0 and j >= 0):
        if chess[i][j] == 1: 
            return False
        i -= 1
        j -= 1

    i = row - 1
    j = col + 1
    while (i >= 0 and j <= len(chess) - 1):
        if chess[i][j] == 1: 
            return False
        i -= 1
        j += 1

    return True




chess = []

m = 4
for i in range(m):
    row = []
    for j in range(m):
        row.append(0)
    chess.append(row)

printNQueens(chess, '', 0)
