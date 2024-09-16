# josephus problem

# Recurrence Relation: T(n) = T(n - 1)
# T(n): O(n)
# S(n): O(n)
# with 0 indexed elements
def josephusProblem(n, k):
    if (n == 1):
        return 0
    pistol = josephusProblem(n - 1, k)
    return (pistol + k) % n

# Recurrence Relation: T(n) = T(n - 1)
# T(n): O(n)
# S(n): O(n)
# with index from 1
def josephus(n, k):
    if (n == 1):
        return 1
    else:
        return (josephus(n - 1, k) + k-1) % n + 1

print(josephus(3, 2))
