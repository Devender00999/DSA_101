import java.math.BigInteger;
import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Factorial of "+num+" : "+factorial(num));
        input.close();
    }

    public static BigInteger factorial(int num){
        BigInteger n = new BigInteger("1");
        for (int i = 1; i <= num; i++){
            n = n.multiply(BigInteger.valueOf(i));
        }
        return n;
    }
}