public class Main {

  // T(n): O(1)
  // AS(n): O(1)
  static int xorUntilN(int n) {
    if (n % 4 == 0)
      return n;
    if (n % 4 == 1)
      return 1;
    if (n % 4 == 2)
      return n + 1;
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(xorUntilN(12));
  }
}
