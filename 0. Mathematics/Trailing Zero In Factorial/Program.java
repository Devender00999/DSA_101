// Trailing Zero in factorial of a number

import java.util.*;

public class Program {
    public static int countTrailingZero(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        int noOfZero = 0;
        while (fact % 10 == 0) {
            noOfZero++;
            fact /= 10;
        }
        return noOfZero;
    }

    // efficient approach
    public static int countTrailingZeroEfficient(int num) {
        int noOfZero = 0;
        for (int i = 5; i <= num; i *= 5) {
            noOfZero += num / i;
        }
        return noOfZero;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.printf("Trailing Zero in %d's factorial is %d\n", num, countTrailingZeroEfficient(num));
        input.close();
    }
}
