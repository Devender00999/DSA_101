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

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a nubmer: ");
        int num = input.nextInt();
        printPrimeNumberTillN(num);
        System.out.println();
        input.close();

    }
}
