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