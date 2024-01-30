import java.util.Arrays;

public class Main {
  // T(n): O(sqrt(n));
  // AS(n): O(1)
  static boolean isPrimeNumber(int n) {
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

  // T(n): O(n*sqrt(n))
  // AS(n): O(1)
  static void printAllPrimeNumbers(int N) {
    for (int i = 2; i <= N; i++) {
      if (isPrimeNumber(i))
        System.out.print(i + " ");
    }
    System.out.println();
  }

  // T(n): O(nloglogn)
  // AS(n) O(n)
  static void sieveOfEratosthenes(int n) {
    boolean isPrime[] = new boolean[n + 1];
    Arrays.fill(isPrime, true);

    for (int i = 2; i * i <= n; i++) {
      if (isPrime[i] == true) {
        for (int j = 2 * i; j <= n; j += i) {
          isPrime[j] = false;
        }
      }
    }
    for (int i = 2; i <= n; i++) {
      if (isPrime[i] == true)
        System.out.print(i + " ");
    }
    System.out.println();
  }

  // T(n): O(nloglogn)
  // AS(n) O(n)
  static void sieveOfEratosthenes2(int n) {
    boolean isPrime[] = new boolean[n + 1];
    Arrays.fill(isPrime, true);

    for (int i = 2; i <= n; i++) {
      if (isPrime[i] == true) {
        System.out.print(i + " ");
        for (int j = i * i; j <= n; j += i) {
          isPrime[j] = false;
        }
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    sieveOfEratosthenes2(10);
    sieveOfEratosthenes2(49);
  }
}
