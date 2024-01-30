public class Main {
  // to count digits of a number
  // Ex.
  // num = 234, count = 3; num = 23, count = 2;
  static int countDigits(int num) {
    int count = 0;
    while (num > 0) {
      count++;
      num /= 10;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countDigits(9235));
    System.out.println(countDigits(38));
    System.out.println(countDigits(7));
  }
}