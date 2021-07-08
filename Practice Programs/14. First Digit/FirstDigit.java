import java.util.Scanner;

public class FirstDigit {
    static int firstDigit(int num){
        // while(num>10)
        //     num /= 10;

        int p = (int)Math.log10(num);
        return num/(int)Math.pow(10,p);
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int num2 = num;
        System.out.format("Last Digit of %d is %d\n", num2, firstDigit(num));
        input.close();

    }
}
