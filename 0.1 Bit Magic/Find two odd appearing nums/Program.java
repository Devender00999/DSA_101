public class Program {

   public static void findOddTwoMissingNumbers(int arr[]) {
      int xor = arr[0];
      for (int i = 1; i < arr.length; i++)
         xor = xor ^ arr[i];

      int res1 = 0, res2 = 0;
      int lastSetBit = xor & ~(xor - 1);

      for (int i = 0; i < arr.length; i++) {
         if ((arr[i] & lastSetBit) != 0) {
            res1 ^= arr[i];
         } else {
            res2 ^= arr[i];
         }
      }

      System.out.println(res1 + " " + res2);
   }

   public static void main(String[] args) {
      int arr[] = { 4, 4, 5, 4, 4, 6, 6, 7 };

      findOddTwoMissingNumbers(arr);
   }
}
