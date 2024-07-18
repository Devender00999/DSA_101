public class Main {

  // T(n): O(n)
  // AS(n): O(1)
  static int countOccurance(int arr[], int n) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == n) {
        count++;
      }
    }
    return count;
  }

  // T(n): O(n^2)
  // AS(n): O(1)
  static int oddOneOccuringNaive(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      if (countOccurance(arr, arr[i]) % 2 != 0)
        return arr[i];
    }
    return -1;
  }

  // T(n): O(n)
  // AS(n): O(1)
  static int oddOneOccuringEfficient(int arr[]) {
    int n = arr[0];
    for (int i = 1; i < arr.length; i++) {
      n = n ^ arr[i];
    }
    return n;
  }

  public static void main(String[] args) {
    int arr[] = { 3, 4, 4, 4, 4, 5, 5 };
    System.out.println(oddOneOccuringNaive(arr));
    System.out.println(oddOneOccuringEfficient(arr));
  }
}
