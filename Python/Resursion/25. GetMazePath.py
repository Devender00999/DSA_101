# to find paths from 1,1 to m, n in a m x n maze
# i/p: 3, 3
# o/p: vhvh, vvhh, vhhv, hvhv, hhvv, hvvh

# i/p: 2, 2
# o/p: vh, hv

# Recurrence Relation: T(n) = T(sr + 1, sc) + T(sr, sc + 1) + θ(1) 
# T(n): O(2^(m + n))
# S(n): O(2^(m + n) * (m + n))

def getMazePath(sr, sc, dr, dc):
    if sr == dr and sc == dc:
        return [""]
    if sr > dr or sc > dc:
        return []
    vPaths = getMazePath(sr + 1, sc, dr, dc)
    hPaths = getMazePath(sr, sc + 1, dr, dc)
    paths = []

    for path in vPaths:
        paths.append("v" + path)
    for path in hPaths:
        paths.append("h" + path)
    return paths
print(getMazePath(1,1,3,3))