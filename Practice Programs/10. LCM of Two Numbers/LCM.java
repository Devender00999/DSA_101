import java.util.Scanner;
public class LCM {
    public static void main(String args[]){
        int num1, num2, max;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        num1 = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        num2 = input.nextInt();

        max = num1 > num2 ? num1 : num2;
        for (int i = max; i <= num1*num2; i++){
            if ( i % num1 == 0 && i % num2 == 0)
            {
                max = i;
                break;
            }
        }
        System.out.printf("GCD of %d, %d is %d\n",num1, num2, max);
        input.close();
    }
}
