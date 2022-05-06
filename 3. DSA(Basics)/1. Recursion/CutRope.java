public class CutRope{
    public static int cutRope(int n, int a, int b, int c){
        if (n == 0) return 0;
        if (n < 0) return -1;
        int result = Integer.max(Integer.max(cutRope(n-a, a, b, c), cutRope(n-b, a, b, c)),cutRope(n-c, a, b, c));
        return result == -1  ? -1 : result+1;  
    }
    public static void main(String[] args) {
        System.out.println(cutRope(5, 2, 5, 1));
    }
}