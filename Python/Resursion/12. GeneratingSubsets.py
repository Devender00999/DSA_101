# to generate all subset of a string
# i/p: AB
# o/p: "", "A", "B", "AB"

# i/p: ABC
# o/p: "", "A", "B", "C", "AB", "AC", "BC", "ABC"

# Recurrence Relation: T(n) = T(n + 1) + T(n + 1)
# T(n): O(2^n)
# S(n): O(n)
def generateSubset(s, curr = "", i = 0):
    if (i == len(s)):
        print(curr)
        return
    generateSubset(s, curr, i + 1 )     
    generateSubset(s, curr + s[i], i + 1 )     

generateSubset("ABC")