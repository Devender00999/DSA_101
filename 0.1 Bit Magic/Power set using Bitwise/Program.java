public class Program {

   public static void printPowerSet(String str) {
      int n = str.length();

      for (int i = 0; i < (int) Math.pow(2, n); i++) {
         for (int j = 0; j < i; j++) {
            if ((i & (1 << j)) != 0) {
               System.out.print(str.charAt(j));
            }

         }
         System.out.println();
      }

   }

   public static void main(String[] args) {
      String str = "abc";
      printPowerSet(str);
   }
}
