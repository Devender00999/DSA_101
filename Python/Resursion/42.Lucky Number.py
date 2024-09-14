# to check if given number is lucky or not(a lucky number is a number that remains if we start removing every, 2nd, 3rd...nth number)

# using loop
def printLuckyNumber(n):
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
(print(printLuckyNumber(7)))