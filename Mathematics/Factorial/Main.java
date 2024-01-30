
public class Main {
  // to calculate factorial of a number
  // T(n): θ(n)
  // AS(n): θ(1)
  static long factorial(int num) {
    long fact = 1;
    while (num > 0) {
      fact *= num;
      num--;
    }
    return fact;
  }

  // to calculate factorial of a number usomg recursion
  // Recurrence Relation = T(n) = T(n-1) + θ(1)
  // T(n) = θ(n)
  // AS(n) = θ(n)
  static int factorialRecursive(int num) {
    if (num == 0)
      return 1;
    return num * factorialRecursive(num - 1);
  }

  public static void main(String[] args) {
    System.out.println(factorial(20));
  }
}
