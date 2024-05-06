public class Main {

  // T(n): O(min(num1, num2))
  // AS(n): O(1)
  static int findGCD(int num1, int num2) {
    int min = Math.min(num1, num2);
    for (int i = min; i >= 1; i--) {
      if (num1 % i == 0 && num2 % i == 0) {
        return i;
      }
    }
    return 1;
  }

  // T(n): O(min(num1, num2))
  // AS(n): O(1)
  static int findGCD2(int a, int b) {
    while (a != b) {
      if (a > b) {
        a = a - b;
      } else {
        b = b - a;
      }
    }
    return a;
  }

  // T(n): O(log(min(num1, num2)))
  // AS(n): O(1)
  static int findGCD3(int num1, int num2) {
    int gcd = num1 % num2;
    while (gcd != 0) {
      num1 = num2;
      num2 = gcd;
      gcd = num1 % num2;
    }
    return num2;
  }

  // T(n): O(max(a, b))
  // AS(n): O(max(a, b))
  static int findGCD4(int a, int b) {
    if (b == 0)
      return a;
    return findGCD4(b, a % b);
  }

  public static void main(String[] args) {
    System.out.println(findGCD2(3, 11));
  }
}
