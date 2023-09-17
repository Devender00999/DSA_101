public class Main {

  static void exampleOne(int n, int c) {
    for (int i = 0; i < n; i += c) {
      System.out.println(n);
    }
    // Time complexity = O(n) or θ(n)
  }

  // n = 10, c = 2
  // value of i will be 0, 2, 4, 6, 8
  // 0*c, 1*c, 2*c, 3*c, ... k-1*c < n
  // k-1 = n/c
  // k = n/c - 1
  // Time Complexity = ()

  // n = 20, c = 6
  // value of i will be 0, 6, 12, 18

  // n = 30, c = 6
  // value of i will be 0, 6, 12, 18, 24

  // By observing we can say that

  public static void main(String args[]) {

  }
}
