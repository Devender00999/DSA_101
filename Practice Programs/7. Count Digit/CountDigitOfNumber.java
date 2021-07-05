import java.util.Scanner;

public class CountDigitOfNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int num2 = num;
        int countNum = 0;
        while(num > 0){
            countNum++;
            num /= 10;
        }
        System.out.printf("%d has %d digits\n",num2, countNum);
        input.close();
    }
}
