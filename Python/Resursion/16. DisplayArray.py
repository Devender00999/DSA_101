# to print all elements of an array using recursion

# Recurrence Relation: T(n): T(n - 1) + θ(1)
# T(n): O(n)
# S(n): O(n)
def displayArray(arr, pos):
    if (pos == len(arr)): 
        print() 
        return
    print(arr[pos], end=" ")
    displayArray(arr, pos + 1)



# example arr = 10, 20, 30, 40, 50, pos = 0

# Expectation
# displayArray(arr, 0) will print all elements of array from 10 to 50

# Faith 
# displayArray(arr, 1) will print all elements of array from 20 to 50

# Faith to expectation
# print(10) and call displayArray(arr, 1)

displayArray([10, 20, 30, 40, 50], 0)



