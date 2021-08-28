import java.math.BigInteger;

public class BigIntegerExample{
    public static void main(String[] args){
        BigInteger num1 = new BigInteger("1600");
        BigInteger num2 = new BigInteger("1500");
        System.out.println("A + B = "+num1.add(num2));
        System.out.println("A - B = "+num1.subtract(num2));
        System.out.println("A * B = "+num1.multiply(num2));
        System.out.println("A / B = "+num1.divide(num2));
        System.out.println("A % B = "+num1.remainder(num2));
        System.out.println("A > B = "+num1.compareTo(num2)); // 1 >, -1 <, 0 ==
                 
    }
}