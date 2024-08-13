# to generate all subset of a string
# i/p: AB
# o/p: "", "A", "B", "AB"

# i/p: ABC
# o/p: "", "A", "B", "C", "AB", "AC", "BC", "ABC"

# idea is to start with empty string and use recursion to print each value by include it once and skip it once
#            ""
#        /        \
#       a          ""            a
#     /   \       /   \ 
#    ab    a     b     ""        b
#   /  \   / \  /  \  /  \ 
#  abc ab ac  a bc  b c   ""     c
 

# Recurrence Relation: T(n) = T(n + 1) + T(n + 1)
# T(n): O(2^n)
# S(n): O(n)
def generateSubset(s, curr = '', i = 0):
    if (i == len(s)):
        print(curr)
        return
    generateSubset(s, curr, i + 1)
    generateSubset(s, curr + s[i], i + 1)
generateSubset("ABC")

# to return power set of a string as a list
# Recurrence Relation: T(n) = T(n + 1) + T(n + 1)
# T(n): O(2^n)
# S(n): O(n)
def powerSet(s, curr="", set = [], i = 0):
    if (i == len(s)):
        set.append(curr)
        return
    powerSet(s, curr,set, i + 1)
    powerSet(s, curr + s[i], set, i + 1)
    set.sort()
    return set

print(powerSet('ABC'))