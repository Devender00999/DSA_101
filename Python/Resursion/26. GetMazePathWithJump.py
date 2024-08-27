# to find paths from 1,1 to m, n in a m x n maze with jumping to any steps and even diagonally.
# i/p: 3, 3
# o/p: 'h1h1v1v1', 'h1h1v2', 'h1v1h1v1', 'h1v1d1', 'h1d1v1', 'h2v1v1', 'h2v2', 'v1h1h1v1', 'v1h1d1', 'd1h1v1', 'd1d1', 'd2'

# i/p: 2, 2
# o/p: 'h1v1', 'd1'

# T(n): O(3^(m + n))
# S(n): O(3^(m + n) * (m + n))

def getMazePath(sr, sc, dr, dc):
    if sr == dr and sc == dc:
        return [""]
    if sr > dr or sc > dc:
        return []
    
    paths = []
    # horizontal paths
    for ms in range(1, dc - sc + 1 and (dr - sr + 1)):
        dPath = getMazePath(sr, sc + ms, dr, dc)
        for path in dPath:
            paths.append("h" + str(ms) + path)

    # vertical paths
    for ms in range(1, dr - sr + 1):
        dPath = getMazePath(sr + ms, sc, dr, dc)
        for path in dPath:
            paths.append("v" + str(ms) + path)

    # digonal paths
    for ms in range(1, (dc - sc + 1) and (dr - sr + 1)):
        dPath = getMazePath(sr + ms, sc + ms, dr, dc)
        for path in dPath:
            paths.append("d" + str(ms) + path)

    return paths
print(getMazePath(1,1,3, 3))