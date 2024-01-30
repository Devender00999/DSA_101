public class Main {
  static boolean palindrome(int num) {
    int num1 = num;
    int reverse = 0;
    while (num > 0) {
      int mod = num % 10;
      reverse = reverse * 10 + mod;
      num /= 10;
    }
    return reverse == num1;
  }

  public static void main(String[] args) {
    System.out.println(palindrome(12321));
  }
}
