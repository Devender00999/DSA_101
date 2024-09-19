# to insert element at the end of the array

# i/p: 10, 20, 30, 40; num: 50
# o/p: 10, 20, 30, 40, 50

# T(n): O(1)
# S(n): O(1)
def insertAtEnd(arr, size, elem):
    arr[size] = elem
    return arr

# T(n): O(1)
# S(n): O(1)
def insertAtEndV2(arr,  elem):
    arr.append(elem)
    return arr

print(insertAtEnd([10, 20, 30, 40, -1], 4, 50))