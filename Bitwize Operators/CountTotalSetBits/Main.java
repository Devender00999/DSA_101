public class Main {
  // 0 0 0 0 0
  // 1 0 0 0 1
  // 2 0 0 1 0
  // 3 0 0 1 1
  // 4 0 1 0 0
  // 5 0 1 0 1
  // 6 0 1 1 0
  // 7 0 1 1 1
  // 8 1 0 0 0
  // 9 1 0 0 1
  // 10 1 0 1 0
  // 11 1 0 1 1
  // 12 1 1 0 0
  // 13 1 1 0 1
  // 14 1 1 1 0
  // 15 1 1 1 1
  b if(n==0)return 0;
  int x = (int) (Math.log(n) / Math.log(2));
  // System.out.println(n + " " + x + " " + Math.pow(2, x));
  System.out.println(n+" "+((int)Math.pow(2,x-1))+" "+(n-(int)Math.pow(2,x)));return((int)Math.pow(2,x-1)*x)+(n-(int)Math.pow(2,x)+1)+

  countTotalSetBits(n - (int) Math.pow(2, x));
  }

  public static void main(String[] args) {
    System.out.println(countTotalSetBits(16));
  }
}
