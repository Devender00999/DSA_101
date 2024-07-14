public class Main {

  // T(n): O(logn)
  // AS(n): O(1)
  static int firstSetBit(int n) {
    int pos = 1;
    while (n > 0) {
      if (n % 2 == 1) {
        return pos;
      }
      n /= 2;
      pos++;
    }
    return pos;
  }

  public static void main(String[] args) {
    System.out.println(firstSetBit(18));
    // firstSetBit(18);
  }
}
