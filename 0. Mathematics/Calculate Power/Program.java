import java.util.Scanner;

public class Program {
    public static int powerOfN(int num, int k) {
        int pow = 1;
        for (int i = 1; i <= k; i++) {
            pow *= num;
        }
        return pow;
    }

    static int power(int n, int k) {
        if (n == 0)
            return 0;
        if (k == 0)
            return 1;
        if (k == 1)
            return n;
        if (k % 2 == 0)
            return power(n, k / 2) * power(n, k / 2);
        return power(n, (k / 2) + 1) * power(n, k / 2);
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter a power: ");
        int k = input.nextInt();
        System.out.println(power(num, k));
        input.close();

    }
}
