import java.math.BigInteger;
import java.util.Scanner;
public class Prime{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(num+" is Prime "+isPrime(num));
        System.out.println("next Prime after "+num+" is "+nextPrime(num));
        input.close();
    }

    public static boolean isPrime(int num){
        BigInteger a = BigInteger.valueOf(num);
        return a.isProbablePrime(1);
    }

    public static BigInteger nextPrime(int num){
        return BigInteger.valueOf(num).nextProbablePrime();
    }
}
//0,1,1,2,3,5,8,13,21