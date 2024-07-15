
public class Main {

  // T(n): O(d) where d is no. of digits
  // AS(n): O(1)
  static int countSetBits(int n) {
    int count = 0;
    while (n > 0) {
      if ((n & 1) == 1)
        count++;
      n = n >> 1;
    }
    return count;
  }

  // Brian Kerningam's algorithm
  // T(n): O(set bit)
  // AS(n): O(1)
  static int countSetBits2(int n) {
    int count = 0;
    while (n > 0) {
      count++;
      n = n & (n - 1);
    }
    return count;
  }

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

  public static void main(String[] args) {
    initialize();
    // System.out.println(countSetBits(10));
    // System.out.println(countSetBits2(10));
    // System.out.println(countSetBits3(10));
    // System.out.println(countSetBits(101000));
    // System.out.println(countSetBits2(101000));
    System.out.println(countSetBits3(101000));

  }
}
