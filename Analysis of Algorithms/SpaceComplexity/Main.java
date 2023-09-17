
public class Main {
  static int getSum1(int n) {
    return (n * (n - 1)) / 2;
  }

  static int getSum2(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += i;
    }
    return sum;
  }

  // sum of array's elements
  static int arrSum(int arr[], int n) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static void main(String[] args) {

  }
}
