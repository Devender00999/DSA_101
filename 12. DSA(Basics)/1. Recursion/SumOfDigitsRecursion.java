public class SumOfDigitsRecursion {
    public static int sumOfDigit(int n){
        if (n < 10) return n;
        return n%10 + sumOfDigit(n/10);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigit(513));
    }
}
