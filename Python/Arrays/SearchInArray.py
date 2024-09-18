# to search an element in an array

# i/p: 10, 12, 24, 34, 32; elem: 34
# o/p: 3

# i/p: 10, 12, 24, 34, 32; elem: 10
# o/p: 0

# T(n): O(n)
# S(n) O(1)
def searchItem(arr, item):
    for i in range(len(arr)):
        if (item == arr[i]):
            return i
    return -1


# deleting an element
# T(n): O(n)
# S(n) O(1)
def deleteAnElement(arr, elem):
    idx = -1
    for i in range(len(arr)):
        if arr[i] == elem:
            idx = i
            break

    if (idx != -1):
        for i in range(idx, len(arr) - 1):
            arr[i] = arr[i + 1]

        arr.pop()
    return arr


# Insert: O(n)
# Search: O(n) for unsorted
#         O(log(n)) for sorted
# Delete: O(n)

# Get ith Element: O(1)
# Update ith Element: O(1)