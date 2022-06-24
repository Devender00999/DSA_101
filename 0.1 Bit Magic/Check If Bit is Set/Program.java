import java.util.Scanner;

public class Program {
    public static void checkKthBit(int n, int k) {
        int a = 1 << (k - 1);
        System.out.println((n & a) == a ? "Yes" : "No");
    }

    // using right shift
    public static void checkKthBitUsingRightShift(int n, int k) {
        int a = n >> (k - 1);
        System.out.println((n & a) == 1 ? "Yes" : "No");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        System.out.print("Enter value of k: ");
        int k = input.nextInt();

        checkKthBit(n, k);
        input.close();

    }
}
