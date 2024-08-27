# to find subsequence of given string

# i/p: ab
# o/p: a, b, ab, ""

# i/p: abc
# o/p: "", a, b, c, ab, ac, bc, abc

# Recurrence Relation: T(n) = T(n-1) + O(2^{n-1})
# T(n): O(2^n)
# S(n): O(n)
def getSubSequence(string: str):
    if (len(string) == 0):
         return [""]
    subseq = []
    subseqnm1 = getSubSequence(string[1:])
    for i in subseqnm1:
         subseq.append(i)
         subseq.append(string[0] + i)
    return subseq
print(getSubSequence(''))