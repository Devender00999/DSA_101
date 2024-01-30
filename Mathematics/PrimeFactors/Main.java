
public class Main {
  // T(n): O(sqrt(n));
  // AS(n): O(n)
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

  static void primeFactors(int n) {
    for (int i = 2; i <= n; i++) {
      if (n % i == 0 && isPrimeNumber3(i)) {
        System.out.println(i);
        n /= i;
        i = 2;
      }
    }
  }

  static void primeFactors2(int n) {
    for (int i = 2; i <= n; i++) {
      if (isPrimeNumber3(i)) {
        int x = i;
        while (n % x == 0) {
          System.out.println(i);
          x = x * i;
        }
      }
    }
  }

  static void primeFactors3(int n) {
    if (n <= 1)
      return;
    for (int i = 2; i * i <= n; i++) {
      while (n % i == 0) {
        System.out.println(i);
        n /= i;
      }
    }
    if (n > 1)
      System.out.println(n);
  }

  static void primeFactors4(int n) {
    if (n <= 1)
      return;
    while (n % 2 == 0) {
      System.out.println(2);
      n /= 2;
    }

    while (n % 3 == 0) {
      System.out.println(3);
      n /= 3;
    }

    for (int i = 5; i * i <= n; i += 6) {
      while (n % i == 0) {
        System.out.println(i);
        n /= i;
      }
      while (n % (i + 2) == 0) {
        System.out.println(i + 2);
        n /= (i + 2);
      }
    }
    if (n > 1)
      System.out.println(n);
  }

  public static void main(String[] args) {
    primeFactors(1234);
    System.out.println();
    primeFactors2(1234);
    System.out.println();

    primeFactors3(1234);
    System.out.println();

    primeFactors4(67);
  }
}
