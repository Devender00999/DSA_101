public class Main {

  // T(n): O(n)
  // AS(n): O(1)
  static boolean isPrimeNumber(int num) {
    if (num == 1)
      return false;
    if (num == 2)
      return true;
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {

        System.out.println(i + " " + num / i);
        return false;
      }
      ;
    }
    return true;
  }

  // T(n): O(√n)
  // AS(n): O(1)
  static boolean isPrimeNumber2(int num) {
    if (num == 1)
      return false;
    if (num == 2)
      return true;
    for (int i = 2; i * i < num; i++) {
      if (num % i == 0) {
        System.out.println(i + " " + num / i);
        return false;
      }
    }
    return true;
  }

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

  public static void main(String[] args) {
    System.out.println(isPrimeNumber3(25) ? "Yes" : "No");
  }
}
