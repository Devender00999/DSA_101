import java.util.Scanner;
public class SumOfNNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = input.nextInt();
        System.out.println("n = "+n);
        System.out.println("Sum of "+n+" numbers are "+(n*(n + 1))/2);
        input.close();
    }
}
