
public class Main {
  static void printBitwiseOperations() {
    int a = 5, b = 4;
    System.out.println("".format("%d & %d: ", a, b) + (a & b));
    System.out.println("".format("%d | %d: ", a, b) + (a | b));
    System.out.println("".format("%d ^ %d: ", a, b) + (a ^ b));
    System.out.println("".format("~%d: ", a) + (~a));
    System.out.println("".format("%d << %d: ", a, b) + (a << b));
    System.out.println("".format("%d >> %d: ", 1, 2) + (1 >> 2));
    System.out.println("".format("%d >>> %d: ", a, b) + (a >>> b));
  }

  public static void main(String[] args) {
    printBitwiseOperations();
  }
}
