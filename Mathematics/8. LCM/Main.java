public class Main {

  // T(n): O(a * b)
  // AS(n): O(1)
  static int findLCM(int a, int b) {
    if ( a > b && a%b == 0) return a;
    else if (b > a && b % a == 0) return b;
    
    int min = Math.min(a, b);
    for (int i = min; i < a * b; i++ ) {
      if (i % a == 0 & i % b == 0) return i;
    }
    return a * b;
  }

  // T(n): O(log(min(num1, num2)))
  // AS(n): O(1)
  static int findGCD(int num1, int num2) {
    int gcd = num1 % num2;
    while (gcd != 0) {
      num1 = num2;
      num2 = gcd;
      gcd = num1 % num2;
    }
    return num2;
  }

  // a * b = GCD(a, b) * LCM(a, b)
  // T(n): O(log(min(num1, num2)))
  // AS(n): O(1)
  static int findLCM2(int a, int b) {
    return (a*b)/findGCD(a, b);
  }
  public static void main(String[] args) {
    System.out.println(findLCM2(12, 24));
  }
}
