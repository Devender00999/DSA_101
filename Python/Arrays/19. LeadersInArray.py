#  Given an array, the task is to write a program to print all the LEADERS in the array.
# Leader is an element which is greater than all elements on the right

# Idea is to traverse entire array from 0 to n - 1 and for each elements and check if is there any element that is greater than arr[i] i + 1 to n.
# if it exists then arr[i] is not a leader else it is leader 

# T(n): O(n^2)
# S(n): O(1)
def findLeadersInArray(arr):
    n = len(arr)
    leaders = []
    for i in range(n):
        isLeader = True
        for j in range(i + 1, n):
            if (arr[i] < arr[j]):
                isLeader = False
                break
        if (isLeader):
            leaders.append(arr[i])
    return leaders

# idea is to iterate from last element to first and checking if it is greater maximum element till now.
# T(n): O(n)
# S(n): O(n)
def findLeadersInArrayV2(arr):
    n = len(arr)
    output = []
    output.insert(0, arr[n - 1])
    maxInRight = arr[n - 1]
    for i in range(n - 2, -1, - 1):
        if (arr[i] >= maxInRight):
            output.insert(0, arr[i])
            maxInRight = arr[i]
    return output

def findLeadersInArrayV3(arr):
    n = len(arr)
    print(arr[n - 1])
    maxInRight = arr[n - 1]
    for i in range(n - 2, -1, - 1):
        if (arr[i] >= maxInRight):
            print(arr[i])
            maxInRight = arr[i]

arr = [7, 10, 4, 10, 6, 5, 2]
arr = [10,4,2,4,1]



print(findLeadersInArray(arr))
print(findLeadersInArrayV2(arr))
findLeadersInArrayV3(arr)