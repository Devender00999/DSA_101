import java.util.Scanner;
public class LastDigit {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        System.out.format("Last Digit of %d is %d\n", num, Math.abs(num%10));
        input.close();

    }
}
