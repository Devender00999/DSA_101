# to print all elements of an array in reverse using recursion

# example arr = 10, 20, 30, 40, 50, pos = 0
# Expectation
# displayArrayReverse(arr, 0) will print all elements of array in reverse: 50, 40, 30, 20, 10

# Faith 
# displayArrayReverse(arr, 1) will print all elements of array in reverse: 50, 40, 30, 20

# Faith to expectation
# call displayArrayReverse(arr, 1) and print(10)

# Recurrence Relation: T(n): T(n - 1) + θ(1)
# T(n): O(n)
# S(n): O(n)
def displayArrayReverse(arr, pos):
    if (pos == len(arr)): 
        return
    displayArrayReverse(arr, pos + 1)
    print(arr[pos])

displayArrayReverse([10, 20, 30, 40, 50], 0)



