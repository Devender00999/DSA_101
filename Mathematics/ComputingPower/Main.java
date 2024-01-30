public class Main {

  // T(n): θ(n)
  // AS(n): O(1)
  static int computingPower(int x, int n) {
    int power = 1;

    for (int i = 0; i < n; i++) {
      power = power * x;
    }
    return power;
  }

  // T(n): θ(log(n))
  // AS(n): O(1)
  static int power(int x, int n) {
    if (n == 0)
      return 0;
    if (n == 1)
      return x;
    if (n % 2 == 0) {
      return power(x, n / 2) * power(x, n / 2);
    } else {
      return power(x, n / 2) * power(x, n / 2) * x;
    }
  }

  // T(n): θ(log(n))
  // AS(n): θ(log(n))
  static int power2(int x, int n) {
    if (n == 1)
      return x;
    if (n % 2 == 0) {
      return power(x, n / 2) * power(x, n / 2);
    } else {
      return power(x, n - 1);
    }
  }

  // T(n): θ(log(n))
  // AS(n): θ(log(n))
  static int powerEfficient(int x, int n) {
    if (n == 0)
      return 1;
    int temp = power(x, n / 2);
    temp = temp * temp;
    if (n % 2 == 0) {
      return temp;
    } else {
      return temp * x;
    }
  }

  static int powerIterative(int x, int n) {
    int result = 1;
    while (n > 0) {
      if (n % 2 != 0) {
        result = result * x;
      }
      n = n / 2;
      x = x * x;
    }
    return result;
  }

  public static void main(String[] args) {
    // System.out.println(computingPower(2, 0));
    // System.out.println(power(2, 0));
    // System.out.println(power2(2, 0));
    System.out.println(powerIterative(2, 5));
    // powerIterative(2, 15);
  }
}
