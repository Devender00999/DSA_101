import java.util.Scanner;

public class Program {
    // count set bits
    // ip: 7, o/p: 3
    public static int countSetBits(int n) {
        int cnt = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                cnt++;
            }
            n /= 2;
        }
        return cnt;
    }

    // Brian kaningam algorithm
    public static int countSetBitsUsingBKA(int n) {
        int res = 0;
        while (n > 0) {
            n = n & (n - 1);
            res++;
        }
        return res;
    }

    public static int countSetBitsUsingPre(int n) {
        // preprocessing
        // here i am calculating and storing how many bits a
        // number contains from 0 to 255.
        int table[] = new int[256];
        table[0] = 0;
        for (int i = 0; i < 256; i++) {
            table[i] = (i & 1) + table[i / 2];
        }

        int res = table[n & 0xff];
        n = n >> 8;

        res += table[n & 0xff];
        n = n >> 8;

        res += table[n & 0xff];
        n = n >> 8;

        res += table[n & 0xff];
        n = n >> 8;

        return res;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int count = countSetBitsUsingPre(n);
        System.out.println(count);
        input.close();

    }
}
