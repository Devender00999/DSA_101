public class Program2 {
    // Print N to 1 using recursion
    public static void printNToOne(int n){
        if (n == 0) return;
        System.out.print(n+" ");
        printNToOne(n-1);
    }
    public static void main(String args[]){
        printOneToN(5);
        System.out.println();

    }
    // Print 1 to N using recursion tail recursion
    public static void printOneToN(int i, int n){
        if (n < i) return;
        System.out.print(i+" ");
        printOneToN(i+1,n);
    }
    // Print 1 to N using recursion
    public static void printOneToN(int n){
        if (n == 0) return;
        printOneToN(n-1);
        System.out.print(n +" ");
    }
}
