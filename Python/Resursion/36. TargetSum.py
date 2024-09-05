# to print all the elements of an array that will result in n

# i/p: arr = [10, 20, 30, 40, 50], n = 60
# Recurrence Relation: T(n) = 2 * T(n - 1)
# T(n): O(2^n)
# S(n): O(n)
def printTargetSum(arr, target, subset, sof):
    if (len(arr) == 0): 
        if target == sof :print(subset)
        return
    printTargetSum(arr[1:], target, subset, sof)
    printTargetSum(arr[1:], target, subset + str(arr[0]) + ", ", sof + arr[0] )

    
printTargetSum([10, 20, 30, 40, 50], 100, "", 0)