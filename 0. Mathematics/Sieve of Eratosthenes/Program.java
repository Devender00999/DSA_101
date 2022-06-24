import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrimeNumberTillN(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // sieve of eratosthenes
    public static void sieveOfEratos(int n) {
        boolean isPrime[] = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        // for (int i = 2; i * i <= n; i++) {
        // if (isPrime[i]) {
        // // System.out.print(i + " ");
        // for (int j = 2 * i; j <= n; j += i) {
        // isPrime[j] = false;
        // }
        // }
        // }

        // for (int i = 2; i <= n; i++) {
        // if (isPrime[i])
        // System.out.print(i + " ");
        // }

        // optimized one
        // for (int i = 2; i * i <= n; i++) {
        // if (isPrime[i]) {
        // // System.out.print(i + " ");
        // for (int j = i * i; j <= n; j += i) {
        // isPrime[j] = false;
        // }
        // }
        // }
        // for (int i = 2; i <= n; i++) {
        // if (isPrime[i])
        // System.out.print(i + " ");
        // }

        // more short code
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        // printPrimeNumberTillN(num);
        sieveOfEratos(num);
        System.out.println();
        input.close();

    }
}
