
public class Main {
  // T(n): O(1)
  // AS(n): O(1)
   static int mostSetBitPosition(int n) {
      if (n == 0) return 0;
      int logNBase2 = (int) (Math.log(n) / Math.log(2)) + 1;
      return logNBase2;
   }

   public static void main(String[] args) {
      System.out.println(mostSetBit(16));
   }
}
