public class Main {

  static int lTable[] = new int[256];

  // T(n): O(1)
  // AS(n): O(1)
  static void initialize() {
    lTable[0] = 0;
    for (int i = 1; i < 256; i++) {
      lTable[i] = lTable[i & (i - 1)] + 1;
      // System.out.println(lTable[i]);
    }
  }

  // T(n): O(1)
  // AS(n): O(1)
  static int countSetBits3(int n) {
    return lTable[n & 255] + lTable[(n >> 8) & 255] + lTable[(n >> 16) & 255] + lTable[(n >> 24) & 255];
  }

  // T(n): O(1)
  // AS(n): O(1)
  static boolean isPowerOfTwoNaive(int n) {
    return (countSetBits3(n) == 1) ? true : false;
  }

  // T(n): O(log(n))
  // AS(n): O(1)
  static boolean isPowerOfTwoNaive2(int n) {
    if (n == 0)
      return false;
    while (n > 1) {
      if (n % 2 != 0)
        return false;
      n /= 2;
    }
    return true;
  }

  // T(n): O(1)
  // AS(n): O(1)
  static boolean isPowerOfTwo(int n) {
    return (n != 0) && ((n & (n - 1)) == 0);
  }

  public static void main(String[] args) {
    initialize();
    // Power of two if n & (n-1) == 0
    System.out.println(isPowerOfTwo(1));
    System.out.println(isPowerOfTwo(4));
    System.out.println(isPowerOfTwo(1024));
    System.out.println(isPowerOfTwo(4545));
    System.out.println(isPowerOfTwo(34));
  }
}
