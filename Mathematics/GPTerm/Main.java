public class Main {

  // T(n): O(log(n))
  // AS(n): O(1)
  static double nthGPTerm(int A, int B, int N) {
    double commonRatio = (double) B / A;
    return A * Math.pow(commonRatio, N - 1);
  }

  public static void main(String[] args) {
    System.out.println((int) nthGPTerm(84, 87, 3));
  }
}
