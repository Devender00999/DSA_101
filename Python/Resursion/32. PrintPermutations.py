# to print permutations of a given string

# i/p: abc
# o/p: abc, acb, bac, bca, cab, cba

# Recurrence Relation:  T(n) = n * T(n - 1) 
# T(n):  O(n!) 
# S(n):  O(n) 

def printPermutations(s, ans):
    if len(s) == 0:
        print(ans)
        return
    for i in range(0, len(s)):
        sub_str = s[0:i] + s[i + 1: len(s)]
        printPermutations(sub_str, ans + s[i])
printPermutations("abcd", "")