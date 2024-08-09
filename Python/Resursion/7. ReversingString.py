# to find reverse of the given string

# i/p: hello
# o/p: olleh

# Recurrence Relation: T(n) = T(n - 1) + 1
# T(n): O(n)
# S(n): O(n)

def reverseOfString(st):
    if (len(st) == 0): return ''
    return st[len(st) - 1:] + reverseOfString(st[:len(st) - 1])

# Recurrence Relation: T(n) = T(n - 1) + 1
# T(n): O(n)
# S(n): O(n)
def reverseOfString(st):
    if (len(st) == 0): return st
    return reverseOfString(st[1:]) + st[0]

print(reverseOfString("hello world"))

