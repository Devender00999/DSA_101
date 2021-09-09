public class Program3 {
    public static int sumOfNNatural(int i, int n){
        if (n == 0) return i;
        return sumOfNNatural(i+n,n-1);
    }
    public static void main(String args[]){
        System.out.println(sumOfNNatural(0, 5));
    }
}
