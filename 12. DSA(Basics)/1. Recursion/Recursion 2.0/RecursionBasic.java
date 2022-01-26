public class RecursionBasic {
    // print n to 1
    public static void printNumReverse(int num) {
        if (num == 0)
            return;
        System.out.println(num);
        printNumReverse(num - 1);
    }

    // print 1 to n
    public static void printNum(int num) {
        if (num == 6)
            return;
        System.out.println(num);
        printNum(num + 1);
    }

    // sum of first n natural numbers
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
    }

    // factorial of n
    public static int calcFactorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        int fact = calcFactorial(n - 1);
        int factn = n * fact;
        return factn;
    }

    // printing fibonacci numbers
    public static void printFib(int a, int b, int n) {
        if (n == 0)
            return;
        int c = a + b;
        System.out.println(c);
        printFib(b, c, n - 1);
    }

    // calculate nth power of x
    public static int calcPower(int x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        int power = calcPower(x, n - 1);
        return x * power;
    }

    public static int calcPowerWithLogHeight(int x, int n) {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        // if (x % 2 == 0)
        // return x;

        // if n is even
        if (n % 2 == 0)
            return calcPower(x, n / 2) * calcPower(x, n / 2);
        else
            return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
    }

    // Main function
    public static void main(String args[]) {
        // printing 5 to 1
        // printNumReverse(5);

        // printing 1 to 5
        // printNum(1);

        // sum of first n natural number
        // printSum(1, 5, 0);

        // printing factorial of a number
        // int ans = calcFactorial(5);
        // System.out.println(ans);

        // printing n fibonacci numbers
        // int n = 8;
        // System.out.println(0);
        // System.out.println(1);
        // printFib(0, 1, n - 2);

        // printing nth power of x;
        int x = 10, n = 3;
        System.out.println(calcPowerWithLogHeight(x, n));

    }
}
