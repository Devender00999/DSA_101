public class Operator {
    public static void main(String args[]){
        System.out.println("\nArithmetic Operators");
        System.out.println("5 + 4 = "+(5+4));
        System.out.println("5 - 4 = "+(5-4));
        System.out.println("5 / 4 = "+(5/4));
        System.out.println("5 * 4 = "+(5*4));

        System.out.println("\nBitwise Operators");
        System.out.println("5 & 4 = "+(5 & 4));
        System.out.println("5 | 4 = "+(5 | 4));
        System.out.println(" ~5   = "+~(-6));
        System.out.println("3<<1  = "+(3<<1)); // for small number x<<y = x * 2 ^ y
        System.out.println("6>>1  = "+(6>>1)); // for small number x<<y = x * 2 ^ y

        System.out.println("-6>>>30  = "+(-6>>>30));
    }
}
