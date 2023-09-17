public class Main {

  // to calculate sum of first n natural numbers
  static int sumOfFirstNNaturalNumbers(int num) {

    // // Basic method
    // int sum = 0;
    // for (int i = 1; i <= num; i++) {
    // sum += i;
    // }
    // return sum;

    // Efficient method
    return num * ((num + 1) / 2);
  }

  static int findNumInArray(int arr[], int len, int num) {
    for (int i = 0; i < len; i++) {
      if (arr[i] == num)
        return i;
    }
    return -1;
  }

  public static void main(String args[]) {
    System.out.println(sumOfFirstNNaturalNumbers(3));
  }
}
