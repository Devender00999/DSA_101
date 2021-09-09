public class PalindromeUsingRecursion {
    public static void main(String[] args) {
        String str="abbcba/";
        System.out.println(str+" is palindrome: "+palin(str,0,str.length()-1));
    }
    // 
    // public static boolean palin(String str, int l, int r){
    //     if (l>r)
    //         return true;
    //     if (str.charAt(l) == str.charAt(r)){
    //         return palin(str,l+1,r-1);
    //     }
    //     return false;
    // }

    public static boolean palin(String str, int l, int r){
        if (l>r)
            return true;
        return (str.charAt(l) == str.charAt(r) && palin(str,l+1,r-1));
    }
}
