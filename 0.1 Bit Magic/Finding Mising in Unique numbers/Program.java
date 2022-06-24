public class Program {

   public static int findMissing(int n, int arr[]) {
      int result = arr[0];
      for (int i = 1; i < arr.length; i++) {
         result = result ^ arr[i];

      }
      for (int i = 1; i <= n; i++) {
         result ^= i;
      }
      return result;
   }

   public static void main(String[] args) {
      int arr[] = { 1, 2, 4, 3 }, n = 5;
      System.out.println("Missing unique number is: " + findMissing(n, arr));
   }
}
