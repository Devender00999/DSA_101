public class Main {

  // static boolean hasOnly3Divisors(int n) {
  // int divisors = 2;

  // for (int i = 1; i * i <= n; i += 1) {

  // }
  // return divisors == 3 ? true : false;
  // }
  static boolean isPrimeNumber3(int n) {
    if (n == 1)
      return false;
    if (n == 2 || n == 3)
      return true;
    if (n % 2 == 0 || n % 3 == 0)
      return false;

    for (int i = 5; i * i <= n; i += 6) {
      if (n % i == 0 || n % (i + 2) == 0)
        return false;
    }

    return true;
  }

  static int exactly3Divisors2(int n) {
    int cnt = 0;
    for (int i = 1; i <= n; i++) {
      int divisors = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0)
          divisors++;
      }
      if (divisors == 3)
        cnt++;
    }
    return cnt;
  }

  static int exactly3Divisors(int N) {
    // Your code here
    int count = 0;
    for (int i = 2; i * i <= N; i++) {
      if (isPrimeNumber3(i)) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(exactly3Divisors2(67));
    // System.out.println(hasOnly3Divisors(8));
  }
}
