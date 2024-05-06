
public class Main {
  // T(n): O(n)
  // AS(n): 1
  static void allDivisorsNaive(int N) {
    for (int i = 1; i <= N; i++) {
      if (N % i == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  static void allDivisorsEfficeint(int N) {
    for (int i = 1; i * i <= N; i++) {
      if (N % i == 0) {
        System.out.print(i + " ");
      }
    }
    for (int i = (int) Math.sqrt(N - 1); i > 1; i--) {
      if (N % i == 0) {
        System.out.print(N / i + " ");
      }
    }
  }

  // T(n): O(sqrt(n))
  // AS(n): O(1)
  static void allDivisorsEfficeint2(int N) {
    int i;
    if (N == 1) {
      System.out.println(1);
      return;
    }
    for (i = 1; i * i < N; i++) {
      if (N % i == 0) {
        System.out.print(i + " ");
      }
    }
    for (i = i * i == N ? i : i - 1; i >= 1; i--) {
      if (N % i == 0) {
        System.out.print(N / i + " ");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    allDivisorsEfficeint2(99);
    allDivisorsEfficeint2(101);
    allDivisorsEfficeint2(182);
    allDivisorsEfficeint2(176);
  }
}
