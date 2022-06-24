import java.util.Scanner;

public class Program {
   // check if number is power of 2 or not
   public static boolean powerOf2(int n) {
      if (n == 0)
         return false;
      while (n != 1) {
         if (n % 2 != 0) {
            return false;
         }
         n /= 2;
      }
      return true;
   }

   // power of 2 using Brian Keningan Algorithm
   public static boolean powerOf2UsingBKA(int n) {
      return n != 0 && (n & (n - 1)) == 0 ? true : false;
   }

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int n = input.nextInt();
      System.out.println(powerOf2UsingBKA(n) ? "Yes" : "No");
      input.close();
   }

}
