def printNightTour(cells, move, r, c):
    if (r < 0 or c < 0 or r >= len(cells) or c >= len(cells) or cells[r][c] > 0):
        return
    elif (move == (len(cells) * len(cells))):
        cells[r][c] = move
        displayChessBoard(cells)
        cells[r][c] = 0
    cells[r][c] = move
    printNightTour(cells, move + 1, r - 2, c + 1)
    printNightTour(cells, move + 1, r - 1, c + 2)
    printNightTour(cells, move + 1, r + 1, c + 2)
    printNightTour(cells, move + 1, r + 2, c + 1)
    printNightTour(cells, move + 1, r + 2, c - 1)
    printNightTour(cells, move + 1, r + 1, c - 2)
    printNightTour(cells, move + 1, r - 1, c - 2)
    printNightTour(cells, move + 1, r - 2, c - 1)
    cells[r][c] = 0

    
def displayChessBoard(cells):
    for i in range(len(cells)):
        for j in range(len(cells)):
            print(cells[i][j], end=" ")
        print()

chess = []

m = 5
for i in range(m):
    row = []
    for j in range(m):
        row.append(0)
    chess.append(row)

printNightTour(chess, 1, 2, 2)

# displayChessBoard(chess)