# to check if given number is lucky or not(a lucky number is a number that remains if we start removing every, 2nd, 3rd...nth number)

# using loop

# T(n): O(n ^ 2)
# S(b): O(n)
def printLuckyNumberLoop(n):
    k = 1
    arr = []
    for i in range(n):
        arr.append(i + 1)

    while k < len(arr):
        i = k
        while i < len(arr):
            arr.pop(i)
            i += k
        k += 1
    try:
        arr.index(n)
        return True
    except:
        return False

# Recurrence Relation: T(n) = T(n - n / c) 
# T(n): O(sqrt(n))
# S(b): O(sqrt(n))
def printLuckyNumber(pos, pas):
    if pos < pas:
        return True
    if pos % pas == 0:
        return False
    return printLuckyNumber(pos - (pos // pas), pas + 1)

print(printLuckyNumber(34534, 2))
print(printLuckyNumberLoop(34534))