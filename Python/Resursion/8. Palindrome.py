# to check if given string is palindrome is nor not

# i/p: abba 
# o/p: Yes

# Recurrence Relation: T(n) = T(n - 2) + 1
# T(n): O(n)
# S(n): O(n)
# idea is to
# 1. return true if there's only one character
# 2. if first and last char of the string are equal then make recursive call with substring
def isPalindromeV1(astr):
    length = len(astr)
    if length <= 1:
        return 1
    res = astr[0] == astr[length - 1] and isPalindromeV1(astr[1:length - 1])
    return 1 if res else 0

# Recurrence Relation: T(n) = T(n - 2) + 1
# T(n): O(n)
# S(n): O(n)
def isPalindromeV2(string, start, end):
    if (start >= end):
        return True
    else: return string[start] == string[end] and isPalindromeV2(string, start +1, end - 1)

# Recurrence Relation: T(n) = T(n - 2) + 1
# T(n): O(n)
# S(n): O(n)
def isPalindromeV3(string, idx):
    if (idx > len(string)/2): return True
    return string[idx] == string[len(string) - idx - 1] and isPalindromeV3(string, idx + 1)
        
    
print(isPalindromeV1('malayalam'))
print(isPalindromeV2('malayalam', 0, 8))
print(isPalindromeV3('malayalam', 0))