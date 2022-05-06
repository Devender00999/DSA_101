import java.util.Scanner;

public class GCD {

    // bruteforce approach
    public static int gcd(int num1, int num2) {
        int min = num1 < num2 ? num1 : num2;
        for (int i = min; i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                min = i;
                break;
            }
        }
        return min;
    }

    // efficient approach using euclid algo
    public static int gcdUsingEuclidAlgo(int a, int b) {
        if (b == 0)
            return a;
        return gcdUsingEuclidAlgo(b, b % a);
    }

    public static void main(String args[]) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2 = input.nextInt();

        System.out.printf("GCD of %d, %d is %d\n", num1, num2, gcdUsingEuclidAlgo(num1, num2));
    }
}
