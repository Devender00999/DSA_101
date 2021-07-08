import java.util.Scanner;

public class Fibonacci {
    public static void main(String args[]) {
        int num, a = 1, b = 1, fib = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = input.nextInt();
        if (num == 0 || num == 1)
            System.out.print("1 ");
        else {
            System.out.print("1 ");
            System.out.print("1 ");
            for (int i = 2; i < num; i++) {
                fib = a + b;
                System.out.print(fib + " ");
                a = b;
                b = fib;
            }
            System.out.println();
        }

        input.close();
        // Sorted

        System.out.println();
    }
}
