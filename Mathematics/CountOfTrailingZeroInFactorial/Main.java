import java.lang.Math;

public class Main {

  static int countFactors(int num, int factor) {
    int count = 0;
    while (num % factor == 0) {
      num /= factor;
      count++;
    }
    return count;
  }

  static int countTrailingZeroInFact(int n) {
    int factorsOf5 = 0; 
    int factorsOf2 = 0; 
    for (int i = 1; i <= n; i++) {
      factorsOf2 += countFactors(i, 2);
      factorsOf5 += countFactors(i, 5);
    }
    return Math.min(factorsOf2, factorsOf5);
  }

  static int countTrailingZeroInFact2(int n) {
    int count = 0;
    for(int i =5; i <= n; i = i* 5) {
      count += n/i;
    }
    return count;
  }

  public static void main(String[] args) {
    System.out.println(countTrailingZeroInFact2(1000));
    
  }
}