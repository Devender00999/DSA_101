# to print encoding of string where 1: a, 2: b, 3: c... 25: y, 26: z

# i/p: 123
# o/p: abc, aw, lc

# i/p: 993
# o/p: iic

# i/p: 303
# o/p: no output

# Recurrence Relation: T(n) = T(n - 1) + T(n - 2)
# T(n): O(2^n)
# S(n): O(n)

encode = ["", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"]
def printEncoding(st, ans): 
    if (len(st) == 0): 
        print(ans)
        return
    elif len(st) == 1:
        if (st[0] == '0'):
            return
        else:
            ans = ans + encode[int(st[0])]
            print(ans)
    else:
        if (st[0] == '0'):
            return 
        else:
            printEncoding(st[1:], ans + encode[int(st[0])])
        if (int(st[:2]) <= 26):
            printEncoding(st[2:], ans + encode[int(st[:2])])
        
# Recurrence Relation: T(n) = T(n - 1) + T(n - 2)
# T(n): O(2^n)
# S(n): O(n)
def printEncodingV2(st, ans):
    if (len(st) == 0):
        print(ans)
        return
    
    if (st[0] == '0'):
        return
    oneChar = int(st[0])
    twoChar = int(st[:2])
    printEncoding(st[1:], ans + encode[oneChar])
    if (twoChar <= 26 and (len(st[:2]) > 1)):
        printEncoding(st[2:], ans + encode[twoChar])

printEncoding('103','')
printEncodingV2('103','')