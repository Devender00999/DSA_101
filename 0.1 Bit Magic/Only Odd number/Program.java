public class Program {

   public static int onlyOddNumber(int arr[]) {
      int result = arr[0];
      for (int i = 1; i < arr.length; i++) {
         result = result ^ arr[i];

      }
      return result;
   }

   public static void main(String[] args) {
      int arr[] = { 3, 4, 4, 5, 5, 6 };
      System.out.println("Odd one out is " + onlyOddNumber(arr));
   }
}
