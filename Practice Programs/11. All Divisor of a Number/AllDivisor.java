import java.util.Scanner;

public class AllDivisor {
    public static void printAllDivisorInSorted(int num) {
        int i;
        for (i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                System.out.printf("%d ", i);
            }
        }
        for (; i >= 1; i--) {
            if (num % i == 0) {
                System.out.printf("%d ", num / i);
            }
        }
    }

    public static void main(String args[]) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        num = input.nextInt();

        // Unsorted
        // for (int i = 1; i*i <= num; i++){
        // if (num % i == 0){
        // System.out.printf("%d ", i);
        // if (i != num / i )
        // System.out.printf("%d ", num/i);
        // }
        // }

        // Sorted
        printAllDivisorInSorted(num);
        System.out.println();
        input.close();
    }
}
