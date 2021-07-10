import java.util.Scanner;

public class Program {
    static String reverseString(String text) {
        String str = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            str += text.charAt(i);
        }
        return str;

    }
    public static void main(String args[]) {
        System.out.println("Pattern Searching Problem");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text");
        String text = input.nextLine();
        input.close();
        // Comparing String and Reverse String
        String reverseText = reverseString(text);
        System.out.println(text.equals(reverseText) ? "Yes" : "No"); 
        
        // Comparing first and last element 
        int start = 0;
        int end = text.length() - 1;
        boolean isPalindrome = true;
        while (start <= end){
            if (text.charAt(start) != text.charAt(end)){
                isPalindrome = false;
                break;
            }
            end--;
            start++;
        }
        System.out.println(isPalindrome ?  "Yes" : "No");

    }
}
