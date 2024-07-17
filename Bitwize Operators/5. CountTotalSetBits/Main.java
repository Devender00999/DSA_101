public class Main {
  // 0 0 0 0 0
  // 1 0 0 0 1
  // 2 0 0 1 0
  // 3 0 0 1 1
  // 4 0 1 0 0
  // 5 0 1 0 1
  // 6 0 1 1 0
  // 7 0 1 1 1
  // 8 1 0 0 0
  // 9 1 0 0 1
  // 10 1 0 1 0
  // 11 1 0 1 1
  // 12 1 1 0 0
  // 13 1 1 0 1
  // 14 1 1 1 0
  // 15 1 1 1 1

   static int countTotalSetBits(int n) {
      if (n == 0) return 0;
      int x = (int) (Math.log(n) / Math.log(2));
      int powerValue = (int)Math.pow(2,x);
      
      return ((powerValue >> 1) * x) + (n-powerValue + 1) + countTotalSetBits(n - powerValue);
   }

  public static void main(String[] args) {
    System.out.println(countTotalSetBits(16));
  }
}
