# to insert element at the end of the array

# i/p: 10, 20, 30, 40; num: 50
# o/p: 10, 20, 30, 40, 50

def insertAtEnd(arr, size, elem):
    tempArr = []
    for i in range(size):
        tempArr.append(arr[i])
    tempArr.append(elem)
    return tempArr


def insertAtEndV2(arr, size, elem):
    ar.append(elem)
    return tempArr

print(insertAtEndV2([10, 20, 30, 40], 3))