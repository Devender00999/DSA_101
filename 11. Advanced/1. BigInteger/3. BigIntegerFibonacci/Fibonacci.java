import java.math.BigInteger;
import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println("Number "+num+" Fibonacci number is"+" : "+fibonacci(num));
        input.close();
    }

    public static BigInteger fibonacci(int num){
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");

        BigInteger c = new BigInteger("0");
        for (int i = 2; i < num; i++){
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }
}
//0,1,1,2,3,5,8,13,21