# to print subsequence of given string

# i/p: ab
# o/p: a, b, ab, ""

# i/p: abc
# o/p: "", a, b, c, ab, ac, bc, abc

# Recurrence Relation: T(n) = T(n - 1) + T(n - 1) + θ(n)
# T(n): O(2^n)
# S(n): O(n)
def printSubSequence(string, ans):
    if (len(string) == 0):
        print(ans)
        return
    printSubSequence(string[1:], ans)
    printSubSequence(string[1:], ans + string[0])

printSubSequence('abc', '')