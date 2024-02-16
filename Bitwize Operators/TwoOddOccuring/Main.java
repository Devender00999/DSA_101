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
  static int[] twoOddOccuringNaive(int arr[]) {
    int results[] = new int[2];
    int index = 0;
    for (int i = 0; i < arr.length; i++) {
      if (countOccurance(arr, arr[i]) % 2 != 0) {
        if (countOccurance(results, arr[i]) == 0) {
          results[index++] = arr[i];
        }
      }

    }
    return results;
  }

  // T(n): O(n)
  // AS(n): O(1)
  static void twoOddOccuringEfficient(int arr[]) {
    int n = arr[0];
    for (int i = 1; i < arr.length; i++) {
      n = n ^ arr[i];
    }

    int res1 = 0, res2 = 0;
    // to get last set bit of n
    int lastSetBit = n & (~(n - 1));
    for (int i = 0; i < arr.length; i++) {
      if ((arr[i] & lastSetBit) != 0) {
        res1 = res1 ^ arr[i];
      } else {
        res2 = res2 ^ arr[i];
      }
    }
    System.out.println(res1 + " " + res2);
  }

  public static void main(String[] args) {
    int arr[] = { 1, 3, 2, 3, 3, 1 };
    // int arr[] = { 5, 6, 10, 6, 10, 6, 3, 3 };
    twoOddOccuringEfficient(arr);
  }
}
