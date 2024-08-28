# to print keypad combinations

# Recurrence Relation: T(n) = 4 * T(n - 1)
# T(n): O(4^n)
# S(n): O(n)
keypad = [".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"]
def printKeypadCombination(string, ans):
    if (len(string) == 0): 
        print(ans)
        return; 
    for i in keypad[int(string[0])]:
        printKeypadCombination(string[1:], ans + i)

printKeypadCombination('78', '')