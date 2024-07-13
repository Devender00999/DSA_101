public class Main {

  // T(n): O(k)
  // AS(n): O(1)
  static boolean isKthBitSetNaive(int n, int k) {
    int c = 1;
    for (int i = 1; i < k; i++) {
      c = c * 2;
    }
    return (n & c) != 0 ? true : false;
  }

  // T(n): O(k)
  // AS(n): O(1)
  static boolean isKthBitSetNaiveV2(int n, int k) {
    for (int i = 1; i < k; i++) {
      n /= 2;
    }
    return (n & 1) != 0 ? true : false;
  }

  // T(n): O(1)
  // AS(n): O(1)
  static boolean isKthBitSet(int n, int k) {
    return (n & (1 << (k - 1))) == 0 ? false : true;
  }

  // T(n): O(1)
  // AS(n): O(1)
  static boolean isKthBitSetEfficient(int n, int k) {
    int newN = n >> (k - 1);
    return (newN & 1) == 0 ? false : true;
  }

  public static void main(String[] args) {
    // System.out.println(isKthBitSet(3434, 6) ? "Yes" : "No");
    // System.out.println(isKthBitSetNaive(3434, 6) ? "Yes" : "No");
    // System.out.println(isKthBitSetNaiveV2(3434, 6) ? "Yes" : "No");
    System.out.println(isKthBitSetEfficient(10, 1) ? "Yes" : "No");
    System.out.println(isKthBitSetProblem(10, 1) ? "Yes" : "No");
  }
}