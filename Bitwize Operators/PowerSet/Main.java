public class Main {
  static void powerSetOfString(String a) {
    int length = a.length();
    for (int i = 0; i < (int) Math.pow(2, length); i++) {
      int index = 0;
      int num = i;
      while (num > 0 || index < a.length()) {
        // System.out.println();
        if (num % 2 == 1) {
          System.out.print(a.charAt(index));
        }
        // System.out.print(index);
        index++;
        num /= 2;
      }
      System.out.println();
    }
  }

  static void powerSetOfStringBitWise(String a) {
    int n = a.length();
    int pSize = 1 << n;
    for (int i = 0; i < pSize; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println();
        if (i & (1 << j)) {
          System.out.println();
        }
      }
    }
    // System.out.println(pSize);
  }

  public static void main(String[] args) {
    powerSetOfStringBitWise("abc");
  }
}
