// package "Mathematics - DSA.QuadraticRoots";

import java.util.Scanner;
import java.lang.Math;

public class Main {
  // T(n): θ(1)
  // AS(n): θ(1)
  static void quadraticRoots(int a, int b, int c) {
    int d = b * b - 4 * a * c;
    System.out.println(d);
    if (d >= 0) {
      int root1 = (int) Math.floor((-b + Math.sqrt(d)) / (2 * a));
      int root2 = (int) Math.floor((-b - Math.sqrt(d)) / (2 * a));
      System.out.println(root1 + " " + root2);
    }
    System.out.println("Imaginary roots");
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
    quadraticRoots(a, b, c);
  }
}
