import java.util.Scanner;

public class LCM {
    // bruteforce approach
    public static int lcmBruteForce(int num1, int num2) {
        int max = Math.max(num1, num2);
        for (int i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                max = i;
                break;
            }
        }
        return max;
    }

    // efficient approach using a * b = gcd(a, b) * lcm(a,b);
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static int lcmEfficient(int a, int b) {
        return a * b / gcd(a, b);
    }

    public static void main(String args[]) {
        int num1, num2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2 = input.nextInt();

        System.out.printf("LCM of %d, %d is %d\n", num1, num2, lcmEfficient(num1, num2));
        input.close();
    }
}
