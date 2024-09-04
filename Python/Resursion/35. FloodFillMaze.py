# we have a m x n maze where some of the paths are blocked. we have to print all the paths from 1,1 to m,n by going top, bottom, right and left. we cannot go on a cell twice

# Recurrence Relation: T(r, c) = T(r + 1, c) + T(r - 1, c) + T(r, c + 1) + T(r, c - 1)
# T(n): O(4^n)
# S(n): O(m*n)
def printFloodFill(maze, row, col, psf, visited):
    if (row == len(maze) or row < 0 or col == len(maze[0]) or col < 0 or maze[row][col] == 1) or visited[row][col] == True:
        return
    if (row == len(maze) - 1 and col == len(maze[0]) - 1):
        print(psf)
        return

    visited[row][col] = True
    # top 
    printFloodFill(maze, row - 1, col, psf + "t", visited)
    # bottom
    printFloodFill(maze, row + 1, col, psf + "d", visited)
    # left 
    printFloodFill(maze, row, col - 1, psf + "l", visited)
    # top 
    printFloodFill(maze, row, col + 1, psf + 'r', visited)
    visited[row][col] = False

# printFloodFill([[0,1,0,0,0], [0,1,0,1,0], [0,0,0,1,0],[1,0,1,1,0], [1,0,0,0,0]],0, 0, "", [[False, False, False, False, False], [False, False, False, False, False], [False, False, False, False, False], [False, False, False, False, False], [False, False, False, False, False]])

def __main__():
    m = int(input())
    n = int(input())
    
    maze = []
    for i in range(m):
        row = list(map(lambda x: int(x),input().split(' ')))
        maze.append(row)

    visited = []
    for i in range(m):
        row = []
        for j in range(n):
            row.append(False)
        visited.append(row)
    printFloodFill(maze, 0, 0, "", visited)


__main__()

# 5
# 5
# 0 1 0 0 0
# 0 1 0 1 0
# 0 0 0 1 0
# 1 0 1 1 0
# 1 0 0 0 0


# 4
# 3
# 0 1 1
# 0 0 1
# 1 0 0
# 0 1 0