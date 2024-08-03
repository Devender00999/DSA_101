def fun1():
    print('At fun 1')

def fun2():
    print('Before fun 1')
    fun1()
    print('After fun 1')


def main():
    print('Before fun 2')
    fun2()
    print('After fun 2')

# main()

# first main() is called
# it prints Before fun 2 then call fun2()
# now, fun2() will be executed so main will be paused and code inside fun2 will be executed
# it will print("Before fun 1"), and then it will call fun1()
# at this point our call stack will look like 
# fun1()
# fun2()
# main()
# code inside fun1() will be executed and it will print 'At Fun 1'
# when its execution is finished, it will be pushed out of the stack and control will go back to fun2()
# fun2() will continue its execution and print "After fun 1"
# it's execution is also completed so controll will go back to main()
# it will print "After fun 2"

# recursive function will run until stack overflows
def function():
    print("Hello")
    function()

# function()


# recursion function with base case
def fun(n):
    if (n == 0):
        return 
    fun(n - 1)
    print("GFG")

# fun(2)

def func(n):
    if n == 0:
        return
    func(n - 1)
    print(n)
    func(n - 1)

# func(3)


def fun3(n):
    if (n == 1):
        return 0
    else: return 1 + fun3(n//2)


# print(fun3(10))


def printBinary(n):
    if n == 0:
        return
    printBinary(n // 2)
    print(n % 2, end="")

printBinary(20)
# 16

# Step 1
# 1 + fun(8)
#     1 + fun(4)
#          1 + fun(2)
#               1 + fun(1) 
#                   return 0


# 1 + fun(8) => 1 + 1 + 1 + 1
#     1 + fun(4) => 1 + 1 + 1
#          1 + fun(2) => 1 + 1
#               1 + fun(1)  =>  1 + 0
#                   return 0


# 1 + 1 + 1 + 1 + 0