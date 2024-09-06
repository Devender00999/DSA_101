# josephus problem

# Recurrence Relation: T(n) = T(n - 1)
# T(n): O(n)
# S(n): O(n)
def josephusProblem(n, k):
    if (n == 1):
        return 0
    pistol = josephusProblem(n - 1, k)
    return (pistol + k) % n
print(josephusProblem(8, 3))