import java.util.Scanner;
public class GCD {
    public static void main(String args[]){
        int num1, num2, min;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2 = input.nextInt();

        min = num1 < num2 ? num1 : num2;
        for (int i = min; i > 0; i--){
            if ( num1 % i == 0 && num2 % i == 0)
            {
                min = i;
                break;
            }
        }
        System.out.printf("GCD of %d, %d is %d\n",num1, num2, min);
    }
}
