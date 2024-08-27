# to print all the combination of old mobile keypad keys

# i/p: 3, 7
# o/p: ug, uh, ui, vg, vh, vi

# Recurrence Relation:  T(n) = k * T(n-1) + O(k) 
# T(n): O(4^n)
# S(n): O(n)

keypad = [".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"]
def keypadCombination(keys):
    if len(keys) == 0:
        return [""]
    subKeys = keypadCombination(keys[1:])
    comb = []
    for key in keypad[int(keys[0])]:
        for subKey in subKeys:
            comb.append(key + subKey) 
    return comb
        
print(keypadCombination('10'))