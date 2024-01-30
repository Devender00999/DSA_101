
public class Main {
  // to calculate factorial of a number usomg recursion
  // Recurrence Relation = T(n) = T(n-1) + θ(1)
  // T(n) = θ(n)
  // AS(n) = θ(n)
  static int digitsOfFactorial(int num) {
    double digits = 0;
    if (num == 1) {
      return 1;
    }
    for (int i = 2; i <= num; i++) {
      digits += Math.log10(i);
    }
    return (int) Math.floor(digits + 1);
  }

  public static void main(String[] args) {
    System.out.println(digitsOfFactorial(120));
  }
}
